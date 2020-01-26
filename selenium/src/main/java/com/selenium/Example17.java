package com.selenium;

import java.text.ParseException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Example17 {// to add cookies

	WebDriver driver;

	@Test
	public void enterText() throws ParseException, InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"/Users/BlacK_BearD/eclipse-workspace/selenium/drivers/chromedriver");

		driver = new ChromeDriver();
		driver.get("https://www.amazon.ca/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		Cookie cookie = new Cookie("custom cookies", "12345");
		driver.manage().addCookie(cookie);
		
		Set<Cookie> cookies = driver.manage().getCookies();
		for(Cookie cook:cookies) {
			System.out.println(cook);
			
			
			
			
			
		}
		

	}
}
