package com.example.abstraction;

public class CurrentAccount extends Account {
	
	public void calculateInterest() {
		System.out.println(" logic to calculate "
				+ "interest of current account");
	}
	
	public void getAccountHolderName() {
		System.out.println("implementtation ");
	}

	public static void main(String[] args) {
		
				
		CurrentAccount obj2 = new CurrentAccount();
		obj2.getAccountHolderName();
		
	}
	
}
