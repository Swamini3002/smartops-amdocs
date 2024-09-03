package com.customer.service;

import java.util.List;

import com.customer.model.Contact;

public interface ContactService {
	
	public List<Contact> getContactsofCustomer(Long cId);

}
