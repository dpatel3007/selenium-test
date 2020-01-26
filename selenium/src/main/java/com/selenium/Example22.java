package com.selenium;

import java.text.ParseException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Example22 {// filling out the form using javascript executor and more examples

	WebDriver driver;

	@Test
	public void enterText() throws ParseException, InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"/Users/BlacK_BearD/eclipse-workspace/selenium/drivers/chromedriver");

		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		JavascriptExecutor webdriver = (JavascriptExecutor) driver;

		webdriver.executeScript("document.getElementById('email').setAttribute('value','test@gmail.com')");
		webdriver.executeScript("document.getElementById('pass').setAttribute('value','123456')");
		//webdriver.executeScript("arguments[0].click();",driver.findElement(By.xpath("//input[@data-testid='royal_login_button']")));

		// Fetching Domain name, toString() use to change object to name
		String DomainName = webdriver.executeScript("return document.domain;").toString();
		System.out.println("Domain name: " + DomainName);
		Thread.sleep(2000);

		// Fetching URL
		String URL = webdriver.executeScript("return document.URL;").toString();
		System.out.println("URL name: " + URL);
		Thread.sleep(2000);

		// Fetching Title Name
		String TitleName = webdriver.executeScript("return document.title;").toString();
		System.out.println("Title name: " + TitleName);
		Thread.sleep(2000);

		// scroll down vertically
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0,document.body.scrollHeight)");
		Thread.sleep(2000);

		// scroll up vertically
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0,-document.body.scrollHeight)");
		Thread.sleep(2000);

		// scroll down to pixel specified
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0,100)");
		Thread.sleep(2000);

		// scroll come back till pixel specified
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0,-100)");
		Thread.sleep(2000);

		// scroll down till the object specified
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",
				driver.findElement(By.xpath("//*[@id=\"reg_pages_msg\"]/a")));
		Thread.sleep(2000);

		// zoom in and out
		((JavascriptExecutor) driver).executeScript("document.body.style.zoom='30%'");
		Thread.sleep(2000);

		((JavascriptExecutor) driver).executeScript("document.body.style.zoom='200%'");
		Thread.sleep(2000);

		((JavascriptExecutor) driver).executeScript("document.body.style.zoom='100%'");

	}

}
