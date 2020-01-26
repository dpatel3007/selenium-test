package com.selenium;

import java.sql.Time;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Example8 {
		

		private static final String Seconds = null;
		WebDriver driver;
		
		@Test
		public void enterText() {

			System.setProperty("webdriver.chrome.driver",
					"/Users/BlacK_BearD/eclipse-workspace/selenium/drivers/chromedriver");

			driver = new ChromeDriver();
			driver.get("https://money.rediff.com/gainers");
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		int rownumber = driver.findElements(By.xpath("//*[@id=\'leftcontainer\']/table/tbody/tr")).size();
		System.out.println("number of rows"+rownumber);

int columnnumber = driver.findElements(By.xpath("//div[@id='leftcontainer']//tr[1]//td[2]")).size();
System.out.println("number of columns"+columnnumber);

String rowdata = driver.findElement(By.xpath("//td[contains(text(),'197.45')]")).getText();
System.out.println("row data"+rowdata);
rowdata=driver.findElement(By.xpath("//a[contains(text(),'Hind. Composites')]/parent::*/following-sibling::td[3]")).getText();
System.out.println(" rowdata" +rowdata);


}
}
