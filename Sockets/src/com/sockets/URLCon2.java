package com.sockets;

import java.net.*;
import java.io.*;

public class URLCon2 {
	
	public static void main(String[] args){
		
	String url = "https://www.x-kom.pl/g-2/c/159-laptopy-notebooki-ultrabooki.html";
	String charset = "UTF-8";
	String param1 = "f";
	String param2 = "[manufacturers][5]=1";
	try{
	String query = String.format("param1=%s&param2=%s", URLEncoder.encode(param1, charset), 
								URLEncoder.encode(param2, charset));
	java.net.URLConnection connection = new URL(url + "?" + query).openConnection();
	connection.setDoOutput(true);
	connection.setRequestProperty("Accept-Charset", charset);
	connection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded;charset=" + charset);
	
	try (OutputStream output = connection.getOutputStream()){
		output.write(query.getBytes(charset));
	}
	
	
	} catch(IOException e){
		System.out.println("Somethig's wrong!");
	}
	
	
	}			
}
