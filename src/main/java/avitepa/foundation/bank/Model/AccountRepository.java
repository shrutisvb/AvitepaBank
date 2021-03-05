package avitepa.foundation.bank.Model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import avitepa.foundation.bank.Model.Account;

@Repository
public interface AccountRepository extends CrudRepository<Account, Long>  {

}
