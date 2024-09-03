package com.customer.model;

import java.util.ArrayList;
import java.util.List;


public class Customer {
	private Long CustomerId;
	private String name;
	private String phone;
	
	List<Contact> contact = new ArrayList<>();

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Customer(Long customerId, String name, String phone) {
		super();
		this.CustomerId = customerId;
		this.name = name;
		this.phone = phone;
	}

	public Customer(Long customerId, String name, String phone, List<Contact> contact) {
		super();
		this.CustomerId = customerId;
		this.name = name;
		this.phone = phone;
		this.contact = contact;
	}

	public Long getCustomerId() {
		return CustomerId;
	}

	public void setCustomerId(Long customerId) {
		this.CustomerId = customerId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public List<Contact> getContact() {
		return contact;
	}

	public void setContact(List<Contact> contact) {
		this.contact = contact;
	}

}
