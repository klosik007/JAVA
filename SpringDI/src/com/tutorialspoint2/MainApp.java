package com.tutorialspoint2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args){
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans2.xml");
		JavaCollection jc = (JavaCollection) context.getBean("javaCollection");
		
		jc.getAddressList();
		jc.getAddressMap();
		jc.getAddressProp();
		jc.getAddressSet();
	
	}

}
