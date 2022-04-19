package com.wipro.customer;

import java.util.Scanner;

public class Calculator {
	private static int numertwo;
	private static int numerone;
	public int numberone;
	public int numbertwo;
	
	public int add(int x,int y) {
		int res=x+y;
		return res;
	}
	public int subraction(int x,int y) {
		return x-y;
		
	}
    public double division(double x,double y) {
        return x/y;
        
    }
    public double mul(double x,double y) {
    	return x*y;
    }
    public static void main(String[] args) {
    	Calculator calculator=new Calculator();
    	Scanner scanner=new Scanner(System.in);
    	System.out.println("Enter First");
    	Calculator.numerone=scanner.nextInt();
    	System.out.println("enter second");
    	Calculator.numertwo=scanner.nextInt();
    	System.out.println("Press 1.Addition  \n2.Subraction \n3,Multiplication \n4.Division \n5.Exit");
    	System.out.println("Enter choice");
    	int choice=scanner.nextInt();
    	switch(choice) {
    	case 1:
    		int res=calculator.add(calculator.numberone, calculator.numbertwo);
    		System.out.println("add" +res);
    		break;
    		default:
    			System.out.println("thanks");
    			break;
    	}
    }
}

    
    
