package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Example1 {
	
	public static void main(String[] args) {
		
	}
	
	WebDriver driver;
	
	@Test
	public void enterDataInTextField() {
		System.setProperty("webdriver.chrome.driver", "/Users/BlacK_BearD/eclipse-workspace/selenium/drivers/chromedriver");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys("test@gmail.com");
		driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("11111111111");
	}
	
	
}
