package com.jsp.polymorphysim;

public class Student {
	
	String name;
	int age;
	
	
	public void printStudentInfo(String name,int age) {
		
		System.out.println(name );
		System.out.println(age );
	}

	
	public void printStudentInfo(String name) {
		 System.out.println(name);
	}
	public void printStudentInfo(int age) {
		System.out.println(age+"is the age");
	}
	
	public static void main (String args[]) {
		
		
		Student s= new Student();
		s.name="Sir Neeraaj Kumar Paswaan";
		s.age=30;
	}
	

}
