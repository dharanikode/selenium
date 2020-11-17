package webdriver;

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
import org.openqa.selenium.io.FileHandler;

public class TakeScreenshot {
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", ".\\browserDrivers\\chromedriver.exe ");
		driver = new ChromeDriver();
		driver.get("https://www.justrechargeit.com/SignIn.aspx");
		driver.findElement(By.id("txtUserName")).sendKeys("dharanitest123@gmail");
		driver.findElement(By.id("txtPasswd")).sendKeys("1245");
		//TimeStamp
		Date d = new Date();
		System.out.println(d);// Mon Oct 26 16:51:11 GMT 2020

		// ddMMyyyyHHmmss
		DateFormat df = new SimpleDateFormat("ddMMMyyyyHHmmss");
		String timestamp = df.format(d);
		System.out.println(timestamp);
		
		//Take screenshot
		String pathOfTheFolder = ".\\Screenshots\\";
		//system will take screenshot and store it to RAM location 
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(scrFile, new File(pathOfTheFolder+"JRI_"+timestamp+".PNG"));

	}
}
