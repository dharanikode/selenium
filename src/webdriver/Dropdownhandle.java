package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdownhandle {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", ".\\browserDrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		// clicking accept all button
		Thread.sleep(5000);
		driver.findElement(By.id("u_0_h")).click();
		// clicking create new ac
		driver.findElement(By.id("u_0_2")).click();
		Thread.sleep(5000);

		Select month_dob = new Select(driver.findElement(By.id("month")));
		month_dob.selectByVisibleText("Mar");
		
		Select day_dob = new Select(driver.findElement(By.id("day")));
		day_dob.selectByVisibleText("5");
		
		Select year_dob = new Select(driver.findElement(By.id("year")));
		 year_dob.selectByVisibleText("1990");
		
		
		// driver.findElement(By.xpath("//input[@name='gender']")))
		
		
	}

}
