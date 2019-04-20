package com.example.ploymorphism;

public class parentA {
	
	public void balance(int i) {
		System.out.println("balance from parent is "+i);
	}
	
	public void balance(int i, int j) {
		System.out.println("balance is "+(i+j));
	}
	public static void main(String[] args) {
		parentA obj1 = new parentA();
		obj1.balance(100);
		obj1.balance(100, 400);
	}

}
