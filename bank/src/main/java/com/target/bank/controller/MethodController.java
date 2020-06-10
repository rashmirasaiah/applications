package com.target.bank.controller;

import java.util.Random;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.target.bank.beans.AccUser;
import com.target.bank.beans.Balance;
import com.target.bank.beans.User;
import com.target.bank.service.MyService;


@Controller
public class MethodController {
	
	@Autowired
	private MyService myService;
	
	@PostMapping("/validateUser")
	 public ModelAndView validateUser(User user,HttpSession session) {
		 ModelAndView view=null ;
		 Balance bal=null;
		 try {
			 bal=myService.validateUser(user);
		 }
		 catch (DataAccessException dae) {
			 System.out.println("Error in SQL query");
			 view = new ModelAndView("/entry");
			 view.addObject("errMsg", "ERROR:User is not registered");
		 }
		 if (bal!=null && !bal.getUserName().isEmpty()) {
			  view = new ModelAndView("/home");
			  session.setAttribute("userId", user.getUserId());
			  session.setAttribute("accNum", bal.getAccountnum());
		 }
		 
		 return view;
	 }

	@PostMapping("/registration")
	 public ModelAndView registration(AccUser user,HttpSession session) {
		 System.out.println("Registration");
		 Random random = new Random();
		 Integer accNum = random.nextInt(Integer.MAX_VALUE - 345623) + 345623;
		 myService.saveNewUserAccount(user,accNum);
		 session.setAttribute("userId", user.getUserId());
		 session.setAttribute("accNum", accNum.toString());
		 ModelAndView view = new ModelAndView("home");
		 return view;
		 
	 }

}
