package com.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Example10 {

	WebDriver driver;

	@Test
	public void enterText() {

		System.setProperty("webdriver.chrome.driver",
				"/Users/BlacK_BearD/eclipse-workspace/selenium/drivers/chromedriver");

		driver = new ChromeDriver();
		driver.get("https://money.rediff.com/gainers/bse/daily/groupa");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);// it will load entire page up to 30 sec

		// total rows in whole table
		int rowCount = driver.findElements(By.xpath("//*[@id=\'leftcontainer\']/table/tbody/tr")).size();
		System.out.println("Number of Rows are: " + rowCount);

		// total column in whole table
		int columnCount = driver.findElements(By.xpath("//*[@id=\'leftcontainer\']/table/tbody/tr[1]/td")).size();
		System.out.println("Number of Columns are: " + columnCount);

		// Value of specific column and row = not static value
		String currentPrice = driver.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[5]/td[4]"))
				.getText();
		System.out.println("Current price of 5th row 4th value (Current Price): " + currentPrice);

		// Value of specific column and row = static value
		String currentPrice1 = driver
				.findElement(By.xpath("//a[contains(text(),'Dhruv Consultancy')]/parent::*/following-sibling::td[3]"))
				.getText();
		System.out.println("Current price of 5th row 4th value (Current Price1): " + currentPrice1);
	}

}
