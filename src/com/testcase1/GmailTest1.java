package com.testcase1;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailTest1 {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver  =  new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://login.yahoo.com/");
		 driver.findElement(By.id("login-username")).sendKeys("hmd.alm786@yahoo.com");
		 driver.findElement(By.xpath("//*[@id=\"login-signin\"]")).click();
		 WebElement textbox = driver.findElement(By.id("password-container"));
		    textbox.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.BACK_SPACE));
		 /* driver.findElement(By.xpath("//*[@id=\"password-container\"]")).click();
		 
		driver.findElement(By.xpath("//*[@id=\"password-container\"]")).sendKeys("Hmd786alm$");
		*/
		 driver.findElement(By.id("password-container")).sendKeys("Hmd786alm$");
	
		driver.findElement(By.xpath("//*[@id=\"login-signin\"]")).click();
		 Thread.sleep(2000);
		 driver.close();
		
	}

}
