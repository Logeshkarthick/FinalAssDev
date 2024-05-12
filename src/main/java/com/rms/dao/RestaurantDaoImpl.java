package com.rms.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.rms.bean.Restaurant;

import jakarta.persistence.EntityManager;

@Repository
public class RestaurantDaoImpl implements RestaurantDao {
	@Autowired
	private EntityManager ent;

	@Override
	public String addRestaurant(Restaurant restaurant) {
		String msg = " ";

		try {
			ent.persist(restaurant);
			return msg = "success";
		} catch (Exception e) {
			return msg = "inserted failure";
		}

	}
  
	
	@Override
	public List<Restaurant> findAllRestaurant() {
		
		return ent.createQuery("from Restaurant").getResultList();
		
	}
}
