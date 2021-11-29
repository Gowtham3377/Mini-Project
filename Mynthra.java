package com.selenium_Task;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Mynthra {
	public static void main(String[] args) throws Throwable {
System.setProperty("WebDriver.chrome.driver", "C:\\Users\\GOWTHAM\\eclipse-workspace\\Selenium_Class\\driver\\chromedriver.exe");
	    
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.myntra.com//");
		//driver.manage().window().maximize();
		
		Thread.sleep(4000);
		WebElement br = driver.findElement(By.className("desktop-searchBar"));
		br.click();
		br.sendKeys("pokory");
		
		Thread.sleep(2000);
		driver.findElement(By.className("desktop-submit")).click();
		
		Thread.sleep(2000);
		WebElement ra = driver.findElement(By.xpath("//label[text()='Girls']"));
		ra.click();
		
		Thread.sleep(2000);
		driver.findElement(By.className("categories-more")).click();
		
		Thread.sleep(2000);
		WebElement ra1 = driver.findElement(By.xpath("//label[text()='Handbags']"));
		ra1.click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[contains(@class,'myntraweb-sprite')])[6]")).click();
		
		Thread.sleep(2000);
		WebElement ra2 = driver.findElement(By.xpath("//label[text()='Black']"));
		ra2.click(); 
		
		Thread.sleep(2000);
		WebElement bag = driver.findElement(By.xpath("(//a[@target=\"_blank\"])[2]"));
		bag.click();
		
		TakesScreenshot t = (TakesScreenshot) driver;
		File a = t.getScreenshotAs(OutputType.FILE);
		File b = new File("C:\\Users\\GOWTHAM\\eclipse-workspace\\Selenium_Class\\screenshots\\myntra.png");
		FileHandler.copy(a, b);
		
		
	}

}
