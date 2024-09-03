package com.customer.model;

public class Contact {
	 private Long cId;
	 private String email;
	 private String contactName;
	 
	 private Long CustomerId;

	public Contact() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Contact(Long cId, String email, String contactName, Long customerId) {
		super();
		this.cId = cId;
		this.email = email;
		this.contactName = contactName;
		this.CustomerId = customerId;
	}

	public Long getcId() {
		return cId;
	}

	public void setcId(Long cId) {
		this.cId = cId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContactName() {
		return contactName;
	}

	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

	public Long getCustomerId() {
		return CustomerId;
	}

	public void setCustomerId(Long customerId) {
		this.CustomerId = customerId;
	}

}
