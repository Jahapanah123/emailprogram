package com.driveclass.module;

import com.sonulearning.*;

import java.util.Scanner;

import com.baking.*;


public class MainClass {

	public static void main(String[] args) {
		
		Banking banking = new Banking();
		
		Customer customer = new Customer("123456", "password"); //object creation to get the value of customer class data member
		
		System.out.println(customer.getbankAccountNo());
		System.out.println(customer.getPassword());
		
		Scanner sc = new Scanner(System.in);
		
		String bankAccountNo;
		String password;
		
		System.out.println("Welcome to the login page");
		System.out.println();
		System.out.println("Enter the bank account number");
		bankAccountNo = sc.nextLine();
		
		System.out.println("Enter your password");
		password = sc.nextLine();
		
		//below line (customer.getaccount) to get the bank account
		
		if(customer.getbankAccountNo().equals(bankAccountNo) && customer.getPassword().equals(password)) {
			
			System.out.println("Welcome to the Union bank");
			
			int option;
			
			do {
				
				System.out.println();
				System.out.println("Enter the option which you want to perform");
				System.out.println("1: Deposit");
				System.out.println("2: Withdrwal");
				System.out.println("3: Transfer");
				System.out.println("0: LogOut");
				
				option = sc.nextInt();
				
				switch(option) {
				
				case 0:
					
					option = 0;
				    break;
				case 1:
					banking.deposit();
					
					break;
				case 2:
					banking.withdrawl();
					break;
				case 3:
					banking.transfer();
					break;
				
				default:
					System.out.println("Enter valid option");
				
				}
			
			}while(option != 0);
			
			
		}else {
			
			System.out.println("Invalid Account number or password");
			
		}
		
		
	}

}
