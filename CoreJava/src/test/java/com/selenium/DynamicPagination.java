package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DynamicPagination {

	public static void main(String[] args) {
		WebDriverManager.firefoxdriver();
		//WebDriver driver= new FirefoxDriver();
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.jammu.com");
		driver.findElement(By.xpath("//span[text()='Data Entry']")).click();

	}

}
