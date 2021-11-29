package com.selenium_Task;

import java.awt.Robot;
import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class Snapdeal {
	public static void main(String[] args) throws Throwable {
		System.setProperty("WebDriver.chrome.driver", "C:\\Users\\GOWTHAM\\eclipse-workspace\\Selenium_Class\\driver\\chromedriver.exe");
	    
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.snapdeal.com//");
		//driver.manage().window().maximize();
		
		Thread.sleep(4000);
		Actions a = new Actions(driver);
		WebElement men = driver.findElement(By.xpath("(//span[@class=\"catText\"])[6]"));
		
		a.moveToElement(men).build().perform();
		a.click().perform();
		
		Thread.sleep(2000);
		WebElement jac = driver.findElement(By.xpath("//span[text()='Jackets']"));
		a.moveToElement(jac).build().perform();
		a.click().perform();
		
		Thread.sleep(2000);
		WebElement pin = driver.findElement(By.xpath("(//input[@type=\"text\"])[9]"));
		pin.sendKeys("600012");
		Thread.sleep(3000);
		WebElement cli = driver.findElement(By.xpath("(//button[@type=\"button\"])[3]"));
		cli.click();
		
		Thread.sleep(5000);
		//WebElement bj = driver.findElement(By.
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		js.executeScript("arguments[0].scrollIntoView();",bj );
		//bj.click();
		driver.get("https://www.snapdeal.com/product/hangup-multi-checks-casual-blazers/646086946830#bcrumbLabelId:200");
		
		Thread.sleep(2000);
		WebElement siz = driver.findElement(By.xpath("//div[text()='40']"));
		siz.click();
		
		TakesScreenshot t =(TakesScreenshot) driver;
		File n = t.getScreenshotAs(OutputType.FILE);
		File m = new File("C:\\Users\\GOWTHAM\\eclipse-workspace\\Selenium_Class\\screenshots\\snapdeal");
		FileHandler.copy(n, m);
			
		
		
		
	
	
	
	}

}
