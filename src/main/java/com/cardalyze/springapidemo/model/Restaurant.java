package com.cardalyze.springapidemo.model;

import java.util.List;

public class Restaurant {
	private int id;
	private String name;
	private int rating;
	private String city;
	private boolean parking;
	private List<Entree> menu;
	
	public Restaurant(int id, String name, int rating, String city, boolean parking, List<Entree> menu) {
		super();
		this.id = id;
		this.name = name;
		this.rating = rating;
		this.city = city;
		this.parking = parking;
		this.menu = menu;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public boolean isParking() {
		return parking;
	}
	public void setParking(boolean parking) {
		this.parking = parking;
	}
	public List<Entree> getMenu() {
		return menu;
	}
	public void setMenu(List<Entree> menu) {
		this.menu = menu;
	}
	
}
