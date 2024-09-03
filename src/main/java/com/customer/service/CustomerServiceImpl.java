package com.customer.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.customer.model.Customer;
@Service
public class CustomerServiceImpl implements CustomerService {

	
	@Autowired
	private ContactService contactService;
	List<Customer> list = List.of(
			new Customer(101L,"Swamini","89898989"),
			new Customer(102L,"Sanika","89675646"),
			new Customer(103L,"Tanya","89898989"),
			new Customer(104L,"Tanvi","89675646")
			);
	@Override
	public Customer getCustomer(Long id) {
		
		Optional<Customer> customer =this.list.stream().filter(cust -> cust.getCustomerId().equals(id)).findAny();
	customer.ifPresent(c -> c.setContact(contactService.getContactsofCustomer(id)));
	return customer.orElse(null);

	}

}
