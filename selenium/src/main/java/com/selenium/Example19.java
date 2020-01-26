package com.selenium;

import java.text.ParseException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Example19 {//access iframe

	WebDriver driver;

	@Test
	public void enterText() throws ParseException, InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"/Users/BlacK_BearD/eclipse-workspace/selenium/drivers/chromedriver");

		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("file:///Users/BlacK_BearD/Downloads/startbootstrap-sb-admin-2-gh-pages/pages/forms.html");
		
		driver.switchTo().frame(0);// used to access iframe in selenium
		//driver.switchTo().frame("String name");//another way to use iframe
		//driver.switchTo().frame(driver.findElement(By.xpath("xpath")));//another way to access iframe
		//driver.switchTo().frame(0).switchTo().frame(1);//use to access multiple iframe
		
		driver.findElement(By.xpath("/html/body/div/form/div/input[1]")).sendKeys("Dhruv");
		
		driver.switchTo().defaultContent();// use to close the access iframe in selenium

	}

}
