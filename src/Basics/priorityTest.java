package Basics;

import org.testng.annotations.Test;

public class priorityTest {

	
	
	@Test (priority =6)
	public void testa() {
		System.out.println("Executing the Test a Method");
	}
    
	@Test (priority = 0)
	public void testB() {
		System.out.println("Executing the Test b Method");
	}
	
	
	@Test 
	public void testc() {
		System.out.println("Executing the Test c Method");
	}
	@Test (priority = -567)
	public void testd() {
		System.out.println("Executing the Test d Method");
	}
	@Test (priority = 1)
	public void testg() {
		System.out.println("Executing the Test g Method");
	}
	
}
