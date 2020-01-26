package com.selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Example6 {
	
WebDriver driver;

	
	@Test
	public void enterText() {

		System.setProperty("webdriver.chrome.driver",
				"/Users/BlacK_BearD/eclipse-workspace/selenium/drivers/chromedriver");
		
		driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		
		// click on youtube
		driver.findElement(By.xpath("//*[@id=\'social_block\']/ul/li[3]/a")).click();
		
		// here we will get all windows id
		Set<String> windowsId = driver.getWindowHandles();
		
		//we don' have any get method so we have to iterate it
		Iterator<String> itr = windowsId.iterator();
		
		String parentId = itr.next();
		String childId = itr.next();
		
		// switch to youtube window
		driver.switchTo().window(childId);
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// close the youtube window
		driver.close();
		
		//switch to parent window
		driver.switchTo().window(parentId);
		
		//click on my account link
		driver.findElement(By.xpath("//*[@id=\'footer\']/div/section[5]/h4/a")).click();
	}

}
