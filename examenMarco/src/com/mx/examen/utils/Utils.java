package com.mx.examen.utils;

import java.util.ArrayList;
import java.util.List;

import com.mx.examen.dto.Command;

public class Utils {
	
	
	
	public static List<String> factoryCommand(String object){
		List<String> lista = null;
		if (object != null && !object.equals("")){
			lista = new ArrayList<>();
			if (object != null && object.equals(Constants.TELNET)){
				lista.add(Constants.TCPIP);
				lista.add(Constants.NETCARD);
			}else if (object != null && object.equals(Constants.TCPIP)){			
				lista.add(Constants.NETCARD);
			}else if (object != null && object.equals(Constants.DNS)){
				lista.add(Constants.TCPIP);
				lista.add(Constants.NETCARD);
			}else if (object != null && object.equals(Constants.BROWSER)){
				lista.add(Constants.TCPIP);
				lista.add(Constants.HTML);
			}else if (object != null && object.equals(Constants.NETCARD)){
				// No tiene dependencias
			}else if (object != null && object.equals(Constants.TELNET)){
				
			}
			
		}
		return lista;		
	}

}
