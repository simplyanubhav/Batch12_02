package com.example.ploymorphism;

public class childB extends parentA{
	
	public void balance(int i) {
		//super.balance(i);
		System.out.println("balance from child is "+i);
	}

	public static void main(String[] args) {
		
		childB objB = new childB();
		objB.balance(100);
		objB.balance(100, 400);
		
		parentA objA = new parentA();
		objA.balance(100);
		
		objA = new childB();
		objA.balance(100);
		
	}
	
}
