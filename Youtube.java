package com.selenium_Task;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class Youtube {
 public static void main(String[] args) throws Throwable {
	 
	 System.setProperty("WebDriver.chrome.driver", "C:\\Users\\GOWTHAM\\eclipse-workspace\\Selenium_Class\\driver\\chromedriver.exe");
	 WebDriver driver = new ChromeDriver();
	 //driver.manage().window().maximize();
	 driver.get("http://youtube.com/");
	 
	 Thread.sleep(4000);
	 WebElement s = driver.findElement(By.name("search_query"));
	 s.sendKeys("selenium");
	 WebElement s1 = driver.findElement(By.id("search-icon-legacy"));
	 s1.click();
	 
	 Thread.sleep(2000);
	 JavascriptExecutor js = (JavascriptExecutor)driver;
	 js.executeScript("window.scrollBy(0, 1000);");
	 
	 Thread.sleep(2000);
	 WebElement l = driver.findElement(By.xpath("(//a[@href='/watch?v=5FUdrBq-WFo'])[2]"));
	 System.out.println(l.getText());
	 WebElement p = driver.findElement(By.xpath("(//a[@href='/watch?v=5FUdrBq-WFo'])[1]"));
	 p.click();
	 
	 
	 WebElement ps = driver.findElement(By.xpath("//button[@class=\"ytp-play-button ytp-button\"]"));
	 Thread.sleep(6000);
	 ps.click();
	 
	 TakesScreenshot t = (TakesScreenshot) driver;
	 File m = t.getScreenshotAs(OutputType.FILE);
	 File n = new File("C:\\Users\\GOWTHAM\\eclipse-workspace\\Selenium_Class\\screenshots\\youtube.png");
	 FileHandler.copy(m, n);
	 
	 System.out.println("video pause");
	 
	 Thread.sleep(2000);
	 WebElement ds = driver.findElement(By.xpath("(//yt-formatted-string[@class=\"style-scope ytd-video-primary-info-renderer\"])[1]"));
	 System.out.println(ds.getText()); 
	 
	 


}
}
