package com.cardalyze.springapidemo.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

import com.cardalyze.springapidemo.model.Entree;
import com.cardalyze.springapidemo.model.Restaurant;

@Component
public class RestaurantService {
	private static List<Restaurant> restaurants = new ArrayList<>();

	static {
		//Initialize Data
		Entree entree1 = new Entree(1, "Chicken Marsala", "Italian", true);
		Entree entree2 = new Entree(2, "Chicken Florentine", "Italian", true);
		Entree entree3 = new Entree(3, "Fettucini Alfredo", "Italian", true);
		Entree entree4 = new Entree(4, "Pepperoni Pizza", "Italian", true);
		
		Entree entree5 = new Entree(5, "Chicken Tikka Masala", "Indian", true);
		Entree entree6 = new Entree(6, "Chicken Kadahi", "Indian", true);
		Entree entree7 = new Entree(7, "Tandoori Chicken", "Indian", true);
		Entree entree8 = new Entree(8, "Butter Naan", "Indian", true);
		Entree entree9 = new Entree(9, "Rogan Josh", "Indian", true);
		
		Entree entree10 = new Entree(10, "Avocado Burger", "American", true);
		Entree entree11 = new Entree(11, "Chicken Wings", "American", true);
		Entree entree12 = new Entree(12, "Fillet Mignon", "American", true);

		Restaurant ippolitos = new Restaurant(1, "Ippolitos",4, "Atlanta",
				true, new ArrayList<>(Arrays
						.asList(entree1, entree2, entree3, entree4)));

		Restaurant maharaja = new Restaurant(2, "Maharaja", 5, "Dunwoody",
				true, new ArrayList<>(Arrays
						.asList(entree5, entree6, entree7, entree8, entree9)));
		
		Restaurant friends = new Restaurant(3, "Friends", 5, "Suwanee",
				true, new ArrayList<>(Arrays
						.asList(entree10, entree11, entree12)));
		
		restaurants.add(ippolitos);
		restaurants.add(maharaja);
		restaurants.add(friends);
		
	}

	
	public List<Restaurant>  getAllRestaurants()
	{
		return restaurants;
	}
}
