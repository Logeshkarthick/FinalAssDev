package com.rms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rms.bean.Customer;

import com.rms.service.CustomerService;

@RestController
@CrossOrigin(origins = "http://localhost:3000/")
@RequestMapping("/Customer")
public class CustomerController {
	
	@Autowired
	CustomerService serv;
	
	@PostMapping("/insertCustomer")
	public ResponseEntity<String> insertCustomer(@RequestBody Customer customer){
		try {
			serv.insertCustomer(customer);
			return ResponseEntity.ok("Inserted Success");
		}catch(Exception e) {
			return ResponseEntity.badRequest().body("Insertion Failure");
		}
	}
	

	@GetMapping("/findAllCustomer")
	public List<Customer> findAllCustomer(){
		return serv.findAllCustomer();
	}


}
