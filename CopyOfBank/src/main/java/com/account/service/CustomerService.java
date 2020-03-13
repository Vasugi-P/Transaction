package com.account.service;

import java.util.List;

import com.account.entities.Account;
import com.account.entities.Customer;

public interface CustomerService {
	
	Customer createCustomer(Customer customer);
	public List<Customer>getAllCustomer();
	

}
