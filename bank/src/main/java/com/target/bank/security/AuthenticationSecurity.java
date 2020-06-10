package com.target.bank.security;

//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity
public class AuthenticationSecurity extends WebSecurityConfigurerAdapter{
	
	/*
	 * @Override protected void configure(HttpSecurity http) throws Exception {
	 * 
	 * http.csrf() .disable() .authorizeRequests() .antMatchers("/**") .permitAll()
	 * .anyRequest().authenticated() .and().formLogin() .loginPage("/entry")
	 * .permitAll().and() .logout() .logoutUrl("/logout")
	 * .logoutSuccessUrl("/entry") .permitAll();
	 * 
	 * 
	 * }
	 */
	 

}
