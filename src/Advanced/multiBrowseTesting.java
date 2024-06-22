package Advanced;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class multiBrowseTesting {
	
	WebDriver driver = null;
	
	@Parameters("browserName")
	@BeforeMethod
    public void setUp(String browserName) {
		System.out.println("BrowserName is : " + browserName);
		System.out.println("Thread Id is : " + Thread.currentThread().getId());
		
        if (browserName.equalsIgnoreCase("chrome")) {
    		System.setProperty("webdriver.chrome.driver", "/Users/ashokravi/Desktop/Selenium Jars/Drivers/chromedriver");
	            driver = new ChromeDriver();
        } else if (browserName.equalsIgnoreCase("firefox")) {
            System.setProperty("webdriver.gecko.driver", "/Users/ashokravi/Desktop/Selenium Jars/Drivers/geckodriver");
            driver = new FirefoxDriver();
        } else if (browserName.equalsIgnoreCase("safari")) {
            System.setProperty("webdriver.chrome.driver", "");
	            driver = new SafariDriver();
        }
        driver.manage().window().maximize();
    }

    @Test
    public void testGoogleSearch() throws Exception {
        driver.get("https://www.google.com");
        // Add your test logic here
        System.out.println("Page title is: " + driver.getTitle());
        Thread.sleep(6000);
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
            System.out.println("Test Execution completed Successfully.");
        }
    }
}
