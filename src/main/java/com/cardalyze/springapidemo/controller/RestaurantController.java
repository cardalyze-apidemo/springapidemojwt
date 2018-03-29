package com.cardalyze.springapidemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cardalyze.springapidemo.model.Restaurant;
import com.cardalyze.springapidemo.service.RestaurantService;

@RestController
public class RestaurantController {
	@Autowired
	private RestaurantService restaurantService;
	
	@GetMapping ("/restaurants/")
	public List<Restaurant> getAllRestaunts()
	{
		return restaurantService.getAllRestaurants();
	}
}
