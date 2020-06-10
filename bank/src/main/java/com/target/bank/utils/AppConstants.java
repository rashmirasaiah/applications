package com.target.bank.utils;

public class AppConstants {
	
	public static final String DEPOSIT_QUERY="Update SYS.Account set Accountbal=Accountbal+? where userId=?";
	public static final String SAVE_USER_QUERY="INSERT INTO SYS.USER VALUES (?,?,?)";
	public static final String SAVE_ACCOUNT_QUERY="INSERT INTO SYS.ACCOUNT VALUES (?,?,?)";
	public static final String VALIDATE_USER_QUERY=" select user.userid,accountnum,username from SYS.user,SYS.account\n" + 
			"    where user.userid=account.userid and user.userid=? and user.password=?;";
	public static final String GET_ACC_BALANCE_QUERY="select accountbal from sys.account where userId=?";
	public static final String WITHDRAW_QUERY="Update SYS.Account set Accountbal=Accountbal-? where userId=? and accountbal>0 and accountbal>?";
	public static final String DELETE_USER_QUERY="delete from sys.user where userid=?";
	public static final String DELETE_ACC_QUERY="delete from sys.account where userid=?";
}
