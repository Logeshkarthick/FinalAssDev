package com.rms.service;

import java.util.List;

import com.rms.bean.Restaurant;

public interface RestaurantService {
	
	public boolean addRestaurant(Restaurant restaurant);
	public List<Restaurant> findAllRestaurant();
	
	
	

}
