package com.rays.constructor;

public class Adition {
	private int a;
	private int b;
	
	public Adition(int a,int b) {
		this.a=a;
		this.b=b;
		System.out.println("value of a:"+a);
		System.out.println("value of b:"+b);
		System.out.println("Cons:int , int ");
		// TODO Auto-generated constructor stub
	}
	
	public Adition(double a,double b) {
		// TODO Auto-generated constructor stub
		this.a=(int) a;
		this.b=(int) b;
		System.out.println("Constru:double , double");
	}
	
	
	public Adition(String a,String b) {
		this.a= Integer.parseInt(a);
		this.b= Integer.parseInt(b);
		
		
		System.out.println("Constru:string , string");
		// TODO Auto-generated constructor stub
	}
	
	public void dosum() {
		System.out.println("Sum is="+(this.a+this.b));
		
		
	}
	
	/*
	 * Ambiguity problem solve: if u defind value as a string in xml file without
	 * difine data type then it allways will call string type constructor otherwise
	 * it will give value top of the order of class or you can use data type in xml
	 * file
	 */
}
