package com.example.encapsulation;

public class Account {
	
	public String acc_holder_name;
	public int acc_number;
	private double acc_balance= 0;
	
	public void checkBalance() {
		System.out.println("Balance is "+acc_balance);
	}
		
	public static void main(String[] args) {
		Account obj1 = new Account();
		obj1.acc_balance=1000;
		System.out.println(obj1.acc_balance);
	}

}
