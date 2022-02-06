package com.q1;

public class customer {
	private String customerId;
	private String customerNmae;
	private String customerContact;
	private  Address address;
	
	
	public customer() {
		super();
		// TODO Auto-generated constructor stub
	}


	public String getCustomerId() {
		return customerId;
	}


	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}


	public String getCustomerNmae() {
		return customerNmae;
	}


	public void setCustomerNmae(String customerNmae) {
		this.customerNmae = customerNmae;
	}


	public String getCustomerContact() {
		return customerContact;
	}


	public void setCustomerContact(String customerContact) {
		this.customerContact = customerContact;
	}


	public Address getAddress() {
		return address;
	}


	public void setAddress(Address address) {
		this.address = address;
	}


	void displayInfo() {
		System.out.println(customerId+" "+customerNmae+" "+customerContact);
		System.out.println(address);
	}
	
	
	
}
