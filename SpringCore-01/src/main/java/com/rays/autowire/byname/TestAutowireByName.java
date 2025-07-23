
package com.rays.autowire.byname;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAutowireByName {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("autowire-by-name.xml");

		UserService userService = (UserService) context.getBean("userService");
		//UserService userService = context.getBean("userService",UserService.class); when you don't want to type casting 
		userService.testAdd();
	}

}
