package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;


public class Example7 {
	

	WebDriver driver;
	String month = "February 2020";
	String date = "12";
	@Test
	public void enterText() {

		System.setProperty("webdriver.chrome.driver",
				"/Users/BlacK_BearD/eclipse-workspace/selenium/drivers/chromedriver");

		driver = new ChromeDriver();
		driver.get("https://www.airbnb.ca/");
		driver.findElement(By.xpath("//*[@id=\'checkin_input\']")).click();
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// WebElement mon =
		// driver.findElement(By.xpath("//*[@id=\'MagicCarpetSearchBar\']/div[2]/div/div/div/div[2]/div/div/div/div/div/div[2]/div[2]/div/div[2]/div/table/tbody/tr[4]/td[2]"));

		//WebElement mon = null;
		//while (true) {
			//if (mon.getText().equals(month)) {
				//break;
			//} else {

				driver.findElement(By.xpath(
						"//*[@id=\'FMP-target\']/div/div[1]/div/div/div/div/div/div[2]/div/form/div[2]/div/div/div/div[2]/div/div/div/div/div/div[2]/div[1]/div[2]"))
						.click();
				driver.findElement(By.xpath("//*[@id=\"lp-guestpicker\"]/div[1]")).click();
				WebElement number = driver.findElement(By.xpath("//*[@id=\'FMP-target\']/div[2]/div/div/form/div[3]/div/div[2]/div/div/div[1]/div[1]/div/div/div/div[1]"));
				Select select = new Select(driver.findElement(By.xpath("\"//*[@id=\'FMP-target\']/div[2]/div/div/form/div[3]/div/div[2]/div/div/div[1]/div[1]/div/div/div/div[1]\"")));
				select.selectByVisibleText("2");
				
				
			}
		//}

	}
//}
