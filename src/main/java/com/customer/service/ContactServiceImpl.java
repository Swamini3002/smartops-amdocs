package com.customer.service;

import java.util.List;
import java.util.stream.Collectors;


import org.springframework.stereotype.Service;


import com.customer.model.Contact;
import com.customer.model.Customer;
@Service
public class ContactServiceImpl implements ContactService {
	//
	List<Contact> list = List.of(
			new Contact(1L,"swamini123@gmail.com","Swamini",101L),
			new Contact(1L,"sanikaa345@gmail.com","Sanika",102L));
	
	@Override
	
	public List<Contact> getContactsofCustomer( Long cId)
	{
		return list.stream().filter(contact -> contact.getCustomerId().equals(cId)).collect(Collectors.toList());
		
	}

}
