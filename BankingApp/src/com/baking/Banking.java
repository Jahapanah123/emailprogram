package com.baking;
import java.util.Scanner;

public class Banking {
	
	Scanner sc = new Scanner(System.in);

	int balance = 1000;
	
	OTPgenreted otpg = new OTPgenreted(); //this is from OTPgenreted class and this didnt throw error bcz they are in same package,,or else inheritence would have been used.
	
	//deposit method
	
	public void deposit() {
		
		int amount;
		int otp;
		int otpGenreted;
		
		System.out.println("Enter the OTP");
		
        otpGenreted = otpg.genretedOTP(); // we made different otp class to create a method and created otpg object to call the method of OTPgenereted class and get the otp value
		
		System.out.println(otpGenreted);
		
		otp = sc.nextInt();
		
		System.out.print("Enter the amount you want to deposit");
		
		amount = sc.nextInt();
		
		if(amount>0) {
			
			balance = balance + amount;
			
			System.out.println("Your new balance is: " + balance);
			
		}else if (otp != otpGenreted){
			
			System.out.println("Invalid OTP");
			
		} else {
			
			System.out.println("Please end a valid amount to deposit");
		}
		
	}
	
	//withdrawl method
	
	public void withdrawl() {
		int amount;
		int otp;
		int otpGenreted;
		
        System.out.println("Enter the OTP");
		
        otpGenreted = otpg.genretedOTP(); // we made different otp class to create a method and created otpg object to call the method of OTPgenereted class and get the otp value
		
		System.out.println(otpGenreted);
		
		otp = sc.nextInt();
		
		System.out.print("Enter the amount you want to Withdrawl");
		amount = sc.nextInt();
		
		if(balance - amount >= 0) {
			
			System.out.println("amount " + amount + " Withdrawl Successfull");
			
			balance = balance - amount;
			
			System.out.println("Your remaining balance is:"+ balance);
			
		}else if (otp != otpGenreted){
			
			System.out.println("Invalid OTP");
			
			
		}else {
			
			System.out.println("You dont have that much balance in your account");
		}
		
		
	}
	//transfer method
	
	public void transfer() {
		
		int amount;
		int otp;
		int otpGenreted;     //now this we will get from class OPTgenreted and rest we gotta ask from user
		int bankAccountNo;
		
		System.out.println("Enter the OTP");
		
		otpGenreted = otpg.genretedOTP(); // we made different otp class to create a method and created otpg object to call the method of OTPgenereted class and get the otp value
		
		System.out.println(otpGenreted);
		
		otp = sc.nextInt();
		
		if(otp == otpGenreted) {
			
			System.out.println("OTP verification successfull");
			System.out.println();
			System.out.println("Enter the amount you want to transfer");
			amount = sc.nextInt();
			
			System.out.println("Enter the account number you want to transfer money");
			
			bankAccountNo = sc.nextInt();
			
			if(balance - amount >= 0) {
				
				System.out.println("amount " + amount + " Transfter Successfull");
				
				balance = balance - amount;
				
				System.out.println("Your remaining balance is:"+ balance);
				
			}else {
				
				System.out.println("Iinsufficient funds to transfer");
			}
			
		}else {
			
			System.out.println("Incorrect OTP " +  "please try again");
		}
		
	}
	
}
