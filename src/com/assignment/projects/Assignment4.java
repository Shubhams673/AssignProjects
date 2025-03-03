package com.assignment.projects;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Assignment4 {

	/* Store them all with the use of collections.
	 * UserName			Password		Seceret Code
	 * Subham			Subham123		Singh123
	 * Rahul			Rahul123		Gupta123
	 * Swapnil			Swapnil123		Sharma123
	 */
	public static void main(String[] args) {
		
		// To store all the user's Password and Seceret code only
		Map<String,String> row1 = new HashMap<String,String>();
		row1.put("UserName", "Subham");
		row1.put("Password", "Subham123");
		row1.put("SeceretCode", "Singh123");
		
		Map<String,String> row2 = new HashMap<String,String>();
		row2.put("UserName", "Rahul");
		row2.put("Password", "Rahul123");
		row2.put("SeceretCode", "Gupta123");
		
		Map<String,String> row3 = new HashMap<String,String>();
		row3.put("UserName", "Swapnil");
		row3.put("Password", "Swapnil123");
		row3.put("SeceretCode", "Sharma123");
		
		
		// check To print the Secrete Codes, Password, UserName Store in each Row of the User.
		System.out.println(row1.get("UserName"));
		System.out.println(row2.get("Password"));
		System.out.println(row3.get("SeceretCode"));
		
		
		
		// To store all the user information with their respective UserName, Password, and secrete code.
		List<Map<String,String>>  data = new ArrayList<Map<String,String>>();
		data.add(row1);
		data.add(row2);
		data.add(row3);
		
		
		// To Print the Informaiton as per the username
		System.out.println(data.get(0));
		System.out.println(data.get(1));
		System.out.println(data.get(2));
		
		
		// To print the UserName of row1 user
		System.out.println(data.get(0).get("UserName"));
				
		// To print the password of row2 user
		System.out.println(data.get(1).get("Password"));
		
		// To print the SeceretCode of row3 user
		System.out.println(data.get(2).get("SeceretCode"));
		
	}

}
