package com.target.bank.beans;

public class Balance {
	
	private String userId;
	private String accountnum;
	private String userName;
	
	public Balance() {
		
	}
	public String getUserId() {
		return userId;
	}
	public Balance(String userId, String accountnum, String userName) {
		super();
		this.userId = userId;
		this.accountnum = accountnum;
		this.userName = userName;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getAccountnum() {
		return accountnum;
	}
	public void setAccountnum(String accountnum) {
		this.accountnum = accountnum;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	@Override
	public String toString() { 
	    return "UserName: '" + this.userName + "', AccNum: '" + this.accountnum + "', userid: '" + this.userId + "'";
	} 
	

}
