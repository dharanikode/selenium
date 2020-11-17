package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethods {
	public static void main(String[] args) throws InterruptedException {

		// Type UN And PWD
		// Click on Login button

		// Create the webdriver object
		WebDriver driver;

		// Open Browser
		System.setProperty("webdriver.chrome.driver", ".\\browserDrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		
		//window maximize
		driver.manage().window().maximize();

		// type URL
		driver.get("https://www.facebook.com/");
		// clicking accept all button
		Thread.sleep(5000);
		driver.findElement(By.id("u_0_h")).click();

		// get the current URL
		String homepageURL = driver.getCurrentUrl();
		System.out.println(homepageURL);


		// Click on forgot password
//		driver.findElement(By.linkText("Forgotten password?")).click();
		driver.findElement(By.partialLinkText("rd?")).click();
		
		// get the current URL
		String fppageURL = driver.getCurrentUrl();
		System.out.println(fppageURL);
		
		//navigational commands
		driver.navigate().back();
		Thread.sleep(5000);
		driver.navigate().forward();
		Thread.sleep(5000);
		driver.navigate().refresh();
		
		
		
		
	}
}
