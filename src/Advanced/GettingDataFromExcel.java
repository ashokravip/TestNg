package Advanced;

import java.io.FileInputStream;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GettingDataFromExcel {
	 WebDriver driver;
	 
	public static void main(String[] args) {

		String excelFilePath = "/Users/ashokravi/Documents/Excel_Files/EMP_Details.xlsx";

		System.setProperty("webdriver.chrome.driver", "/Users/ashokravi/Desktop/Selenium Jars/chromedriver-mac-x64/chromedriver");


        WebDriver driver = new ChromeDriver();
 
        driver.manage().window().maximize();
 
		/*
		 * try { // Load Excel file FileInputStream inputStream = new
		 * FileInputStream(new
		 * File("/Users/ashokravi/Documents/Excel_Files/EMP_Details.xlsx")); Workbook
		 * workbook = WorkbookFactory.create(inputStream);
		 * 
		 * // Assuming your data is in the first sheet (index 0) Sheet sheet =
		 * workbook.getSheetAt(0);
		 * 
		 * // Iterate through each row for (Row row : sheet) { // Assuming the first
		 * cell (index 0) contains the URL Cell cell = row.getCell(0); if (cell != null)
		 * { String url = cell.getStringCellValue();
		 * 
		 * // Navigate to the URL using Selenium WebDriver driver.get(url);
		 * 
		 * // Example: Find and interact with an element // Replace with your own
		 * Selenium WebDriver actions
		 * driver.findElement(By.id("username")).sendKeys("your_username");
		 * driver.findElement(By.id("password")).sendKeys("your_password");
		 * driver.findElement(By.id("login-button")).click();
		 * 
		 * // Example delay (remove in production code) Thread.sleep(2000); // Add a
		 * delay to see the action
		 * 
		 * // Perform other actions as needed } }
		 * 
		 * // Close workbook and release resources workbook.close();
		 * inputStream.close(); } catch (IOException | InterruptedException e) {
		 * e.printStackTrace(); } finally { // Close WebDriver session driver.quit(); }
		 */

	}

		
		

}
