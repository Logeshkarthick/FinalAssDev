package com.rms.dao;

import java.util.List;

import com.rms.bean.Customer;

public interface CustomerDao {
	
	public void insertCustomer(Customer customer);
	public List<Customer> findAllCustomer();
	
	
	
	}
