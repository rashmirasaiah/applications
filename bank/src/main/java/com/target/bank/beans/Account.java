package com.target.bank.beans;

public class Account {
	
	private String accNumber;
	private String userId;
	private double amount;
	private String error;
	
	public Account() {
		
	}
	
	public Account(String accNumber, String userId, double amount,String error) {
		super();
		this.accNumber = accNumber;
		this.userId = userId;
		this.amount = amount;
		this.error=error;
	}
	
	public String getAccNumber() {
		return accNumber;
	}
	
	public void setAccNumber(String accNumber) {
		this.accNumber = accNumber;
	}
	
	public String getUserId() {
		return userId;
	}
	
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public double getAmount() {
		return amount;
	}
	
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}
	

}
