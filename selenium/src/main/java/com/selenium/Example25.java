package com.selenium;

import java.text.ParseException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Example25 {// enter values using keyboard and mouse event

	WebDriver driver;

	@Test
	public void enterText() throws ParseException, InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"/Users/BlacK_BearD/eclipse-workspace/selenium/drivers/chromedriver");

		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		
		WebElement firstname = driver.findElement(By.name("firstname"));
		WebElement lastname = driver.findElement(By.name("lastname"));
		WebElement email = driver.findElement(By.name("reg_email__"));
		WebElement password = driver.findElement(By.name("reg_passwd__"));
		
		Actions action = new Actions(driver);
		action.keyDown(firstname,Keys.SHIFT).sendKeys("Dhruv").keyUp(firstname,Keys.SHIFT).build().perform();
		action.keyDown(lastname,Keys.SHIFT).sendKeys("Patel").keyUp(lastname,Keys.SHIFT).build().perform();
		action.keyDown(email,Keys.SHIFT).sendKeys("dhr@gmail.com").keyUp(email,Keys.SHIFT).build().perform();
		action.keyDown(password,Keys.SHIFT).sendKeys("12345").keyUp(password,Keys.SHIFT).build().perform();

	}
}
