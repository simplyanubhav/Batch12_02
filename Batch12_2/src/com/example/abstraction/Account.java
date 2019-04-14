package com.example.abstraction;

public abstract class Account {
	
	public String acc_holder_name="Anubhav";
	public int acc_number;
	private double acc_balance= 0;
	
//	public void checkBalance() {
//		System.out.println("Balance is "+acc_balance);
//	}
	
	public abstract void calculateInterest();
	public abstract void getAccountHolderName();
}
