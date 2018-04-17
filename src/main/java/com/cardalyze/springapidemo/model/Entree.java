package com.cardalyze.springapidemo.model;

public class Entree {
	private int id;
	private String name;
	private String cuisine;
	private boolean dinner;
	
	
	
	public Entree() {
		super();
	}

	public Entree(int id, String name, String cuisine, boolean dinner) {
		super();
		this.id = id;
		this.name = name;
		this.cuisine = cuisine;
		this.dinner = dinner;
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
	public String getCuisine() {
		return cuisine;
	}
	public void setCuisine(String cuisine) {
		this.cuisine = cuisine;
	}
	public boolean isDinner() {
		return dinner;
	}
	public void setDinner(boolean dinner) {
		this.dinner = dinner;
	}
	
}
