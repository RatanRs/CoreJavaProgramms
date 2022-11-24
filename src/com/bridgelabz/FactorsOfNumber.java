package com.bridgelabz;

public class FactorsOfNumber {
	/***
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
	    
	    int number = 60;

	    System.out.print("Factors of " + number + " are: ");

	    /**
	     * Used for loop to check the condition 	     
	     */
	    for (int i = 1; i <= number; ++i) {
	    	
	      if (number % i == 0) {
	        System.out.print(i + " ");
	      }
}
}
}