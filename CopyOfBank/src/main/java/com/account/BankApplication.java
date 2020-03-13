package com.account;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import com.account.entities.Account;
import com.account.entities.AccountType;
import com.account.entities.Customer;
import com.account.repository.AccountRepository;
import com.account.service.AccountService;
import com.account.service.CustomerService;




@SpringBootApplication
public class BankApplication implements CommandLineRunner {
	


	@Autowired
	private CustomerService customerService;
	
	
	

	public static void main(String[] args) {
		SpringApplication.run(BankApplication.class, args);
	}
	
	@Autowired
	private AccountService accountService;
	
	@Autowired
	private AccountRepository repo;
	
	

	@Override
	public void run(String... args) throws Exception {

		
		  /*Customer customer = new Customer("Raj", "raj@gmail.com","Ecity", "Bangalore",
		  "Karnataka", "986534282", true); 
		 
		  
		  Account account = new Account("HG0078", 800.0, true,
		  AccountType.savings); 
		 
		  
		 account.setCustomer(customer);
		 repo.save(account);*/
		 
	
		

	}

}
