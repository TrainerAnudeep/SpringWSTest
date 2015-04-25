package com.examples.service;

import com.examples.webservices.Account;

public interface AccountDetailsService {

    /**  
     * Gets the account details.  
     *  
     * @param accountNumber the account number  
     * @return the account details  
     */  
    public Account getAccountDetails(String accountNumber);  
    
}
