package com.account.web.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.account.entities.Account;
import com.account.entities.Customer;
import com.account.formbean.AccForm;
import com.account.formbean.AccountForm;
import com.account.formbean.TransferForm;
import com.account.service.AccountService;
import com.account.service.CustomerService;

@RestController
@RequestMapping(path = "/acc")
public class AccountController {
	
	@Autowired
	private AccountService as;
	
	@Autowired
	private CustomerService cs;
		
	
	@GetMapping(path = "/account")
	public ResponseEntity<List<Account>> getAllAccount() {
		return new ResponseEntity<List<Account>>(as.getAllAccount(),HttpStatus.OK);
	}
	
	
	@GetMapping(path="/customer")
	public ResponseEntity<List<Customer>>getAllCustomer(){
		return new  ResponseEntity<List<Customer>>(cs.getAllCustomer(),HttpStatus.OK);
	}
		 
	
	
	@GetMapping(path="accountByAccNum/{accountNumber}")
	public ResponseEntity<Account>getAccByAccNum(@PathVariable(name="accountNumber")Long accountNumber){
		Account account=as.getAccountByAccNum(accountNumber);
		return new ResponseEntity<Account>(account,HttpStatus.OK);
	}
	
	@PostMapping(path="transfer",produces = MediaType.APPLICATION_JSON_VALUE
			  ,consumes = MediaType.APPLICATION_JSON_VALUE)
	  public ResponseEntity<Account>transfer(@RequestBody TransferForm transForm){
		  as.transfer(transForm.getFromAccount(), transForm.getToAccount(),transForm.getAmount());
		  return new ResponseEntity<Account>(HttpStatus.OK);
	  }
	
	
}
