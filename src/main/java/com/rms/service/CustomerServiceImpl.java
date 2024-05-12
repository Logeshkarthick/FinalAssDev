package com.rms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rms.bean.Customer;
import com.rms.dao.CustomerDao;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	private CustomerDao dao;
	
	@Override
	public boolean insertCustomer(Customer customer) {
		
		try {
			dao.insertCustomer(customer);
			return true ;
		}
      catch(Exception e)
		{
    	  return false;
		}
		
		
	}
	
	@Override
	public List<Customer> findAllCustomer() {
		return dao.findAllCustomer();
		
		
	}
	

}
