package com.examples.services.endpoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.examples.service.AccountDetailsService;
import com.examples.webservices.Account;
import com.examples.webservices.accountservice.AccountDetailsRequest;
import com.examples.webservices.accountservice.AccountDetailsResponse;


@Endpoint
public class AccountsServiceEndpoint {

	private static final String TARGET_NAMESPACE = "http://com/examples/webservices/accountservice"; 
	
	@Autowired
	private AccountDetailsService accountsService;
	
	@PayloadRoot(localPart="AccountDetailRequest", namespace=TARGET_NAMESPACE)
	public @ResponsePayload AccountDetailsResponse getAccountDetails(@RequestPayload AccountDetailsRequest accountDetailsRequest){
		AccountDetailsResponse accountDetailsResponse = new AccountDetailsResponse();
		Account account = accountsService.getAccountDetails(accountDetailsRequest.getAccountNumber());
		accountDetailsResponse.setAccountDetails(account);
		return accountDetailsResponse;
	}
	
	public void setAccountService(AccountDetailsService accountsService){
		this.accountsService=accountsService;
	}
}
