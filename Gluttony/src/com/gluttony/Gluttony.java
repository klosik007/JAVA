package com.gluttony;

import java.util.*;

public class Gluttony {
	
	public static void main(String[] args){
		//int packages=0;//ilosc kompletow danych
		int num_contest=0; //ilosc uczestnikow
		int cookies_in_box;//ilosc ciastek w pude³ku
		int t[]; //czas na zjedzenie jednego ciastka
		double cookies[];//ilosc ciastek zjedzonych przez uczestnika
		double boxes=0; //ilosc pudelek
		Scanner sc = new Scanner(System.in);
		//packages = sc.nextInt();
		num_contest = sc.nextInt();
		cookies_in_box = sc.nextInt();
		t = new int[num_contest];
		cookies = new double[num_contest];
		for (int i=0; i<num_contest;i++){
			t[i]= sc.nextInt();
			cookies[i] = 86400/t[i];
			boxes += cookies[i]/cookies_in_box; 
		}
		System.out.println((int)Math.ceil(boxes));			
		}		
}