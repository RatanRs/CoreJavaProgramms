package com.bridgelabz;

public class HarmonicNumber {
	/***
	 * 
	 * @param args
	 */
    public static void main(String args[])
   
    {
 
        /**
         *  number= how many of values we want in a series.
         */
        int number = 3;
        double result = 0.0;
 
        System.out.println("The harmonic series is: ");
 
        /*
         * Checking the condition by using for loop.
         */
        for (int i = number; i > 0; i--) {
 
            /*
             *  calculating harmonic values
             */
            result = result + (double)1 / i;
            System.out.print(result + ", ");
        }
    }
}

