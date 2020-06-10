package com.target.bank.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.target.bank.beans.Account;
import com.target.bank.service.MyService;

@RestController
public class RSController {
	@Autowired
	private MyService myService;
	
	@GetMapping("/getBalance")
	 public Account getBalance(HttpSession session) {
		 String userId=(String) session.getAttribute("userId");
		 System.out.println("session value" + userId);
		 double amount=0;
		 try {
		 amount=myService.getBalance(userId);
		 }
		 catch (DataAccessException dae) {
			 System.out.println("Error in SQL query");
		 }
		 System.out.println("AMOUNT::"+amount);
		 Account acc= new Account(userId,(String)session.getAttribute("accNum"),amount,"");
		 return acc;
	 }
	
	@PostMapping("/depositAmt")
	 public double deposit(@RequestParam("depositAmt") double amount,HttpSession session) {
		 System.out.println("amount value" +amount);
		 String userId=(String) session.getAttribute("userId");
		 System.out.println("Deposit service:::" +userId);
		 double bal=0;
		 try {
			  myService.depositAmount(amount,userId);
			  bal=myService.getBalance(userId);
		 }
		 catch (DataAccessException dae) {
			 System.out.println("Error in SQL query");
		 }
		 return bal;
		 
	 }
	
	@PostMapping("/withdrawAmt")
	 public double withdraw(@RequestParam("withdrawAmt") double amount,HttpSession session) {
		 System.out.println("amount value" +amount);
		 String userId=(String) session.getAttribute("userId");
		 System.out.println("Deposit service:::" +userId);
		 double bal=0;
		 try {
			 myService.withdrawAmount(amount,userId);
			 bal=myService.getBalance(userId);
		 }
		 catch (DataAccessException dae) {
			 System.out.println("Error in SQL query");
		 }
		 return bal;
	 }
	
	@PostMapping("/delete")
	 public void deleteAcc(HttpSession session) {
		 String userId=(String) session.getAttribute("userId");
		 System.out.println("Delete Account:::" +userId);
		 try {
			 myService.deleteAccount(userId);
		 }
		 catch (DataAccessException dae) {
			 System.out.println("Error in SQL query");
		 }
	 }
	
	
}
