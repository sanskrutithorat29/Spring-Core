package com.XMLConfigurationCustomer;

public class Customer {
	private int id;
	private String name;
	private String address;
	private int total_bill;
	
	public Customer() {
		
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", address=" + address + ", bill=" + total_bill + "]";
	}

	public Customer(int id, String name, String address, int total_bill) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.total_bill = total_bill;
	}

	
}
