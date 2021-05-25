package com.addressproblem;
import java.util.Scanner;

public class AddressBookMain {
	
	public static void main(String[] args) {
		Details c = new Details();
		System.out.println("Enter First Name:");
		c.readInput("First Name :");
		System.out.println("Enter Last Name:");
		c.readInput("First Name :");
		System.out.println("Enter Address :");
		c.readInput("First Name :");
		System.out.println("Enter City Name:");
		c.readInput("First Name :");
		System.out.println("Enter State Name:");
		c.readInput("First Name :");
		System.out.println("Enter Zip:");
		c.readInput1();
		System.out.println("Mobile Number:");
		c.readInput1();
		System.out.println("Enter Email:");
		c.readInput("First Name :");
		System.out.println("Address Book is Created, THANK YOU");
		
	}
}

class Details{
	
	String readInput(String stg)
	{
		Scanner stn = new Scanner(System.in);
		String str = stn.nextLine();
		return str;
	}
	
	long readInput1()
	{
		Scanner n = new Scanner(System.in);
		long s = n.nextLong();
		return s;	
	}
	
}

