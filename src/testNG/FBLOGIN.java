package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;

public class FBLOGIN {
	// Create the webdriver object
	WebDriver driver;

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
		// system will take screenshot and store it to RAM location
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(scrFile, new File(pathOfTheFolder + "FB_" + timestamp + ".PNG"));

	}

	@Test // Test Script
	public void f() throws Exception {
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

	// String browserName = "edge";
	@Parameters("browserName")
	@BeforeClass // Pre-condition
	public void beforeClass(String browserName) {

		if (browserName.equalsIgnoreCase("Chrome")) {
			// Open chrome Browser
			System.setProperty("webdriver.chrome.driver", ".\\browserDrivers\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		} else if (browserName.equalsIgnoreCase("firefox")) {
			// Open firefox Browser
			System.setProperty("webdriver.gecko.driver", ".\\browserDrivers\\geckodriver.exe");
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
		} else if (browserName.equalsIgnoreCase("edge")) {
			// Open edge Browser
			System.setProperty("webdriver.edge.driver", ".\\browserDrivers\\msedgedriver.exe");
			driver = new EdgeDriver();
		} else if (browserName.equalsIgnoreCase("ie")) {
			// Open ie Browser
			System.setProperty("webdriver.ie.driver", ".\\browserDrivers\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		} else {
			System.out.println("Pleqase type valid browsername to open browser****");
		}

	}

	@AfterClass // Post-condition
	public void afterClass() {
		driver.quit();
	}

}
