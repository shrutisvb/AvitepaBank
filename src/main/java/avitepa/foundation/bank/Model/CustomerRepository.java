package avitepa.foundation.bank.Model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import avitepa.foundation.bank.Model.Customer;
@Repository
public interface CustomerRepository extends CrudRepository<Customer, Long>  {

} 
