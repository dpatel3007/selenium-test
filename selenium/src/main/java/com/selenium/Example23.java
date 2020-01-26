package com.selenium;

import java.text.ParseException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Example23 {// radio button check verify
	
	WebDriver driver;

	@Test
	public void enterText() throws ParseException, InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"/Users/BlacK_BearD/eclipse-workspace/selenium/drivers/chromedriver");

		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://jqueryui.com/checkboxradio/");
		
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		driver.findElement(By.xpath("//div[@class='widget']/fieldset/label[@for='radio-1']/span")).click();
		String className=driver.findElement(By.xpath("//div[@class='widget']/fieldset/label[@for='radio-1']")).getAttribute("class");
		System.out.println(className);
		if(className.contains("ui-checkboxradio-checked ui-state-active")) {
			Assert.assertTrue(true, "Test Example23 is PASS");
		}
		else {
			Assert.assertTrue(false, "Test Example23 is PASS");

		}
	}
	
	
}
