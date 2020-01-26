package com.selenium;

import java.text.ParseException;
import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Example18 {
	WebDriver driver;

	@Test
	public void enterText() throws ParseException, InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"/Users/BlacK_BearD/eclipse-workspace/selenium/drivers/chromedriver");

		driver = new ChromeDriver();
		driver.navigate().to("https://www.amazon.ca/");// it is same as .get method
		//driver.manage().deleteCookieNamed("i18n-prefs");//it will delete specific cookie
		driver.manage().deleteAllCookies();//will delete all cookies

		Set<Cookie> cookieList = driver.manage().getCookies();//displaying all cookies 
		for (Cookie getcookies : cookieList) {
			System.out.println(getcookies);
		}
	}
}
