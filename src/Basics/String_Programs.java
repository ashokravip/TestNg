package Basics;

import java.util.Scanner;

public class String_Programs {

	public static void main(String[] args) {
		reverseString();
		slipttingTheName();
		splittingCharacter();
		factorialNumber();
		fibonacciSeries();
		evenOrOddNumber();
		printNumbers();
		printUpperCaseletters();
		printLowerCaseLetters();
		printSpecialCharaters();
		printUpperLowerNumber();
		reverseNumber();
		Palindrome();
		
		
	}
	
	
	public static void reverseString() {

		String name = "AshokRavi";
		String rev ="";
		
		for(int i= name.length()-1; i>=0; i--) {
			rev = rev + name.charAt(i);
			
		}
		System.out.println(rev); 
		
		StringBuilder sb = new StringBuilder("987654321");
		System.out.println(sb.reverse());
		
		String name2 = "qwerty123456";
		
		StringBuffer sbf = new StringBuffer(name2);
		System.out.println(sbf.reverse());

		  System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	    }
	
	public static void slipttingTheName() {
	 String name = "AshokRavi,Pandranki,1248";
	 
	 String text[]=name.split(",");
		for(String foreach:text) {
			System.out.println(foreach);
	}
		  System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	}

	public static void splittingCharacter() {
		
		String name = "AshokRaviPandranki";
		
		String name2 = name.substring(0, 5);
		System.out.println(name2);
		String name3 = name.substring(5, 9);
		System.out.println(name3);
		String name4 = name.substring(9, 18);
		System.out.println(name4);
	}
	public static void factorialNumber() {

      int number =5;
      int factorial = 1;
      
      for(int i= number; i>=1; i--) {
    	  factorial = factorial * i;
      }
		System.out.println(factorial);
		
		  System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	}
	
	public static void fibonacciSeries() {
		
		int n1=1,n2=2,n3,i,count=6;
		System.out.print(n1 + " " + n2);
		
		for(i=3;i<count;i++) {
			n3 = n1+n2;
			System.out.print(" " + n3);
			n1=n2;
			n2=n3;  
		 }
	}

	public static void evenOrOddNumber() {
		System.out.println("      ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		int num = 234124;

		if(num%2==0) {
			System.out.println( num + " is an Even Number.");
		}else{
			System.out.println(num + " is an Odd Number." );
		}
	}
	

	public static void printUpperCaseletters() {
		String name = "AshokRavi Pandranki.";
		
		//String ch = name.replaceAll("[a-z_0-9]", "");
		
		String ch = name.replaceAll("[^A-Z]", "");
		System.out.println("Printing only the UpperCase Characters: "+ ch);
	}
	
	
	public static void printLowerCaseLetters() {
		String name = "Ashok Ravi Pandranki.";
		//String ch = name.replaceAll("[^a-z]", "");
		
		String ch = name.replaceAll("[A-Z0-9]", "");
		System.out.println("Printing only the Lower Case Characters: "+ ch);
	}
	
	
	public static void printSpecialCharaters() {
		String name = "!@#Ashok$%^Ravi&*()Pandranki.";
		String ch = name.replaceAll("[a-zA-Z_0-9]", "");
		System.out.println("Printing only the Special Characters: "+ ch);
		
	}
	
	public static void printNumbers() {
		String name ="1Ashok2Ravi4Pand0ranki89";
	//	String cha = name.replaceAll("[^0-9]", "");
		String cha = name.replaceAll("[a-zA-Z]", "");
		System.out.println("Printing only the Numbers: "+ cha);
	}
	
	
	public static void printUpperLowerNumber() {
		String name = "!1@#Ashok$%2^Ravi&3*()Pandranki4.";
		//String cha= name.replaceAll("[^\\w]", " ");
		String ch = name.replaceAll("[^a-zA-Z_0-9]", "");
		System.out.println( "Printing Upper Lower and Numbers: " + ch);
		
		System.out.println("      ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	}
	
	public static void primeOrCompositeNumber() {

		
		int num = 97;
		
		if(num<=1) {
			System.out.println("The Prime Number should start from the Number of 2.");
		}
		
		for(int i=2; i>=2;i++) {
			if(num/i==0) {
				System.out.println( num + " is an Even Number.");
			}else{
				System.out.println(num + " is an Odd Number." );
			}
		}

		
	}

	public static void reverseNumber() {
		int number = 987654, reverse = 0;  
		
		while(number != 0)   
		{  
		int remainder = number % 10;  
		reverse = reverse * 10 + remainder;  
		number = number/10;  
		}  
		System.out.println("The reverse of the given number is: " + reverse);  
		
	}
	
	public static void Palindrome() {
		int num=124321,sum =0,rmd,temp;
		
		temp =num;
		while(num>0) {
			rmd = num%10;
			sum = sum*10 + rmd ;
			num = num/10;
		}

		if(temp==sum) {
		System.out.println("The Given " + sum + " is Palindrome.");
		}else{
		System.out.println("The Given " + sum + " is Not Palindrome.");
		}
	
}
	
}
