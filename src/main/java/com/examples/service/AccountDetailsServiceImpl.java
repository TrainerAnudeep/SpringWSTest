package com.examples.service;

import org.springframework.stereotype.Service;

import com.examples.webservices.Account;
import com.examples.webservices.EnumAccountStatus;

@Service
public class AccountDetailsServiceImpl implements AccountDetailsService{

	public Account getAccountDetails(String accountNumber) {
	     /* hard coded account data - in reality this data would be retrieved  
         * from a database or back end system of some sort */  
        Account account = new Account();  
        account.setAccountNumber("12345");  
        account.setAccountStatus(EnumAccountStatus.ACTIVE);  
        account.setAccountName("Joe Bloggs");  
        account.setAccountBalance(3400);  
        return account;  
	}

}