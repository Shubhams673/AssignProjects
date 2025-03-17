package com.assignment.projects;

public class Assignment6 {

	/**
	 * A bank evaluates loan applicants based on the following criteria:
		1. Credit Score:
		o If the credit score is above 750, the loan is automatically approved.
		o If the credit score is between 650 and 750, additional checks are performed.
		o If the credit score is below 650, the loan is denied.
		
		2. Income:
		o For credit scores between 650 and 750, the customer’s income must be at least $50,000
		for the loan to be considered.
		
		3. Employment Status:
		o If the customer’s income is at least 50,000, the system checks whether the customer is
		employed.
		
		o If the customer is unemployed, the loan is denied.
		4. Debt-to-Income Ratio:
		o If the customer is employed, the system checks the debt-to-income (DTI) ratio.
		o If the DTI ratio is less than 40%, the loan is approved.
		o If the DTI ratio is 40% or greater, the loan is denied.
		
		Now based on below details, print whether user is eligible to get the loan or not
		customerName = "John Doe";
		creditScore = 720;
		income = 55000.0;
		isEmployed = true;
		debtToIncomeRatio = 35.0;
	 * @param args
	 */
	
	public static void main(String[] args) {
		
		/*	customerName = "John Doe";
			creditScore = 720;
			income = 55000.0;
			isEmployed = true;
			debtToIncomeRatio = 35.0;
		 */
		
		String custName = "John Doe";
		int cScore = 720;
		double income = 55000.0;
		boolean isEmp = true;
		float dbtIncome = 35.0f;
		
		
		/*	1. Credit Score:
				o If the credit score is above 750, the loan is automatically approved.
				o If the credit score is between 650 and 750, additional checks are performed.
				o If the credit score is below 650, the loan is denied.
		*/
		if(cScore > 750) {
			
			System.out.println("The loan is automatically Approved.");
		
		} else if (cScore > 650 && cScore < 750) {
			
			System.out.println("The additional checks are Performed.");
			
			/*	2. Income:
					o For credit scores between 650 and 750, the customer’s income must be at least $50,000
			  		  for the loan to be considered.
			 */
				if(income > 50000.00) {
					
					System.out.println("The customer’s income is more, at least $50,000 for the loan getting considered.");
						
						/*
					 	 * 	3. Employment Status:
								o If the customer’s income is at least 50,000, the system checks whether the customer is
								employed.
								o If the customer is unemployed, the loan is denied.
						 */
					
							if(isEmp == true) {
								
								System.out.println("The system checks whether the customer is employed and found it is true. Employed..!!");
								
								/*
							 	 *  4. Debt-to-Income Ratio:
										o If the customer is employed, the system checks the debt-to-income (DTI) ratio.
										o If the DTI ratio is less than 40%, the loan is approved.
										o If the DTI ratio is 40% or greater, the loan is denied.
								 */
							
									if(dbtIncome < 40.0) {
										
										System.out.println("The system checks the debt-to-income (DTI) ratio. The DTI ratio is less than 40%, the loan is Approved.");
										
									} else {
										
										System.out.println("The system checks the debt-to-income (DTI) ratio. The DTI ratio is greater than 40%, the loan is Denied.");
									}
									
								
							} else {
								
								System.out.println("The system checks whether the customer is employed and found it is false. Un-Employed..!!");
							}
					
					
					
				}

		} else {
			
			System.out.println("The loan is automatically Denied.");

		}
		
		
		
	}

}
