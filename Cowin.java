package com.selenium_Task;

import org.checkerframework.framework.qual.JavaExpression;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Cowin {
	public static void main(String[] args) throws Throwable {
		
		System.setProperty("WebDriver.chrome.driver","C:\\Users\\GOWTHAM\\eclipse-workspace\\Selenium_Class\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cowin.gov.in/");
		//driver.manage().window().maximize();
		
		Thread.sleep(4000);
		
		WebElement cv = driver.findElement(By.xpath("//mat-select[@formcontrolname='state_id']"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		//js.executeScript("arguments[0].scrollIntoview();",cv);
		js.executeScript("window.scrollBy(0,800);");
		
		//state
		Thread.sleep(2000);
		WebElement cv1 = driver.findElement(By.xpath("(//mat-select[@aria-expanded='false'])[1]"));
		cv1.click();
		WebElement l = driver.findElement(By.xpath("(//span[@class='mat-option-text'])[32]"));
		l.click();
		System.out.println(l.getText());
		
		//distric
		Thread.sleep(2000);
		WebElement cv2 = driver.findElement(By.xpath("(//mat-select[@aria-expanded='false'])[2]"));
		cv2.click();
		WebElement l2 = driver.findElement(By.xpath("(//span[@class='mat-option-text'])[5]"));
		l2.click();
		System.out.println(l2.getText());
		
		WebElement l3 = driver.findElement(By.xpath("//button[contains(@ class,'searchBtn pin-search-btn')]"));
		l3.click();
		
		
		Thread.sleep(2000);
		//age
		WebElement ag = driver.findElement(By.xpath("//label[@class='accessibility-plugin-ac']"));
		ag.click();
		System.out.println(ag.getText());
		WebElement ag1 = driver.findElement(By.xpath("(//label[@class='accessibility-plugin-ac'])[4]"));
		ag1.click();
		System.out.println(ag1.getText());
		WebElement ag2 = driver.findElement(By.xpath("(//label[@class='accessibility-plugin-ac'])[6]"));
		ag2.click();
		System.out.println(ag2.getText());
		
		Thread.sleep(2000);
		//vac
		WebElement vc = driver.findElement(By.xpath("//div[contains(@class,'main-slider-wrap')]"));
		System.out.println(vc.getText());
		
		
		
	
		
		
		
		
		
		
	}

}
