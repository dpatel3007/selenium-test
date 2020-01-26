package com.selenium;

import java.text.ParseException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Example16 {

	WebDriver driver;

	@Test
	public void enterText() throws ParseException, InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"/Users/BlacK_BearD/eclipse-workspace/selenium/drivers/chromedriver");

		driver = new ChromeDriver();

		driver.get("https://www.start.ca/");

		// scroll down vertically
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0,document.body.scrollHeight)");
		Thread.sleep(2000);

		// scroll up vertically
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0,-document.body.scrollHeight)");
		Thread.sleep(2000);

		// scroll down to pixel specified
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0,1500)");
		Thread.sleep(2000);

		// scroll come back till pixel specified
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0,-1500)");
		Thread.sleep(2000);

		// scroll down till the object specified
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",
				driver.findElement(By.xpath("/html/body/section[4]/div[2]/div/div[2]/a")));
		Thread.sleep(2000);
		
		//zoom in and out
		((JavascriptExecutor) driver).executeScript("document.body.style.zoom='30%'");
		Thread.sleep(2000);
		
		((JavascriptExecutor) driver).executeScript("document.body.style.zoom='200%'");
		Thread.sleep(2000);
		
		((JavascriptExecutor) driver).executeScript("document.body.style.zoom='100%'");



	}

}
