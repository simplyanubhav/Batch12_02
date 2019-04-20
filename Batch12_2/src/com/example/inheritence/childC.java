package com.example.inheritence;

public class childC extends ParentA implements parentB {

	public void car() {
		System.out.println("child car SUV");
	}
	
	public void bike() {
		System.out.println("Bajaj Pulsor");
	}
	
	public static void main(String[] args) {
		childC objc = new childC();
		objc.car();
		objc.bike();
	}

}
