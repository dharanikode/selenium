package webdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAllHyperLinks {

	public static void main(String[] args) throws InterruptedException {
		// Create the webdriver object
		WebDriver driver;

		// Open Browser
		System.setProperty("webdriver.chrome.driver", ".\\browserDrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		// window maximize
		driver.manage().window().maximize();
		// type URL
		driver.get("https://www.justrechargeit.com");
//		//Click on Agree button
//		driver.findElement(By.xpath("//*[@id='introAgreeButton']/span/span")).click();
//		Thread.sleep(5000);
		//get the front end text using GetText() Method
//		String gmailLink = driver.findElement(By.linkText("Gmail")).getText();
//		System.out.println(gmailLink);

		
		//Get all the hyper links
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		System.out.println("HyperLinks count:"+ allLinks.size());
		
		//Print all link using Advance for loop ( Enhanced for loop)
		for (WebElement webElement : allLinks) {
			System.out.println(webElement.getText());
		}
		
		
		
	}

}
