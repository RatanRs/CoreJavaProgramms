package com.bridgelabz;

import java.util.Random;
import java.util.Scanner;
/***
 * 
 * @author Admin
 *
 */

public class FilpCoin {
	/***
	 * 
	 * @param args
	 */
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);

	Random random=new Random();
	System.out.println("Enter number of times to flip a coin");
	int totalFlip=scanner.nextInt();
	int headFlip=0;
	int tailFlip=0;
	if(totalFlip > 0) 
	{
		for(int i=1;i<=totalFlip;i++)
		{
			int flipValue=random.nextInt(2);
			if(flipValue>0.5)
			{
				headFlip++;
			}
			else
			{
				tailFlip++;
			}
		}
	}
	else 
	{
	System.out.println(" Please Enter Positive number ");	
}
	float headPercentage=(headFlip*100)/totalFlip;
	float tailPercentage=(tailFlip*100)/totalFlip;
	System.out.println("Total number of HeadPercentage =" +headPercentage);
	System.out.println("Total number of tailPercentage =" +tailPercentage);
	System.out.println();
}

}
