package Basics;

import org.testng.annotations.Test;

public class dependMethods {
	
	
			@Test ()
			public void test1() {
				System.out.println("Test 1 Method");
			}
		    
			@Test 
			public void test2() {
				System.out.println("Test 2 Method");
			}
			
			
			@Test 
			public void test3() {
				System.out.println("Test 3 Method");
			}
			@Test (dependsOnMethods = "test2")
			public void test4() {
				System.out.println("Test 4 Method");
			}
			
			@Test ()
			public void test5() {
				System.out.println("Test 5 Method");
			}
		    
			@Test (dependsOnMethods = "test4")
			public void test6() {
				System.out.println("Test 6 Method");
			}
			
			
			@Test 
			public void test7() {
				System.out.println("Test 7 Method");
			}
			
			@Test (dependsOnMethods = "test6")
			public void test8() {
				System.out.println("Test 8 Method");
			}
}
