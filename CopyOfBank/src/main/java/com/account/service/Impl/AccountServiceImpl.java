package com.account.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.account.entities.Account;

import com.account.repository.AccountRepository;
import com.account.repository.TransactionRepository;
import com.account.service.AccountService;
import com.account.entities.Transaction;

@Service
@Transactional
public class AccountServiceImpl implements AccountService {

	@Autowired
	private AccountRepository accountRepository;

	@Autowired
	private TransactionRepository transactionRepository;

	@Override
	public Account createAccount(Account account) {
		accountRepository.save(account);
		return account;
	}

	@Override
	public Account updateAccount(Account account) {

		return accountRepository.save(account);
	}

	@Override
	public void deleteAccountNumber(Long accountNumber) {
		accountRepository.deleteById(accountNumber);

	}

	@Override
	public Account getAccountByAccNum(Long accountNumber) {
		Account account = accountRepository.findByAccountNumber(accountNumber);
		return account;
	}

	@Override
	public List<Account> showAllAccounts(String isfc) {
		List<Account> account = accountRepository.findByIsfc(isfc);
		return account;
	}

	@Override public void transfer(Long fromAccount, Long toAccount, double
	  transactionAmount) { Account
	  account=accountRepository.findByAccountNumber(fromAccount);
	  if(account.getBalance()-transactionAmount<500)
	  account.setBalance(account.getBalance()-transactionAmount);
	  accountRepository.save(account); Account
	  account1=accountRepository.findByAccountNumber(toAccount);
	  account1.setBalance(account1.getBalance()+transactionAmount);
	  accountRepository.save(account1);
	  
	  
	  
	  Transaction trans=new Transaction(fromAccount, toAccount, transactionAmount, "Approved");
	  transactionRepository.save(trans);
	}

	@Override
	public Account getAllAccounts(Long accountNumber) {
		Account account = accountRepository.findByAccountNumber(accountNumber);
		return account;
	}

	@Override
	public List<Account> getAllAccount() {
		return accountRepository.findAll();

	}

}
