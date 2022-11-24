package com.bridgelabz;

import java.util.Scanner;

public class LargestOfThreeNumber {
	public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the first number ");
        int number1=input.nextInt();
        System.out.print("Enter the second number ");
        int number2=input.nextInt();
        System.out.print("Enter the third number ");
        int number3=input.nextInt();
        if(number1==number2 && number1==number3){
            System.out.println("All the three numbers are equal");
        }
        else if(number1>number2 && number1>number3){
            System.out.println(number1+" is greater then both "+number2+" and "+number3);
        }
        else if(number2>number1 && number2>number3){
            System.out.println(number2+" is greater then both "+number1+" and "+number3);
        }
        else{
            System.out.println(number3+" is greater then both "+number1+" and "+number2);
        }
    }
}


