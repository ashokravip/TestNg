package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.safari.SafariDriver;

public class LaunchBrowser {

	public static void main(String[] args) throws InterruptedException {

		
       System.setProperty("webdriver.chrome.driver", "");
	           WebDriver driver = new SafariDriver();
	    
	           driver.manage().window().maximize();
	    
	           driver.get("https://www.myntra.com/");
	           
	           WebElement ele = driver.findElement(By.xpath("//div[@class='desktop-navLink']/a[text()='Men']"));
	   
	           Actions act = new Actions(driver);
	          
               act.moveToElement(ele).build().perform();
               Thread.sleep(6000);
               WebElement ele2 = driver.findElement(By.xpath("//a[@href='/men-sunglasses'][text()='Sunglasses & Frames']"));
               act.moveToElement(ele2).build().perform();
               driver.findElement(By.xpath("//a[@href='/men-sunglasses'][text()='Sunglasses & Frames']")).click();
               
               
               driver.findElement(By.xpath("//div[@class='vertical-filters-filters brand-container']/div[@class='filter-search-filterSearchBox']")).click();
               Thread.sleep(6000);
               driver.findElement(By.xpath("//input[@class='filter-search-inputBox']")).sendKeys("Calvin Klein");
               Thread.sleep(6000);
               
               driver.findElement(By.xpath("//label[@class='vertical-filters-label common-customCheckbox']")).click();
               Thread.sleep(6000);
               
               driver.findElement(By.xpath("//img[@class='img-responsive'][@alt='Calvin Klein Unisex Square Sunglasses with UV Protected Lens CK 21107 008 52 S']")).click();
            //   Thread.sleep(6000);
               
              // driver.switchTo().alert().dismiss();
               
               driver.findElement(By.xpath("//span[text()='WISHLIST']")).click();
				/*
				 * driver.findElement(By.xpath("//span[text()='Wishlist']")).click();
				 * 
				 * driver.findElement(By.xpath("//a[text()='MOVE TO BAG']")).click();
				 * driver.findElement(By.xpath("//button[@class='sizeselect-sizeButton']")).
				 * click();
				 * 
				 * driver.findElement(By.xpath("//div[@class='sizeselect-done']")).click();
				 */
             
               
            

              
                 
                 
	}

}