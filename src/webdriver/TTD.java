package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TTD {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", ".\\browserDrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://tirupatibalaji.ap.gov.in/#/registration/");
		Thread.sleep(2000);
		driver.findElement(By.name("fName")).sendKeys("dharani");
		driver.findElement(By.name("lName")).sendKeys("kode");
		driver.findElement(By.name("mobNo")).sendKeys("1234567890");
		driver.findElement(By.name("address1")).sendKeys("abc");
		driver.findElement(By.name("cityS")).sendKeys("Khammam");
		
		Select country = new Select(driver.findElement(By.name("countryS")));
		country.selectByVisibleText("India");
		
//		driver.findElement(By.xpath("//option[@label='India']")).click();

		Select state = new Select(driver.findElement(By.name("stateS")));
		state.selectByVisibleText("Telangana");
		
//		driver.findElement(By.xpath("//option[@label='Telangana']")).click();
		
		driver.findElement(By.xpath("//option[@label='Passport ']")).click();
		driver.findElement(By.id("proofid")).sendKeys("74329864");
		driver.findElement(By.name("emailId")).sendKeys("jay_xxx@yahoo.com");
		driver.findElement(By.name("password")).sendKeys("xxyyy");
		driver.findElement(By.name("repassword")).sendKeys("xxyy");

	}

}
