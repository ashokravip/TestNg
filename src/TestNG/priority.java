package TestNG;

import org.testng.annotations.Test;

public class priority {
	
	@Test
	public void classA() {
		System.out.println("Printing Class A METHOD ");
	}
	
	@Test
	public void classB() {
		System.out.println("Printing Class B METHOD");
	}
	@Test
	public void classC() {
		System.out.println("Printing Class C METHOD");
	}
	
	@Test (priority = -99)
	public void classD() {
		System.out.println("Printing Class D METHOD");
	}
	@Test
	public void classE() {
		System.out.println("Printing Class E METHOD");
	}
	@Test
	public void classF() {
		System.out.println("Printing Class F METHOD");
	}
	@Test
	public void classG() {
		System.out.println("Printing Class G METHOD");
	}
	@Test
	public void classH() {
		System.out.println("Printing Class H METHOD");
	}
	

}
