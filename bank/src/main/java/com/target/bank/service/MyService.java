package com.target.bank.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.target.bank.beans.AccUser;
import com.target.bank.beans.Balance;
import com.target.bank.beans.User;
import com.target.bank.repository.UserRepository;

@Service
@Transactional
public class MyService {

	@Autowired
	private UserRepository userRepository;

	public void depositAmount(double amount, String userId) throws DataAccessException {

		userRepository.depositAmount(amount, userId);

	}

	public void saveNewUserAccount(AccUser user, Integer accNum) throws DataAccessException{

		userRepository.saveNewUserAccount(user,accNum);

	}

	public Balance validateUser(User user) throws DataAccessException{

		return userRepository.validateUser(user);

	}

	public double getBalance(String userId) throws DataAccessException {

		return userRepository.getBalance(userId);

	}

	public void withdrawAmount(double amount, String userId) throws DataAccessException{

		userRepository.withdrawAmount(amount, userId);

	}

	public void deleteAccount(String userId) throws DataAccessException{
		
		userRepository.deleteAccount(userId);
		
	}

}
