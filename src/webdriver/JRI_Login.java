package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JRI_Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", ".\\browserDrivers\\chromedriver.exe ");
		driver = new ChromeDriver();
		driver.get("https://www.justrechargeit.com/SignIn.aspx");
		driver.findElement(By.id("txtUserName")).sendKeys("dharanitest123@gmail");
		driver.findElement(By.id("txtPasswd")).sendKeys("1245");

		
		
	}

}
