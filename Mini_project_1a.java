package com.selenium_Task;

import java.io.File;
import java.sql.Driver;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class Mini_project_1a {
	
	public static void main(String[] args) throws Throwable {
		
		System.setProperty("WebDriver.chrome.driver","C:\\Users\\GOWTHAM\\eclipse-workspace\\Selenium_Class\\driver\\chromedriver.exe");
	    
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		//driver.manage().window().maximize();
		
		//login
		Thread.sleep(3000);
		driver.findElement(By.id("email")).sendKeys("Gowtham@yahoo.com");
		driver.findElement(By.id("passwd")).sendKeys("Abcd@123");
		driver.findElement(By.id("SubmitLogin")).click();
		
		//Women
		Thread.sleep(3000);
        WebElement w = driver.findElement(By.xpath("//a[text()='Women']"));
        w.click();
        
        Thread.sleep(4000);
        Actions a = new Actions(driver);
		
		//WebElement move = driver.findElement(By.xpath("//a[@title='Evening Dresses']"));
//		a.moveToElement(move).perform();
//		a.click().perform();
		
		Thread.sleep(3000);
//		driver.findElement(By.className("color_pick")).click(); // Color
		WebElement move2 = driver.findElement(By.xpath("(//a[@title='View'])[1]"));
		move2.click();
//		a.moveToElement(move2).perform();
//		a.click().perform();
		Thread.sleep(4000);
		WebElement m = driver.findElement(By.name("qty"));
		m.clear();
		m.sendKeys("3");
		
		WebElement s = driver.findElement(By.id("group_1"));
		s.click();
		Select s1 = new Select(s);
		s1.selectByIndex(1);
		
		driver.findElement(By.name("Blue")).click(); // color
		driver.findElement(By.name("Submit")).click(); //cart
		
//		TakesScreenshot t = (TakesScreenshot)driver;
//		File l = t.getScreenshotAs(OutputType.FILE);
//		File n = new File("C:\\Users\\GOWTHAM\\eclipse-workspace\\Selenium_Class\\screenshots.add_cart");
//		FileHandler.copy(l, n);
		Thread.sleep(4000);
		WebElement h = driver.findElement(By.xpath("//a[@title='Proceed to checkout']"));
		h.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@title='Proceed to checkout'])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("processAddress")).click();
		Thread.sleep(2000);
		WebElement mvv = driver.findElement(By.id("cgv"));
		a.moveToElement(mvv).perform();
		a.click().perform();
		Thread.sleep(2000);
		driver.findElement(By.name("processCarrier")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@title='Pay by bank wire']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
		
		
		
		
		
		 

		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	
	
	
	
	
	
	
	
	
	
	}

}
