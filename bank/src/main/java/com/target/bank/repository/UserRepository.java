package com.target.bank.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.target.bank.beans.AccUser;
import com.target.bank.beans.Balance;
import com.target.bank.beans.User;
import com.target.bank.utils.AppConstants;

@Repository
public class UserRepository {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public void depositAmount(double amount, String userId) {

		jdbcTemplate.update(AppConstants.DEPOSIT_QUERY, amount, userId);

	}

	public void saveNewUserAccount(AccUser user, Integer accNum) {

		jdbcTemplate.update(AppConstants.SAVE_USER_QUERY, user.getUserId(), user.getUserName(), user.getPassword());
		jdbcTemplate.update(AppConstants.SAVE_ACCOUNT_QUERY, user.getUserId(), accNum, 0.0);

	}

	public Balance validateUser(User user) {
		System.out.println("Userid value::" + user.getUserId() + "::password" + user.getPassword());
		Balance bal;
		bal =  jdbcTemplate.queryForObject(AppConstants.VALIDATE_USER_QUERY,
						new Object[] { user.getUserId(), user.getPassword() }, (rs, rowNum) ->
			            new Balance(
			                    rs.getString("userid"),
			                    rs.getString("accountnum"),
			                    rs.getString("username")
			            ));
				System.out.println(bal.toString());
		return bal;
		
	}

	public double getBalance(String userId) {
		Long value = jdbcTemplate.queryForObject(AppConstants.GET_ACC_BALANCE_QUERY, new Object[] { userId },
				Long.class);

		return value;

	}

	public void withdrawAmount(double amount, String userId) {

		jdbcTemplate.update(AppConstants.WITHDRAW_QUERY, amount, userId, amount);

	}

	public void deleteAccount(String userId) {
		
		jdbcTemplate.update(AppConstants.DELETE_USER_QUERY,new Object[] {userId}); 
		jdbcTemplate.update(AppConstants.DELETE_ACC_QUERY,new Object[] {userId}); 
		
	}
	
	

}
