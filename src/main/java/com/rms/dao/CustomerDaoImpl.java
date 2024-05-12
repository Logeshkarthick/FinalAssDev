package com.rms.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.rms.bean.Customer;

import jakarta.persistence.EntityManager;

@Repository
public class CustomerDaoImpl implements CustomerDao {
	
	@Autowired
	private EntityManager ent ;
	
	@Override
	public void insertCustomer(Customer customer) {
		try {
		ent.persist(customer);
		}catch(Exception e)
		{
			System.out.println(e);
		}
		
		
		
	}
	@Override
	public List<Customer> findAllCustomer() {
		
		return ent.createQuery("from Customer ").getResultList();
		
	}
	
	
}
