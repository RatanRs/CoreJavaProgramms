package com.bridgelabz;

import java.util.Scanner;

/***
 * 
 * @author Admin
 *
 */

public class QuotientRemainder {
	/***
	 * 
	 * @param args
	 */

	public static void main(String[] args) {
		/*
		 * Used Scanner Class to print the input from user.
		 */

		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number ");
		int number = input.nextInt();
		int Remainder = number % 10;
		int Quotient = number / 10;
		System.out.println("Remainder is " + Remainder);
		System.out.println("Quotient is " + Quotient);
	}
}
