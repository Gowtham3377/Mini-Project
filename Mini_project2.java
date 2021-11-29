package com.selenium_Task;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mini_project2 { 

	public static void main(String[] args) throws Throwable {
		
		
        System.setProperty("WebDriver.chrome.driver", "C:\\Users\\GOWTHAM\\eclipse-workspace\\Selenium_Class\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://practice.automationtesting.in/");
		//driver.manage().window().maximize();
		Thread.sleep(2000);
		
		//button
		WebElement add = driver.findElement(By.xpath("(//a[contains(@class,'button product_type_simple')])[2]"));
		add.click();
		System.out.println(add.getText());
		
		Thread.sleep(9000);
		//view bas
		WebElement vb = driver.findElement(By.xpath("//a[contains(@class,'added_to_cart wc-forward')]"));
		System.out.println(vb.getText());
		vb.click();
		
		//quantity
		WebElement qt = driver.findElement(By.xpath("//input[@type='number']"));
		qt.clear();
		qt.sendKeys("3");
		System.out.println(qt.getAttribute("value"));
		
		//update bas
		WebElement ub = driver.findElement(By.xpath("(//input[@class='button'])[2]"));
		System.out.println(ub.getText());
	    ub.click();
	    
	    Thread.sleep(4000);
	    //proceed to pay
	    WebElement pp = driver.findElement(By.xpath("//a[@class=\"checkout-button button alt wc-forward\"]"));
	    System.out.println(pp.getText());
	    pp.click();
	    
	    Thread.sleep(3000);
	    //billing dtl
	    WebElement bd = driver.findElement(By.xpath("//h3[text()='Billing Details']"));
	    System.out.println(bd.getText());
	    
	    WebElement fn = driver.findElement(By.id("billing_first_name"));
	    System.out.println(fn.getText());
	    
	    WebElement fn1 = driver.findElement(By.xpath("(//input[@class='input-text '])[1]"));
	    fn1.sendKeys("Gowtham");
	    fn1.getAttribute("value");
	    
	    System.out.println(fn1.getText());
	    
	    WebElement ln = driver.findElement(By.id("billing_last_name"));
	    System.out.println(ln.getText());
	    WebElement ln1 = driver.findElement(By.xpath("(//input[@class='input-text '])[2]"));
	    ln1.sendKeys("jack");
	    fn1.getAttribute("value");
	    
	    WebElement cp = driver.findElement(By.xpath("//label[text()='Company Name']"));//company
	    System.out.println(ln.getText());
	    WebElement cp1 = driver.findElement(By.xpath("((//input[@class='input-text '])[3]"));
	    cp1.sendKeys("Greens technology");
	    cp1.getAttribute("value");
	    
	    WebElement em = driver.findElement(By.xpath("//label[@for='billing_email']"));//email
	    System.out.println(em.getText());
	    WebElement em1 = driver.findElement(By.xpath("(//input[@class='input-text '])[4]"));
	    em1.sendKeys("Gowtham23@gmail.com");
	    em1.getAttribute("value");
	    
	    
		
			
		
		
		
		
		
		
		
		
	}
}
