package com.testcase1;

import javax.xml.xpath.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pdf_to_word {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver  =  new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.freepdfconvert.com/");
		driver.getCurrentUrl();                                                                                               
		driver.findElement(By.xpath("//*[@id=\"top\"]/body/main/div[1]/div/div/div[2]/section/label/div/div[1]/a/span//*[@id=\"top\"]/body/main/div[1]/div/div/div[2]/section/label/div/div[1]/a")).sendKeys("C:\\Users\\hp\\Pictures\\IT CV\\latest resume\\Hammad_Resume_QA.pdf");
		Thread.sleep(1500);
		driver.close();
	}

}
