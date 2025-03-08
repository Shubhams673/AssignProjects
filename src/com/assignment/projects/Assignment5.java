package com.assignment.projects;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Assignment5 {

	
	/*
	 * 	1. Create a list of the top 5 most populated countries in the world and print 2nd Country
		2. Create a set of the top 10 most visited tourist attractions in the world and print out its size.
		3. Create a map of the 5 largest cities in the United States and their populations.
		4. Create an array of 10 random integers and print out the sum of 3rd and 5th Value.
		5. Create a list of the top 5 highest-grossing movies of all time and print out the third movie
		on the list.
	 */
	public static void main(String[] args) {

		// 1. Create a list of the top 5 most populated countries in the world and print 2nd Country
		
		List<String> country = new LinkedList<String>();
		country.add("NetherLands");
		country.add("India");
		country.add("Japan");
		country.add("SwitzerLand");
		country.add("Austrailia");

		System.out.println("2nd Country Name from the above stored list : " + country.get(1));
		System.out.println(country);
		
		
		
		// 2. Create a set of the top 10 most visited tourist attractions in the world and print out its size.
		Set<String> touristPlace = new TreeSet<String>();
		touristPlace.add("AmritSar");
		touristPlace.add("Darjeeling");
		touristPlace.add("Taj Mahal");
		touristPlace.add("Goa");
		touristPlace.add("Alleppey");
		touristPlace.add("Ladakh");
		touristPlace.add("GatWay Of India");
		touristPlace.add("Agra");
		touristPlace.add("Jaipur");
		touristPlace.add("AuroVille");
		
		System.out.println("Tourist Places in total : " + touristPlace.size());
		System.out.println(touristPlace);
		
		
		
		
		// 3. Create a map of the 5 largest cities in the United States and their populations.
		Map<String,Integer> usa = new HashMap<String,Integer>();
		usa.put("New York", 83456676 );
		usa.put("Los Angeles", 3443643);
		usa.put("Chicago", 45325235);
		usa.put("Housten", 353566);
		usa.put("Phoenix", 4634567);
		
		System.out.println("USA Places in total  having largest populations : " + touristPlace.size());
		System.out.println(usa);
		
		
		
		
		
		// 4. Create an array of 10 random integers and print out the sum of 3rd and 5th Value.
		List<Integer> random = new ArrayList<Integer>();
		random.add(123);
		random.add(234);
		random.add(345); //3rd
		random.add(456);
		random.add(567); //5th
		random.add(678);
		random.add(789);
		random.add(8910);
		random.add(101112);
		random.add(111213);
		
		System.out.println("The sum of 3rd -> 345 and 5th -> 567 Value. :" + random.get(2)+random.get(4));
		

		
		
		// 5. Create a list of the top 5 highest-grossing movies of all time and print out the third movie
		List<String> movie = new LinkedList<String>();
		movie.add("Pushpa2");
		movie.add("The Dark Knight");
		movie.add("Schindler's List");  //3rd Movie
		movie.add("Avatar");
		movie.add("Lord of the Rings");
		
		System.out.println("The 3rd movie from the above list is : " + movie.get(2));
		
		

	}

}
