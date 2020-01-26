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

public class Example24 {

	WebDriver driver;

	@Test
	public void enterText() throws ParseException, InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"/Users/BlacK_BearD/eclipse-workspace/selenium/drivers/chromedriver");

		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://jqueryui.com/checkboxradio/");
		WebElement link = driver.findElement(By.xpath("//*[@id=\"menu-top\"]/li[4]/a"));
		Actions action = new Actions(driver);
		action.keyDown(Keys.COMMAND).keyDown(Keys.SHIFT).click(link).keyUp(Keys.SHIFT).build().perform();
	}
}
