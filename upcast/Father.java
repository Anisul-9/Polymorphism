package com.ops.upcast;

public class Father {
	public void eat() {
		System.out.println("veg");
	}

}

class Son extends Father{
	
	public void drink() {
		System.out.println("non veg");
		
	}
	
}
