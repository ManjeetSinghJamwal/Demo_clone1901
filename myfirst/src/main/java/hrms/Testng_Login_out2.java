package hrms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Testng_Login_out2 {
	public WebDriver driver;
	@Test(priority=1)
	public void browser() {
		 driver=new ChromeDriver();
		System.out.println("Browser Config");
	}
	@Test(priority=2)
	public void openurl() {
		driver.navigate().to("https://ctcorphyd.com/SureshIT/login.php");
		
		System.out.println("open url");
		
	}
	@Test(priority=3)
	public void login() {
		driver.findElement(By.name("txtUserName")).sendKeys("sureshit");
		driver.findElement(By.name("txtPassword")).sendKeys("sureshit");
		driver.findElement(By.name("Submit")).click();
		System.out.println("Login_Completed");
		
	}
	@Test(priority=4)
	public void logout() throws Exception{
		driver.findElement(By.linkText("Logout")).click();
		System.out.println("logout");
		Thread.sleep(3000);
		
		
	}
	@Test(priority=5)
	public void quit() {
		driver.quit();
		System.out.println("Quit");
	}
	
	
	
		
	}


