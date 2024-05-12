package com.rms.service;

import java.util.List;

import com.rms.bean.Customer;

public interface CustomerService {
	
	public boolean insertCustomer(Customer customer);
	public List<Customer> findAllCustomer();
	
	
}
