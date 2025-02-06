package hrms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WebDriverTestng {
	public WebDriver driver;

	@BeforeMethod
	public void startup() {
		driver = new ChromeDriver();
		System.out.println("Starup");
	}

	@BeforeMethod
	public void url() {
		driver.navigate().to("https://ctcorphyd.com/SureshIT/login.php");
		System.out.println("Enter url");
	}

	@Test
	public void login() {
		driver.findElement(By.name("txtUserName")).sendKeys("sureshit");
		driver.findElement(By.name("txtPassword")).sendKeys("sureshit");
		driver.findElement(By.name("Submit")).click();
		System.out.println("Login_Completed");

	}

	@AfterMethod
	public void logout() {
		driver.findElement(By.linkText("Logout"));
		System.out.println("logout");

	}
}
