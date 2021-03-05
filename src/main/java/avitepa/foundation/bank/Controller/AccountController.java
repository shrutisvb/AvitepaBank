package avitepa.foundation.bank.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import avitepa.foundation.bank.DTO.CreateAccount;
import avitepa.foundation.bank.Model.Account;
import avitepa.foundation.bank.Model.AccountRepository;
import avitepa.foundation.bank.Model.Customer;
import avitepa.foundation.bank.Model.CustomerRepository;

@RestController
public class AccountController {

	@Autowired
	private CustomerRepository customerRepository;
	@Autowired
	private AccountRepository accountRepository;
	
	@PostMapping("/create")    
    public Customer create_account(@RequestBody CreateAccount create){    
		return customerRepository.save(create.getCustomer());    
    }
	
	@RequestMapping("/getcustomer")
	public List<Customer> getAllAccounts()
	{
		
		return (List<Customer>) customerRepository.findAll();
	}


}
