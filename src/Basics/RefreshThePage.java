package Basics;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.net.URL;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RefreshThePage {

	public static void main(String[] args) throws Exception {

		
		
		System.setProperty("webdriver.chrome.driver", "/Users/ashokravi/Desktop/Selenium Jars/chromedriver-mac-x64/chromedriver");

	           WebDriver driver = new ChromeDriver();
	    
	           driver.manage().window().maximize();
	    
	           driver.get("https://www.myntra.com/");
	           
	           Thread.sleep(3000);
	           
	          //Method-1:
	          driver.get("https://www.myntra.com/");	
	          
	           Thread.sleep(3000);
	          //And another method for get is that making the reference variable and passing the variable in to the parameter. 
	          String url = "https://www.myntra.com/"; 
	          driver.get(url);
	          
	           Thread.sleep(3000);
	          
	          //Method-2:	
	          driver.navigate().to("https://www.myntra.com/"); 
	          

	           Thread.sleep(3000);
	           
	           
              //Method-3:		
	          driver.navigate().refresh();
	          
	           Thread.sleep(3000);
	           
	           
	          //Method-4:	
	          String url3 = driver.getCurrentUrl();
	          driver.navigate().to(url3);
	          
	           
	          //Method-5:
	          URL url2 = new URL("https://www.myntra.com/");
	          driver.navigate().to(url2);
	          
	          //Method-6:
	          
	          JavascriptExecutor jse = (JavascriptExecutor)driver;
 	          jse.executeScript("window.location.reload(true)");
	          
	          //Method-7:
 	          Robot robo = new Robot();
 	          robo.keyPress(KeyEvent.VK_CONTROL);
 	          robo.keyPress(KeyEvent.VK_R);
 
 	          robo.keyRelease(KeyEvent.VK_CONTROL);
 	          robo.keyRelease(KeyEvent.VK_R);
 	        	  
 	          
	          //Method-8:
	          //Method-9:
		
		      driver.close();
	}

}
