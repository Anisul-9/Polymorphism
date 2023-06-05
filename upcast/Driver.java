package com.ops.upcast;

public class Driver {
	public static void main (String args[]) {
		Father f1=new Son();
		

		Son s =(Son)f1;
		f1.drink();
		
		
		
	}
	

}
