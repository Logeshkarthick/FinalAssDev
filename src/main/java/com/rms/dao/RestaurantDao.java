package com.rms.dao;

import java.util.List;

import com.rms.bean.Restaurant;

public interface RestaurantDao {
	public String addRestaurant(Restaurant restaurant);
	public List<Restaurant> findAllRestaurant();
	
	

}
