package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Example2 {

	WebDriver driver;

	
	@Test
	public void enterText() {

		System.setProperty("webdriver.chrome.driver",
				"/Users/BlacK_BearD/eclipse-workspace/selenium/drivers/chromedriver");
		
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//*[@name='firstname']")).sendKeys("dhruv");//*[@id="u_0_f"]
		driver.findElement(By.xpath("//*[@name='lastname']")).sendKeys("patel");//*[@id="u_0_h"]
		driver.findElement(By.xpath("//*[@name='reg_email__']")).sendKeys("1234567890");//*[@id="u_0_k"]
		driver.findElement(By.xpath("//*[@name='reg_passwd__']")).sendKeys("abcdefg");//*[@id="u_0_p"]
		
		WebElement month = driver.findElement(By.xpath("//*[@id='month']"));//*[@id="month"]
		Select select = new Select(month);
		select.selectByValue("2");
		
		WebElement day = driver.findElement(By.xpath("//*[@id='day']"));//*[@id="day"]
		select = new Select(day);
		select.selectByIndex(4);
		
		WebElement year = driver.findElement(By.xpath("//*[@id='year']"));//*[@id="year"]
		select = new Select(year);
		select.selectByVisibleText("2005");


	}

}
