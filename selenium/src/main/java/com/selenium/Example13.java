package com.selenium;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Example13 {// this program will get all the values of all rows then sort it from low to
						// high

	WebDriver driver;

	@Test
	public void enterText() throws ParseException {

		System.setProperty("webdriver.chrome.driver",
				"/Users/BlacK_BearD/eclipse-workspace/selenium/drivers/chromedriver");

		driver = new ChromeDriver();
		driver.get("https://money.rediff.com/gainers/bse/daily/groupa");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);// it will load entire page up to 30 sec

		String totalRow = "//*[@id=\'leftcontainer\']/table/tbody/tr";
		int rowCount = driver.findElements(By.xpath(totalRow)).size();
		System.out.println(rowCount);

		String totalCol = "//div[@id='leftcontainer']/table/tbody/tr[1]/td";
		int columnCount = driver.findElements(By.xpath(totalCol)).size();
		System.out.println(columnCount);

		String firstPart = "//*[@id='leftcontainer']/table/tbody/tr[";
		String secondPart = "]/td[";
		String thirdPart = "]";
		for (int i = 1; i <= rowCount; i++) {

			for (int j = 1; j <= columnCount; j++) {
				String finalPart = firstPart + i + secondPart + j + thirdPart;
				//System.out.println(finalPart);
				String text = driver.findElement(By.xpath(finalPart)).getText();
				System.out.print(text + " | ");
			}
			System.out.println(" ");
		}

	}

}
