package Basics;

import org.testng.annotations.Test;

public class enabledAndDisableTestCases {
	//@Test (enabled = false)
	
	@Test (description = "Testing the Description for the test 1 method.")
	public void test1() {
		System.out.println("Executing the First word of I LOVE YOU is 1");
	}
    
	@Test (groups= {"LoveTesting", "SmokeTesting"})
	public void test2() {
		System.out.println("Executing the LoveTesting and SmokeTesting Method");
	}
	
	
	@Test (enabled = true)
	public void test3() {
		System.out.println("Executing the Test 3 Method");
	}
	@Test(groups = {"SmokeTesting"})
	public void test4() {
		System.out.println("Executing the Test 4 Method ed");
	}
	
	
	
}
