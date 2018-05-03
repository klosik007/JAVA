package com.sockets;

import java.net.*;
import java.io.*;

public class URLConnection {
	public static void main(String[] args){// do przeanalizowania i do rzezbienia
		try{
			String url = "https://www.yr.no/sted/Polen/Pommern/Gdansk";
			java.net.URLConnection con = new URL(url).openConnection();
			HttpURLConnection connection = null;
			if (con instanceof HttpURLConnection){//instanceof - sprawdzenie czy dany obiekt 
												  //nale¿y do klasy(tak to rozumiem
				connection = (HttpURLConnection) con;
			}else{
				System.out.println("Please enter an HTTP URL");
				return;
			}
			
			BufferedReader in = new BufferedReader(//odczyt
					new InputStreamReader(connection.getInputStream()));
			String urlString = "";
			String current;
			
			while((current = in.readLine()) != null){
				urlString += current;
			}
			System.out.println(urlString);
	
		}catch (IOException e){
			e.printStackTrace();
		}
	}

}
