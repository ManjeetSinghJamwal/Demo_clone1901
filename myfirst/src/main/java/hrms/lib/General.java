package hrms.lib;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class General extends Global {
//reusable_function

	public void startup() {
		driver = new FirefoxDriver();
		System.out.println("Startup");
	}

	public void openurl() {
		driver.navigate().to(url);

		System.out.println("open url");

	}

	public void login() {
		driver.findElement(By.xpath(un)).sendKeys("sureshit");
		driver.findElement(By.name(psw)).sendKeys("sureshit");
		driver.findElement(By.name(btn_login)).click();
		System.out.println("Login_Completed");

	}

	public void logout()  {
		driver.findElement(By.linkText(link_logout)).click();
		System.out.println("logout");
		
		
	}

	public void quit() {
		driver.quit();
		System.out.println("Quit");
	}

}
