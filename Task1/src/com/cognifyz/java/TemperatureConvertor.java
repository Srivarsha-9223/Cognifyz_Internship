package com.cognifyz.java;
import java.util.Scanner;
//Temperature converter 
/*Description: Create a program that converts
temperatures between Celsius and
Fahrenheit. Prompt the user to enter a
temperature value and the unit of
measurement, and then perform the
conversion. Display the converted
temperature.
C = (f-32)*5/9;
F = (c*9/5)+32 
*/
public class TemperatureConvertor 
{
	public static void main(String[] args)
	{
		Scanner scn= new Scanner(System.in);
		float convertor;
		System.out.print("Enter the temperature : ");
		float temperature = scn.nextFloat();
		System.out.println("Choose the convertor!!");
		System.out.println("------------------------------------------");
		System.out.println("1. Celcise to Fahernheit convertor\n2. Fahernheit to Celcise convertor\n");
		System.out.print("Enter your choice : ");
		int choice = scn.nextInt();
		switch(choice)
		{
		   case 1:
			  System.out.println("Converting Celcise to Fahernheit....");
			  convertor = (temperature * 9/5) + 32;
			  System.out.println(convertor + "F");
			  break;
		   case 2:
			   System.out.println("Converting Fahernheit to Celcise....");
			   convertor = (temperature - 32) * 5/9;
			   System.out.println(convertor + "C");
		}
	}
}
