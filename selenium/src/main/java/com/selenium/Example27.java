package com.selenium;

import java.text.ParseException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Example27 {// drag and drop object from one place to the other
	
	WebDriver driver;

	@Test
	public void enterText() throws ParseException, InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"/Users/BlacK_BearD/eclipse-workspace/selenium/drivers/chromedriver");

		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://jqueryui.com/droppable/");
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id='content']/iframe")));
		WebElement sourceobj = driver.findElement(By.cssSelector("#draggable"));//#is for calling id  object
		WebElement targetobj = driver.findElement(By.cssSelector("#droppable"));
		Actions action = new Actions(driver);
		action.dragAndDrop(sourceobj, targetobj).build().perform();//drag and drop method
		Assert.assertEquals(targetobj.getText(), "Dropped!");//printing the value
	}
	

}
