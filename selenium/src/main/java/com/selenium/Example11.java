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

public class Example11 {//this program will get all the values of specific column then sort it from low to high 

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
		
		//WebElement currentPrice = driver.findElement(By.xpath("//*[@id=\'leftcontainer\']/table/tbody/tr/td[4]"));
		////div[@id='leftcontainer']//tr[1]//td[4]
		//this will divide the xpath into two so we can change table row with for loop
		String firstPart = "//*[@id='leftcontainer']/table/tbody/tr[";
		String secondPart = "]/td[4]";
		
		ArrayList<Integer> array = new ArrayList<Integer>();
		
		for(int i =1; i<rowCount; i++) {
			String finalPart = firstPart+i+secondPart;
			System.out.println(finalPart);
			String price = driver.findElement(By.xpath(finalPart)).getText();
			//Double dPrice = Double.parseDouble(price);//this will convert the value from String to Double
			//int intPrice = dPrice.intValue();
			NumberFormat numberFormat = NumberFormat.getNumberInstance();
			Number num = numberFormat.parse(price);
			price = num.toString();
			System.out.println(price);
			Double m = Double.parseDouble(price);
			int intPrice = m.intValue();
			array.add(intPrice);
			
		}
		
		Collections.sort(array);//this will sort the data
		System.out.println(array);
		System.out.println(array.get(0));
		System.out.println(array.get(array.size()-1));//because count starts with 0
		
	}

}
