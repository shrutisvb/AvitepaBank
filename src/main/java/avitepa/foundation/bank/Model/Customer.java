package avitepa.foundation.bank.Model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Table(name = "Customer")
@Entity
public class Customer implements Serializable {

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String customer_name;
	private String adhar_card;
	private List<Account> accounts;
	
	public Customer() {
		
	}
	 public Customer(long id, String customer_name, String adhar_card, List<Account> accounts) {
		super();
		this.id = id;
		this.customer_name = customer_name;
		this.adhar_card = adhar_card;
		this.accounts = accounts;
	}
	@Column(name = "cname", nullable = false)
	public String getCustomer_name() {
		return customer_name;
	}
	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}
	@Column(name = "adhar", nullable = false)
	public String getAdhar_card() {
		return adhar_card;
	}
	public void setAdhar_card(String adhar_card) {
		this.adhar_card = adhar_card;
	}
	@OneToMany(mappedBy = "customer", cascade = {
	        CascadeType.ALL})
	public List<Account> getAccounts() {
		return accounts;
	}
	public void setAccounts(List<Account> accounts) {
		this.accounts = accounts;
	}
	
}
