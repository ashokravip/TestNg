package Basics;

import org.testng.annotations.Test;

public class Groups {
	
	@Test (groups= {"LoveTesting"})
	public void test1() {
		System.out.println("Executing the Love Code of I LOVE YOU is 1");
	}
    
	@Test
	public void test2() {
		System.out.println("Executing the Test 2 Method");
	}
	
	
	@Test (enabled = true)
	public void test3() {
		System.out.println("Executing the Test 3 Method");
	}
	@Test (groups = {"SmokeTesting"})
	public void test4() {
		System.out.println("Executing the Test 4 Method");
	}
}
