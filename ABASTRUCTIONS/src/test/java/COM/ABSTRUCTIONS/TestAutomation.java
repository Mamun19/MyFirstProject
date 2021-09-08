package COM.ABSTRUCTIONS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestAutomation {
	
	
	
	public static void main(String[] args) {
		// this for mac than i can get the web driver
		System.setProperty("webdriver.chrome.driver", "/Applications/chromedriver");
		
		
		WebDriver  driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//driver.getURL
		driver.get("https://www.ups.com/us/en/Home.page");
		driver.quit();
		//driver.findElement(By.xpath(""));
		//driver.quit();
		
	}

}
