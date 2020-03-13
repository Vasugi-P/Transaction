package com.account.service;

import java.util.List;

import com.account.entities.Account;
import com.account.entities.Customer;
import com.account.service.Exception.NotSufficientAmountException;

public interface AccountService {
	Account createAccount(Account account);
	Account updateAccount(Account account);
	public void deleteAccountNumber(Long accountNumber);
	
	Account getAllAccounts(Long accountNumber);
	
	public List<Account> getAllAccount();
	public List<Account>showAllAccounts(String isfc);
	Account getAccountByAccNum(Long accountNumber);
	
	
	
	void transfer(Long fromAccount,Long toAccount, double transactionAmount) ;
}
