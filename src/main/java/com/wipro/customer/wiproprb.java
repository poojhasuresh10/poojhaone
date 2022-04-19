package com.wipro.customer;

public class customer {
	int id;
	String name,city;
	long phone;
	double salary;
	
	public void displayCustomer() {
		System.out.println("Name - " + name);
		System.out.println("City - " + city);
		System.out.println("ID - " + id);
		System.out.println("Phone - "+ phone);
		System.out.println("Salary - " + salary);
	}
	
	
	public static void main(String[] args) {
		customer dheeraj = new customer();
		dheeraj.id=101;
		dheeraj.name="Dheeraj";
		dheeraj.phone=948549722;
		dheeraj.salary=5445.54;
		dheeraj.city="chennai";
		
		dheeraj.displayCustomer();
		customer customer2=new customer();
		}}
	


