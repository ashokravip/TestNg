package Advanced;

import org.testng.annotations.Test;

public class parallelTest {

	@Test(threadPoolSize = 3, invocationCount = 3, timeOut = 1000)
	 public void test1() throws Exception{
		 System.out.println(" I'm inside in Test 1 | " + Thread.currentThread().getId());
		 
	       
	
	}
	@Test
	 public void test2() throws Exception{
		 System.out.println(" I'm inside in Test 2 | " + Thread.currentThread().getId());
	
	 }
	
	
	@Test
	public void test3() throws Exception{
		 System.out.println(" I'm inside in Test 3 | " + Thread.currentThread().getId());
	
	}
}