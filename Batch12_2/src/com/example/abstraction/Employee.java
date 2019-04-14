package com.example.abstraction;

public class Employee implements Person {

	public void getName() {
		System.out.println(name);
	}

	@Override
	public void getAge() {
		System.out.println(age);
}
	public static void main(String[] args) {
		Employee obj4 = new Employee();
		obj4.getName();
	}
}
