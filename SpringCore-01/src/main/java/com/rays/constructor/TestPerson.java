package com.rays.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestPerson {
	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("Person1.xml");
		Person1 p=(Person1) context.getBean("Person1");
		System.out.println(p);
		
		  Adition add=(Adition) context.getBean("add");
		  add.dosum();
		
	}

}
