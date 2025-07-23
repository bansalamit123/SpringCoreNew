package com.rays.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMyBean {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("lifecycle1.xml");

		MyBean myBean = (MyBean) context.getBean("myBean");
		

		((ClassPathXmlApplicationContext) context).close();//if you dont want use this line then you can create a object of AbstractApplicationContext and then call context.registerShutdownHook method

	}

}
