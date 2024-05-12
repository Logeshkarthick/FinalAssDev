package com.rms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rms.bean.Restaurant;
import com.rms.dao.RestaurantDao;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class RestaurantServiceImpl implements RestaurantService{
	
	@Autowired
	private RestaurantDao dao;
	
	@Override
	public boolean addRestaurant(Restaurant restaurant) {
		
		try
		{
			dao.addRestaurant(restaurant);
			return true;
		}
	catch(Exception e)
		{
		return false;
		}
		

	}
	
	@Override
	public List<Restaurant> findAllRestaurant() {
		
		return dao.findAllRestaurant();
	}
	
	
	
	

}
