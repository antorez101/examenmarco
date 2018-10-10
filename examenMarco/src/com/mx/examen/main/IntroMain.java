package com.mx.examen.main;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.mx.examen.dto.Command;
import com.mx.examen.utils.Constants;
import com.mx.examen.utils.Utils;

public class IntroMain {
	
	static List<String> installed = new ArrayList<>();
	static String name;
	static String comando;
	static List<String> dependecias = new ArrayList<>();
	
	
	public static void main(String[] args){
		
		 File file = 
			      new File("src\\proga.dat"); 
			    Scanner sc = null;
				try {
					sc = new Scanner(file);
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} 
				String a = null;
			    while (sc.hasNextLine()){
			    	
			    	a = sc.nextLine();
			    	//System.out.println(a);
			    	String[] splited = a.split("\\s+");
			    	//System.out.println(splited[0] +"-"+splited[1]);
			    	if (splited.length > 1){
			    		salida(splited[0], splited[1]);
			    		
			    	}else if (splited.length == 1 && splited[0].equals("END")){
			    		System.out.println(Constants.END);
			    	}
			    	
					
					
			    }  
		
		
		//salida(Constants.NETCARD, Constants.INSTALL);
		
		//salida(Constants.TELNET, Constants.INSTALL);
		
		//salida(Constants.FOO, Constants.INSTALL);
		
		
		
	}
	
	
	
	public static void salida(String command, String nombre){
		
		
		dependecias = new ArrayList<>();
		dependecias = Utils.factoryCommand(nombre);
		
		if (command.equals(Constants.INSTALL)){
			installed.add(nombre);
			for (String com : installed){
				dependecias.remove(com);
				
			}		
			addRemove(nombre, command, dependecias);
			
		}else{
			addRemove(nombre, command, dependecias);
		}
		Command command3 = new Command(nombre, dependecias, command);
		command3.getOutput();
		
	}
	
	public static void addRemove(String name, String command, List<String> dependecias){
		StringBuilder sb = new StringBuilder();
		if (command.equals(Constants.DEPEND)){
			sb.append(Constants.DEPEND).append(" ");
			sb.append(name).append(" ");
			for (String dependencies : dependecias){
				sb.append(dependencies).append(" ");
			}
			System.out.println(sb.toString());
		}else if (command.equals(Constants.INSTALL)){
			sb.append(Constants.INSTALL).append(" ");
			sb.append(name).append(" ");
			System.out.println(sb.toString());
			for (String dependencies : dependecias){				
				System.out.println("  installing "+dependencies);
				installed.add(dependencies);
			}
			System.out.println("  installing "+name);
		}
	}

}
