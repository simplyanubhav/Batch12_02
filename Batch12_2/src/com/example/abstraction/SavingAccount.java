package com.example.abstraction;

public class SavingAccount extends Account {

	public void calculateInterest() {
		System.out.println(" logic to calculate "
				+ "interest of saving account");
	}
	
	public void getAccountHolderName() {
		System.out.println("implementtation ");
	}

	public static void main(String[] args) {
		
//		Account obj1 = new Account();
		
		SavingAccount obj2 = new SavingAccount();
		obj2.getAccountHolderName();
		
	}
	
}
