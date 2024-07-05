package Basics;

import java.util.Scanner;

public class PalindromString {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a String: ");
		
		String str   = sc.nextLine();
		
		String orginalString = str.toLowerCase();
		
		String rev = "";
		
		for(int i=str.length()-1; i>=0; i--) {
			rev = rev + str.charAt(i);
		}
		
		String ignorecase = rev;
		System.out.println( "The Reverse String is "+ rev);
		
		if(orginalString.equals(ignorecase)) {
			System.out.println(orginalString + " is a Palidrome String.");
		}else{
			System.out.println(orginalString + " is Not a Palidrome String.");
		}
		
		
	}

}
