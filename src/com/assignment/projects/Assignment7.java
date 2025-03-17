package com.assignment.projects;

import java.util.LinkedList;
import java.util.List;

public class Assignment7 {

	/**
	 * Bank Transactions
		Positive value refers Credit and Negative refers Debit Transaction
		Transactions Amount
		1 50000
		2 -2000
		3 3000
		4 -15000
		5 -200
		6 -300
		7 4000
		8 -3000
		First Store all the transactions in any data structure of Your Choice from collections, and by using
		Loops and conditional statements
		1. Print total number of credit and debit transactions completed
		2. Print the total amount credited and debited in account
		3. Print total amount remaining at the end in Bank Account
		4. If any transaction limit exceeds +/- 10000 then print the message “Suspicious credit/ debit
		Transaction with Amount” and also print total number of suspicious transactions
	 * @param args
	 */
	
	public static void main(String[] args) {
		
		/*
		 * Bank Transactions
			Positive value refers Credit and Negative refers Debit Transaction
			Transactions Amount
			1 50000
			2 -2000
			3 3000
			4 -15000
			5 -200
			6 -300
			7 4000
			8 -3000
			First Store all the transactions in any data structure of Your Choice from collections, and by using
			Loops and conditional statements
		 */
		List<Double> ls = new LinkedList<Double>();
		ls.add(50000.00);
		ls.add(-2000.00);
		ls.add(3000.00);
		ls.add(-15000.00);
		ls.add(-200.00);
		ls.add(-300.00);
		ls.add(4000.00);
		ls.add(-3000.00);
		ls.add(10000.00);

		/*
		 * 	1. Print total number of credit and debit transactions completed
			2. Print the total amount credited and debited in account
			3. Print total amount remaining at the end in Bank Account
			4. If any transaction limit exceeds +/- 10000 then print the message “Suspicious credit/ debit
			Transaction with Amount” and also print total number of suspicious transactions
		 */
		
		System.out.println("Total Number of Credit and debit Transactions Completed : " +ls.size()); // 1
		
		int susNumber = 0;
		double totalCredit= 0.0;
		double totalDebit= 0.0;
		double totalSusTrxn = 0.0;
		
		
		for( int x = 0; x < ls.size(); x++) {
			
			if(ls.get(x) > 0.0) {
				
				totalCredit = totalCredit + ls.get(x) ;
				System.out.println("Credit Transactions : " + ls.get(x));
				
				if(ls.get(x) > 10000.00) {
					
					totalSusTrxn = totalSusTrxn + ls.get(x);
					susNumber++;
					System.out.println("Suspicious credit / debit Transaction with Amount = " + ls.get(x));
					System.out.println("Total number of Suspicious transactions are : " +susNumber);        //4
				}
				
			} else if(ls.get(x) < 0.0) {
								
				totalDebit = totalDebit + ls.get(x);
				System.out.println("Debit transactions : " + ls.get(x));
				
					if(ls.get(x) < -10000.00) {
					
					totalSusTrxn = totalSusTrxn + ls.get(x);
					susNumber++;
					System.out.println("Suspicious credit / debit Transaction with Amount = " + ls.get(x));
					System.out.println("Total number of Suspicious transactions are : " +susNumber);        //4
				}
				
			} else 
				
				System.out.println("Invalid Transaction or Amount = " + ls.get(x));
			
		}
		
		
			System.out.println("Total amount Credited in your Bank Account : " + totalCredit);  //2
			System.out.println("Total amount Debited in your Bank Account : " + totalDebit);    //2
			
			System.out.println("Total amount of Suspicious Transaction : " +totalSusTrxn);		//4
			
		
		double amount = totalCredit - (-totalDebit);
		System.out.println("The total amount remaining in your Bank Account = " + amount);      //3
		
		
		
		
		
	}

}
