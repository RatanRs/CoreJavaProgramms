package com.bridgelabz;

import java.util.Scanner;
/***
 * 
 * @author Admin
 *
 */

public class PowerOfTwo {
	/***
	 * 
	 * @param args
	 */
	 public static void main(String[] args){
		 /**
		  * Used Scanner Class to take input from user.
		  */
	        Scanner input=new Scanner(System.in);
	        System.out.print("Enter the power value ");
	        double powerValue= input.nextDouble();
	        /*
	         * Initilizing with 2.
	         */
	        double number=2;
	        double table;
	        System.out.println("Table of powers of two is ");
	        /**
	         * Checking the condition by using for loop
	         */
	        for(double i=1;i<=powerValue;i++){
	        	/*
	        	 * Used Math.pow function to get the powers of 2.
	        	 */
	            table=Math.pow(number,i);
	            System.out.println(table);
	        }
	    }
	}


