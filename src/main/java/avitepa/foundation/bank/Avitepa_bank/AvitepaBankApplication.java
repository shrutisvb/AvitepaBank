package avitepa.foundation.bank.Avitepa_bank;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import avitepa.foundation.bank.Model.AccountRepository;
import avitepa.foundation.bank.Model.CustomerRepository;

@SpringBootApplication
public class AvitepaBankApplication {

	@Autowired
	private CustomerRepository customerRepository;
	@Autowired
	private AccountRepository accountRepository;
	
	public static void main(String[] args) {
		System.out.prinltn();
		SpringApplication.run(AvitepaBankApplication.class, args);
		
	}

}
