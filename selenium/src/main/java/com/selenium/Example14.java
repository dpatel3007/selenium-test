package com.selenium;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Example14 {// this will print all anchor tags contains href

	WebDriver driver;

	@Test
	public void enterText() throws ParseException {

		System.setProperty("webdriver.chrome.driver",
				"/Users/BlacK_BearD/eclipse-workspace/selenium/drivers/chromedriver");

		driver = new ChromeDriver();
		driver.get("https://money.rediff.com/gainers/bse/daily/groupa");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		List<WebElement> links = driver.findElements(By.xpath("//a"));
		
		System.out.println(links.size());
		ArrayList<String> data = new ArrayList<String>();
		
		for(int i = 0; i<links.size();i++) {
			System.out.println(links.get(i).getText());
			
			data.add(links.get(i).getAttribute("href"));
			
			System.out.println(links.get(i).getAttribute("href"));
		}
		System.out.println(data.size());
	}
}
