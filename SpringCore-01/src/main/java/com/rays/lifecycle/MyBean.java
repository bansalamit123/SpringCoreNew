package com.rays.lifecycle;

public class MyBean {

	public void destroy() {
		System.out.println("destroy method");
	}
	

	public void init() {
		System.out.println("init method");
	}


}
