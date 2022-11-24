package com.bridgelabz;

import java.util.Scanner;

/***
 * 
 * @author Admin
 *
 */
public class LeapYear{
	/***
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * Used Scanner Class to take input from user.
		 */
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the value of the year ");
		int year = input.nextInt();
	/**
	 * Checking the condition by using if else condition.
	 */
		if (year % 400 == 0) {
			System.out.println(year + " is a leap year");
		} else if (year % 4 == 0 && year % 100 != 0) {
			System.out.println(year + " is a leap year");
		} else {
			System.out.println(year + " is not a leap year");
		}
	}

}
	

