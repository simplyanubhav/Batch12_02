package com.example.inheritence;

public class childB extends ParentA{
	
	public void greeting() {
		System.out.println("B style of greeting -- Hiiii");
	}
	
	public static void main(String[] args) {
		
		childB obj1 = new childB();
		obj1.car();
		obj1.greeting();
	}
}
