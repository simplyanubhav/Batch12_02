package com.example.inheritence;

public class childA extends ParentA{

	public void greeting() {
		System.out.println("hello");
	}
	
	public static void main(String[] args) {
		
		childA obj1 = new childA();
		obj1.car();
		obj1.greeting();
		
	}

}
