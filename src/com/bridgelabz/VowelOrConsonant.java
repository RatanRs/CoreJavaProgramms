package com.bridgelabz;

import java.util.Scanner;

/***
 * 
 * @author Admin
 *
 */
public class VowelOrConsonant {
	/***
	 * 
	 * @param args
	 */

    public static void main(String[] args) {
    	/*
    	 * Used Scanner Class to take input from user.
    	 */

        Scanner input=new Scanner(System.in);
        System.out.print("Enter the alphabet ");
        char alphabet=input.next().charAt(0);
        /*
         * used switch case to check the conditions multipal times
         */
        switch(alphabet){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                System.out.println(alphabet+" is a vowel");
                break;
            default:
                System.out.println(alphabet+" is a consonant");
        }
    }
}


