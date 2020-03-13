package com.account.formbean;

import com.account.entities.AccountType;
import com.account.entities.Customer;

public class AccountForm {
	
	private String isfc;
	private double balance;
	private boolean active;
	private AccountType account;
	private Customer customer;
	
	
	
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public String getIsfc() {
		return isfc;
	}
	public void setIsfc(String isfc) {
		this.isfc = isfc;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	public AccountType getAccount() {
		return account;
	}
	public void setAccount(AccountType account) {
		this.account = account;
	}
	
	
	

}
