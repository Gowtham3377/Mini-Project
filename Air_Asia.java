package com.selenium_Task;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Air_Asia {
	public static void main(String[] args) throws Throwable {
		
		System.setProperty("WebDriver.chrome.driver", "C:\\Users\\GOWTHAM\\eclipse-workspace\\Selenium_Class\\driver\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
        driver.get("https://www.airasia.co.in/home");
	    driver.manage().window().maximize();
        Thread.sleep(4000);
        
        driver.findElement(By.id("One Way")).click();
        
        WebElement pi = driver.findElement(By.xpath("(//div[contains(@class,'flight-search')])[10]"));
        pi.click();
        WebElement pi2 = driver.findElement(By.xpath("//div[text()='Mumbai']"));
        pi2.click();
        WebElement des = driver.findElement(By.xpath("//div[text()='Kolkata']"));
        des.click();
        
        //date
        WebElement d = driver.findElement(By.className("selected-date"));
        d.click();
        
        Thread.sleep(2000);
        WebElement date = driver.findElement(By.xpath("(//div[@class='text-day'])[92]"));
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].scrollIntoView();", date);
        driver.findElement(By.xpath("(//div[@role='button'])[93]")).click();
	
	
	}

}
