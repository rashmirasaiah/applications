package com.target.bank.beans;

public class AccUser {
	
	private String userName;
	private String password;
	private String accNumber;
	private String userId;
	
	public AccUser() {
		
	}
	
	public AccUser(String userName, String password,String accNumber,String userId) {
		super();
		this.userName = userName;
		this.password = password;
		this.accNumber=accNumber;
		this.userId=userId;
	}
	
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
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


}
