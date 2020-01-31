package com.selenium;

import java.text.ParseException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Example15 {
	
	WebDriver driver;

	@Test
	public void enterText() throws ParseException, InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"/Users/BlacK_BearD/GIT/selenium-test/selenium/drivers/chromedriver");

		driver = new ChromeDriver();
		driver.get("https://www.monsterindia.com/seeker/registration");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//**************************************//
		//to highlight object in selenium
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('style','background: yellow; border: 2px solid red;');",driver.findElement(By.xpath("//*[@name=\'fullname\']")));
		Thread.sleep(2000);
		
		//**************************************//

		////*[@id=\'registerThemeDefault\']/div/div[3]/div/div/div/form/div[2]/div[2]/div/input
		////*[@id="registerThemeDefault"]/div/div[3]/div/div/div/form/div[2]/div[6]/div/div[1]/div/div[1]/span
		//span[@class='multiselect__single modal-ref-class single-selected textWrapperBold']
		
		driver.findElement(By.xpath("//*[@name=\'fullname\']")).sendKeys("Full Name");
		driver.findElement(By.xpath("//input[@placeholder='Enter your Email Id']")).sendKeys("dhruv@start.ca");
		driver.findElement(By.xpath("//*[@name=\'Password\']")).sendKeys("123@abc");
		driver.findElement(By.xpath("//*[@name=\'Mobile Number\']")).sendKeys("0234567890");
		Thread.sleep(2000);
		
		//location
		driver.findElement(By.xpath("//*[@id=\'registerThemeDefault\']/div/div[3]/div/div/div/form/div[2]/div[6]/div/div[1]/div/div[1]/span")).click();
		driver.findElement(By.xpath("//input[@placeholder='Search Location']")).sendKeys("Vadodara");
		//driver.findElement(By.xpath("//span[@class='multiselect__single modal-ref-class single-selected textWrapperBold']"));
		driver.findElement(By.xpath("//*[@id=\'registerThemeDefault\']/div/div[3]/div/div/div/form/div[2]/div[6]/div/div[1]/div/div[2]")).click();
		Thread.sleep(2000);
		
		//experience
		driver.findElement(By.xpath("//*[@id=\'registerThemeDefault\']/div/div[3]/div/div/div/form/div[2]/div[7]/div/div/div/div/div/div[1]")).click();
		driver.findElement(By.xpath("//*[@id=\'registerThemeDefault\']/div/div[3]/div/div/div/form/div[2]/div[7]/div/div/div/div/div/div[3]/ul/li[3]/span/span")).click();
		driver.findElement(By.xpath("//*[@id=\'registerThemeDefault\']/div/div[3]/div/div/div/form/div[2]/div[7]/div/div[2]/div/div/div/div[1]")).click();
		driver.findElement(By.xpath("//*[@id=\'registerThemeDefault\']/div/div[3]/div/div/div/form/div[2]/div[7]/div/div[2]/div/div/div/div[3]/ul/li[3]/span/span")).click();
		Thread.sleep(2000);
		
		//skills
		driver.findElement(By.xpath("//*[@id=\"registerThemeDefault\"]/div/div[3]/div/div/div/form/div[3]/div[1]/div[1]/div")).click();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//*[@id=\"registerThemeDefault\"]/div/div[3]/div/div/div/form/div[3]/div[1]/div[1]/div")).sendKeys("java");
		
		//industry
		driver.findElement(By.xpath("//*[@id=\"registerThemeDefault\"]/div/div[3]/div/div/div/form/div[3]/div[2]/div[2]/div[1]/div/div[1]")).click();
		driver.findElement(By.xpath("//*[@id=\'registerThemeDefault\']/div/div[3]/div/div/div/form/div[3]/div[2]/div[2]/div[1]/div/div[3]/ul/li[3]/span/span")).click();
		driver.findElement(By.xpath("//*[@id=\"registerThemeDefault\"]/div/div[3]/div/div/div/form/div[3]/div[2]/div[2]/div[1]/div/div[1]")).click();
		Thread.sleep(2000);
		
		//function
		driver.findElement(By.xpath("//*[@id=\"registerThemeDefault\"]/div/div[3]/div/div/div/form/div[3]/div[3]/div[2]/div[1]/div/div[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"registerThemeDefault\"]/div/div[3]/div/div/div/form/div[3]/div[3]/div[2]/div[1]/div/div[3]/ul/li[5]/span/span")).click();
		driver.findElement(By.xpath("//*[@id=\"registerThemeDefault\"]/div/div[3]/div/div/div/form/div[3]/div[3]/div[2]/div[1]/div/div[1]")).click();



		

	}

}
