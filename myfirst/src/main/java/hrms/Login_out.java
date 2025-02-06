package hrms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_out {
	public WebDriver driver;

	public void startup() {
		driver = new ChromeDriver();
		System.out.println("Startup");
	}

	public void openurl() {
		driver.navigate().to("https://ctcorphyd.com/SureshIT/login.php");

		System.out.println("open url");

	}

	public void login() throws Exception {
		driver.findElement(By.name("txtUserName")).sendKeys("sureshit");
		driver.findElement(By.name("txtPassword")).sendKeys("sureshit");
		driver.findElement(By.name("Submit")).click();
		System.out.println("Login_Completed");
		Thread.sleep(3000);
	}

	public void logout() throws Exception {
		driver.findElement(By.linkText("Logout")).click();
		System.out.println("logout");
		Thread.sleep(3000);

	}

	public void quit() {
		driver.quit();
		System.out.println("Quit");
	}

	public static void main(String[] args) throws Exception {

		Login_out log = new Login_out();
		log.startup();
		log.openurl();
		log.login();
		log.logout();
		log.quit();

	}

}
