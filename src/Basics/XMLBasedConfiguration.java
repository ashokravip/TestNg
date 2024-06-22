package Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class XMLBasedConfiguration {

	
	@Test
	public static void method1() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "/Users/ashokravi/Desktop/Selenium Jars/chromedriver-mac-x64/chromedriver");

        WebDriver driver = new ChromeDriver();
 
        driver.manage().window().maximize();
 
        driver.get("https://www.myntra.com/");
        
        Thread.sleep(3000);
        
       //Method-1:
       driver.get("https://www.myntra.com/");
	}
}
