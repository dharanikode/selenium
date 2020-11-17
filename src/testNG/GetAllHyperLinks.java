package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterClass;

public class GetAllHyperLinks {
	// Create the webdriver object
	WebDriver driver;

	@AfterClass // Post-condition
	public void afterClass() {
		driver.quit();
	}

	@AfterMethod
	public void takescreenshot() throws Exception {
		// TimeStamp
		Date d = new Date();
		System.out.println(d);
		DateFormat df = new SimpleDateFormat("ddMMMyyyyHHmmss");
		String timestamp = df.format(d);
		System.out.println(timestamp);

		// Take screenshot
		String pathOfTheFolder = ".\\Screenshots\\";
		//STATUS_packageName.ClassName.MethodName.Timestamp.PNG
		// system will take screenshot and store it to RAM location
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(scrFile, new File(pathOfTheFolder + "AllLinks_" + timestamp + ".PNG"));

	}

	@Test
	public void gettheHyperLinks() {
		driver.get("https://www.justrechargeit.com");
		// Get all the hyper links
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		System.out.println("HyperLinks count:" + allLinks.size());

		// Print all link using Advance for loop ( Enhanced for loop)
		for (WebElement webElement : allLinks) {
			System.out.println(webElement.getText());
		}
	}

	@BeforeClass // Pre-condition
	public void beforeClass() {
		// Open Browser
		System.setProperty("webdriver.chrome.driver", ".\\browserDrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		// window maximize
		driver.manage().window().maximize();
	}

}
