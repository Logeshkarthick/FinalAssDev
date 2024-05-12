package com.rms;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.rms.bean.Customer;
import com.rms.bean.Restaurant;
import com.rms.service.CustomerService;
import com.rms.service.RestaurantService;

@SpringBootTest
class HibernateApplicationTests {

	@Autowired
	 CustomerService cs1;
	
	@Autowired
	 RestaurantService rs1;
	
	@Test
	public void test_addRestaurant()
	{
		Restaurant r = new Restaurant();
	    r.setResName("loki");
	    r.setResCode("L1");
	    r.setResBranch("plmi");
	    r.setResTel("12345");
		boolean result = rs1.addRestaurant(r);
		
		assertEquals(true, result);
	}
	
	
	@Test
	public void test_findAllRestaurant()
	{
		List<Restaurant> res1 = rs1.findAllRestaurant();
		assertNotNull(res1);
	}
	
	@Test
	public void  test_addCustomer()
	{
		Customer c = new Customer();
		Restaurant r=new Restaurant();
		r.setResId(1);
		c.setCusName("vcky");
		c.setCusAge("12");
		c.setCusAddress("mdu");
		c.setCusMob("2345678");
		c.setCusPreference("ac");
		c.setRestaurant(r);
		boolean result =cs1.insertCustomer(c);
		assertEquals(true, result);
	}

	@Test
	public void test_findAllCustomer()
	{
		List<Customer> cus1 = cs1.findAllCustomer();
		assertNotNull(cus1);
	}
}
