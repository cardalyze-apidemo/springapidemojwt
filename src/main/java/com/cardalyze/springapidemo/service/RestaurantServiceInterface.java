package com.cardalyze.springapidemo.service;

import java.util.List;

import com.cardalyze.springapidemo.model.Restaurant;

public interface RestaurantServiceInterface {

	/**
	 * Return all restaurants
	 * @return
	 */
	List<Restaurant> getAllRestaurants();

	/**
	 * Add a new restaurant
	 * @param restaurant
	 * @return
	 */
	int addRestaurant(Restaurant restaurant);

	/**
	 * Find restaurant by Id
	 * @param id
	 * @return
	 */
	Restaurant getRestaurantById(int id);

	/**
	 * Remove restaurant from the list given an Id
	 * @param id
	 */
	void deleteRestaurantById(int id);

}