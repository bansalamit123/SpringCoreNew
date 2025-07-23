package com.rays.lifecycle;

import java.util.Hashtable;

import javax.naming.NamingException;
import javax.naming.spi.InitialContextFactory;
import javax.naming.spi.InitialContextFactoryBuilder;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class UsingInitialize implements InitializingBean, DisposableBean {

	public void afterPropertiesSet() throws Exception {
		System.out.println("after ini method will be called like that init ");

	}

	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Going to put bottom");

	}

}
