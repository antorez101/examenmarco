package com.mx.examen.dto;

import java.util.ArrayList;
import java.util.List;

import com.mx.examen.utils.Constants;

public class Command{
	
	private int id;
	private String name;
	List<String> depencencies;
	private String output;
	private String command;
	
	
	
	
	public Command() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Command(String name, List<String> depencencies, String command) {
		super();
		this.name = name;
		this.depencencies = depencencies;
		this.command = command;
	}



	public Command(int id, String name, List<String> depencencies) {
		super();
		this.id = id;
		this.name = name;
		this.depencencies = depencencies;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public List<String> getDepencencies() {	
		return depencencies;
	}
	
	public void setDepencencies(List<String> depencencies) {
		this.depencencies = depencencies;
	}

	public String getOutput() {
//		StringBuilder sb = new StringBuilder();
//		if (this.command.equals(Constants.DEPEND)){
//			sb.append(Constants.DEPEND).append(" ");
//			sb.append(this.name).append(" ");
//			for (String dependencies : getDepencencies()){
//				sb.append(dependencies).append(" ");
//			}
//			System.out.println(sb.toString());
//		}else if (this.command.equals(Constants.INSTALL)){
//			sb.append(Constants.INSTALL).append(" ");
//			sb.append(this.name).append(" ");
//			System.out.println(sb.toString());
//			for (String dependencies : getDepencencies()){				
//				System.out.println("  installing "+dependencies);
//			}
//			System.out.println("  installing "+this.name);
//		}
//		
//		this.output = sb.toString();
		return output;
	}

	public void setOutput(String output) {
		this.output = output;
	}

	public String getCommand() {
		return command;
	}

	public void setCommand(String command) {
		this.command = command;
	}
	
	
	
	

}
