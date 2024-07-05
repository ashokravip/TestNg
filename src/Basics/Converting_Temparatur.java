package Basics;

import java.util.Scanner;

public class Converting_Temparatur {

	public static void main(String[] args) {

		double f,c;
		
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter the Fahrenheit value--> ");
		f = sc.nextInt();
		// The Formulae for Converting Fahrenheit to Celsius 
		c = (f-32)*5/9;
		System.out.println("The Celsius Value is ---> " + c);
		
		
		c = sc.nextInt();
		// The Formulae for Converting Celsius to Fahrenheit
		
		f = (c * 9/5) + 32 ;
		
		System.out.println("The Fahrenheit Value is ---> " + f);
		
		
	}

}
