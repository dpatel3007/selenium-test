package com.selenium;

import java.text.ParseException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Example21 {//alert accepting assignment
	
	WebDriver driver;

	@Test
	public void enterText() throws ParseException, InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"/Users/BlacK_BearD/eclipse-workspace/selenium/drivers/chromedriver");

		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("file:///Users/BlacK_BearD/Downloads/startbootstrap-sb-admin-2-gh-pages/pages/index.html");
		
		driver.findElement(By.xpath("//*[@id=\"side-menu\"]/li[8]/a")).click();
		driver.findElement(By.xpath("//button[text()='Try it']")).click();;
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
	}

}
