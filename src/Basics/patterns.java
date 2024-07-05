package Basics;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

public class patterns {

	public static void main(String[] args) throws AWTException {
		letter_I();
		letter_L();
		letter_O();
		letter_V();
		letter_E();
		letter_Y();
		letter_O();
		letter_U();
		letter_S();
		letter_A();
		letter_D();
		letter_H();
		letter_R();
		letter_I();
		letter_K();
		letter_A();

	}
	
	public static void letter_C() {
		
		  for(int i=1;i<=7;i++) {
	            for(int j=1;j<=5;j++) {
	            	
	            	if( j==1 && i!=1 && i!=7 || i==1 && j!=1 || i==7 && j!=1 ) {
	            	
	               //   if( j==1 && i>1 && i<7 || i==1 && j>1 || i==7 && j>1 ) {
	                	  
		                    System.out.print("*");
	                  }else {
	                	  System.out.print(" "); 
	                  }
	            }
	            System.out.println();
	        }
		  System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	    }
	public static void letter_L() {
		
		for(int i=1; i<=7; i++){
			for(int j=1;j<=5;j++) {
				
				if(j==1 || i==7 ) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		  System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");		
	}
	
	
	public static void letter_B() {
		
		for(int i=1; i<=7; i++){
			for(int j=1;j<=5;j++) {
				
				if(i==1 && j!=5 || i==4 && j!=5 || i==7 && j!=5 || j==1 || j==5 && i!=1 && i!=4 && i!=7 ) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		  System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	}
	
	public static void letter_S() {
		
		for(int i=1; i<=7; i++){
			for(int j=1;j<=5;j++) {
				
				if(i==1 && j!=1 || i==4 && j!=1 && j!=5 || i==7 && j!=5 || j==1 && i>1 && i<4 || j==5 && i>4 && i<7) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		  System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");		
	}
	public static void letter_A() {
		
		for(int i=1; i<=7; i++){
			for(int j=1;j<=5;j++) {
				
				if(j==1 && i!=1 || j==5 && i!=1 || i==1 && j!=1 && j!=5 || i==4  ) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		  System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");		
	}
	
	public static void letter_I() {
		
		for(int i=1; i<=7; i++){
			for(int j=1;j<=5;j++) {
				
				if(i==1 || i==7 || j==3 ) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		  System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");		
	}
	public static void letter_O() {
		
		for(int i=1; i<=7; i++){
			for(int j=1;j<=5;j++) {
				
				if(j==1 && i!=1 && i!=7 || j==5 && i!=1 && i!=7  || i==1 && j!=1 && j!=5 || i==7 && j!=1 && j!=5) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		  System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");		
	}
	public static void letter_V() {
		
		for(int i=0;i<7;i++) {
            for(int j=0;j<13;j++) {
                if(j-i==0 || j+i==12 ) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		  System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");		
	}
	public static void letter_E() {
		
		for(int i=1; i<=7; i++){
			for(int j=1;j<=5;j++) {
				
				if(j==1 || i==1 || i==4 || i==7 ) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		  System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");		
	}
	public static void letter_Y() {
		
		for(int i=1; i<=7; i++){
			for(int j=1;j<=5;j++) {
				
				if(j-i==0 && i<=3|| j+i==6 && i<=3 || j==3 && i>=3) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		  System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");		
	}
	public static void letter_U() {
		
		for(int i=1; i<=7; i++){
			for(int j=1;j<=5;j++) {
				
				if(j==1 && i!=7 || j==5 && i!=7 || i==7 && j!=1 && j!=5) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		  System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");		
	}
	public static void letter_D() {
		
		for(int i=1; i<=7; i++){
			for(int j=1;j<=5;j++) {
				
				if(j==1 || i==1 && j!=5 || i==7 && j!=5  || j==5 && i!=1 && j!=7 ) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		  System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");		
	}
	public static void letter_H() {
		
		for(int i=1; i<=7; i++){
			for(int j=1;j<=5;j++) {
				
				if(j==1 || j==5 || i==4) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		  System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");		
	}
	public static void letter_R() {
		
		for(int i=1; i<=7; i++){
			for(int j=1;j<=5;j++) {
				
				if(j==1 || i==1 && j!=5 || i==4 && j!=5  || j==5 && i!=1 && i!=4 ) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		  System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");		
	}
	public static void letter_K() {
		
		for(int i=1; i<=7; i++){
			for(int j=1;j<=5;j++) {
				
				if(j==1 || i+j==6 || j-i==-2) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		  System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");		
	}
	

	
	
	/*
	 * public static void heart_SA() {
	 * 
	 * for(int i=0; i<=5; i++){ for(int j=1;j<=6;j++) {
	 * 
	 * if() { System.out.print("*"); }else { System.out.print(" "); } }
	 * System.out.println(); } System.out.println(
	 * "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"
	 * ); }
	 */

}