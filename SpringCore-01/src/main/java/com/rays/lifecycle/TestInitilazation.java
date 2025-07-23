package com.rays.lifecycle;

import javax.swing.AbstractAction;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestInitilazation {
	public static void main(String[] args) {

		AbstractApplicationContext context = new ClassPathXmlApplicationContext("lifecycle1.xml");

		UsingInitialize u= (UsingInitialize) context.getBean("UsingIn");
		System.out.println(u);
		context.registerShutdownHook();
		


	}


}
