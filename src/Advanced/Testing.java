package Advanced;

import org.testng.annotations.Test;

public class Testing {

	
	@Test (priority =0)
	public void methodTesting1() {
		System.out.println("Testing Method Type->1");
	}
	
	@Test
	public void methodTesting2() {
		System.out.println("Testing Method Type->2");
	}		
	@Test
	public void methodTesting5() {
		System.out.println("Testing Method Type->5");
		}
	@Test
	public void methodTesting3() {
		System.out.println("Testing Method Type->3");
	}
	@Test 
	public void methodTesting4() {
		System.out.println("Testing Method Type->4");
	}
	
	

	@Test
	public void methodTesting6() {
		System.out.println("Testing Method Type->6");
	}
}
