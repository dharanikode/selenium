package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FB_Login {

	public static void main(String[] args) throws InterruptedException {
		// Create the webdriver object
		WebDriver driver;

		// Open Browser
		System.setProperty("webdriver.chrome.driver", ".\\browserDrivers\\chromedriver.exe");
		driver = new ChromeDriver();

		// window maximize
		driver.manage().window().maximize();

		// type URL
		driver.get("https://www.facebook.com/");
		// clicking accept all button
		Thread.sleep(5000);
		driver.findElement(By.id("u_0_h")).click();

		driver.findElement(By.id("email")).sendKeys("Dharani123@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("12345");
		Thread.sleep(10000);
		driver.findElement(By.id("u_0_k")).click();
		Thread.sleep(5000);

		driver.findElement(By.name("login")).click();

	}

}
