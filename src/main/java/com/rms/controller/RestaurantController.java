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

import com.rms.bean.Restaurant;
import com.rms.service.RestaurantService;

@RestController
@CrossOrigin(origins = "http://localhost:3000/")
@RequestMapping("/Restaurant")
public class RestaurantController {
	
	@Autowired 
	RestaurantService serv;
	
	@PostMapping("/insertRestaurant")
	public ResponseEntity<String> insertRestaurant(@RequestBody Restaurant restaurant){
		try {
			serv.addRestaurant(restaurant);
			return ResponseEntity.ok("Inserted Success");
		}catch(Exception e) {
			return ResponseEntity.badRequest().body("Insertion Failure");
		}
	}
	
	@GetMapping("/findAllRestaurant")
	public List<Restaurant> findAllRestaurant(){
		return serv.findAllRestaurant();
		
	}

}
