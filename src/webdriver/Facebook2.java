package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook2 {

public static void main(String[] args) throws InterruptedException {
		
		
		//Type UN And PWD
		//Click  on Login button
		
		//Create the webdriver object
		WebDriver driver;
		
		//Open Browser
		System.setProperty("webdriver.chrome.driver", ".\\browserDrivers\\chromedriver.exe");
		driver =  new ChromeDriver();
		
		//type URL
		driver.get("https://www.facebook.com/");
		//clicking accept all button
		Thread.sleep(5000);
		driver.findElement(By.id("u_0_h")).click();
		//clicking create new ac
		driver.findElement(By.id("u_0_2")).click();
		Thread.sleep(5000);
		//Entering first name
		driver.findElement(By.name("firstname")).sendKeys("Dharani");
		//Entering Surname
		driver.findElement(By.name("lastname" )).sendKeys("kode");
		//Entering mobile no
		driver.findElement(By.name("reg_email__")).sendKeys("1234567890");
		//Entering new password
		driver.findElement(By.name("reg_passwd__")).sendKeys("jay20");
		//Entering Female gender
		driver.findElement(By.id("u_1_2")).click();

	}

}
