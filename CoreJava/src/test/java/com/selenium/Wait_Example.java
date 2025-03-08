package com.selenium;

import java.lang.classfile.instruction.ExceptionCatch;
import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait_Example {

	private static Class<? extends Throwable> NoSuchElementException;

	public static void implicitWait() {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.com");
		System.out.println(driver.getPageSource());
		driver.quit();
	}

	public static void explicitWait() {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com");
		driver.findElement(By.id("APjFqb")).sendKeys("scrolltest" + Keys.ENTER);
		// WebElement elementResult=new WebDriverWait(driver,
		// Duration.ofSeconds(10)).until(ExceptionCatch.of())
		WebElement elementResult = new WebDriverWait(driver, Duration.ofSeconds(10))
				.until(ExpectedConditions.visibilityOfElementLocated(By.id("elementId")));

	}

//public void fluentWait() {
//	 WebDriver driver = // Initialize WebDriver
//		        
//		     //   Wait<WebDriver> wait = new FluentWait<>(driver)
//		            .withTimeout(Duration.ofSeconds(30))  // Maximum wait time
//		            .pollingEvery(Duration.ofSeconds(5)) // Check every 5 seconds
//		            .ignoring(NoSuchElementException.class); // Ignore exceptions
//		        
//		        WebElement element = wait.until(new Function<WebDriver, WebElement>() {
//		            public WebElement apply(WebDriver driver) {
//		                return driver.findElement(By.id("elementId"));
//		            }
//		        });
//
//		        element.click();
//		    }
//
//	}

	public static void main(String[] args) {
		// implicitWait();
		explicitWait();
	}

}
