package com.testcase1;

import java.io.IOException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Car_dekho_Testing {
	private static WebDriver driver;
@BeforeClass
	public static void carDekholaunch() {
		System.setProperty("webdriver.gecko.driver", 
		"E:\\Selenium webdrivers\\geckodriver.exe");
		 driver = new FirefoxDriver();
		driver.get("https://www.cardekho.com/");
		driver.manage().window().maximize();
	}
@Test
public void selectCarByBudget()throws Exception {
try {
	driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/div/div[2]/div/div[1]/ul/li[2]")).click();
} catch (Exception e) {
	// TODO Auto-generated catch block
	System.out.println("here");
	e.printStackTrace();
}
WebElement selectElement = 
				driver.findElement(By.xpath("//*[@id=\"HometopBanner\"]/div[2]/div/div[1]/ul/li[1]"));
	     Select sel = new Select(selectElement);
	    sel.selectByIndex(3);
	    }
	    
		@AfterClass
		public static void teardown() throws IOException, InterruptedException {
			Thread.sleep(5000);
			driver.quit();
	}


}
