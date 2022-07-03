package com.sonulearning;

public class Customer {
	
	private String bankAccountNo;
	private String password;
	
	
	public Customer(String bankAccountno, String password) {
		this.bankAccountNo = bankAccountno;
		this.password = password;
	}

	public void setbankAccountNo(String bankAccountNo) {
		
		this.bankAccountNo = bankAccountNo;
	}
	
	public String getbankAccountNo() {
		
		return bankAccountNo;
	}
	
public void setPassword(String password) {
		
		this.password = password;
	}
	
	public String getPassword() {
		
		return password;
	}
}
