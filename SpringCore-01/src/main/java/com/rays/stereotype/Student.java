package com.rays.stereotype;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
	//@Component("student") we can pass object using that way it's optional 
	//Student student=new Student(); @Component create object like that type
	@Value("Amit")
	private String studentName;
	@Value("Gwalior")
	private String city;
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getCity() {
		return city;
		
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", city=" + city + "]";
	}
	

}
