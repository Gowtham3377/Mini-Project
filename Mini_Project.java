package com.selenium_Task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v85.page.Page.GetAppManifestResponse;
import org.openqa.selenium.support.ui.Select;

public class Mini_Project {
	public static void main(String[] args) throws Throwable {
		
		System.setProperty("WebDriver.chrome.driver", "C:\\Users\\GOWTHAM\\eclipse-workspace\\Selenium_Class\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		driver.manage().window().maximize();
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		String title = driver.getTitle();
		System.out.println(title);
		
		//signup
		driver.findElement(By.className("login")).click();
		WebElement ca = driver.findElement(By.xpath("//h3[text()='Create an account']"));
		System.out.println(ca.getText());
		WebElement em = driver.findElement(By.id("email_create"));
		em.sendKeys("Gowtham@yahoo.com");
		System.out.println(em.getAttribute("value"));
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
		
		//creating account
		Thread.sleep(4000);
		WebElement detail = driver.findElement(By.xpath("//h3[text()='Your personal information']"));
		System.out.println(detail.getText());
		
		WebElement r = driver.findElement(By.xpath("(//input[@type='radio'])[1]")); //radio
		r.click();
		boolean sel= r.isSelected();
		System.out.println(sel);
		
		WebElement fn = driver.findElement(By.xpath("//label[text()='First name ']"));
		System.out.println(fn.getText());
		WebElement n = driver.findElement(By.id("customer_firstname"));
		n.sendKeys("Gowtham");
		System.out.println(n.getAttribute("value"));
		
		WebElement ln = driver.findElement(By.xpath("//label[text()='Last name ']"));
		System.out.println(ln.getText());
		WebElement n2 = driver.findElement(By.id("customer_lastname"));
		n2.sendKeys("Anandan");
		System.out.println(n2.getAttribute("value"));
		
		driver.findElement(By.id("passwd")).sendKeys("Abcd@123");//password
		WebElement p = driver.findElement(By.xpath("//label[text()='Password ']"));
		System.out.println(p.getText());
		 boolean e = p.isEnabled();
		    System.out.println(e);
		    
		//drop Down
		WebElement date = driver.findElement(By.id("days"));
		Select s = new Select(date);
		s.selectByValue("16");
		WebElement month = driver.findElement(By.id("months"));
		Select s1 = new Select(month);
		s1.selectByValue("6");
		WebElement year = driver.findElement(By.id("years"));
		Select s2 = new Select(year);
		s2.selectByValue("1999");
		
		driver.findElement(By.id("newsletter")).click();
		
		//address
		WebElement ad = driver.findElement(By.className("page-subheading"));
		System.out.println(ad.getText());
		WebElement fnm = driver.findElement(By.xpath("(//label[text()='First name '])[2]"));
		System.out.println(fnm.getText());
		WebElement at = driver.findElement(By.id("firstname"));
		System.out.println(at.getAttribute("value"));
		WebElement lnm = driver.findElement(By.xpath("(//label[text()='Last name '])[2]"));
		System.out.println(lnm.getText());
		WebElement at2 = driver.findElement(By.id("lastname"));
		System.out.println(at2.getAttribute("value")); 
		WebElement cmp = driver.findElement(By.xpath("//label[text()='Company']")); //company
		System.out.println(cmp.getText());
		WebElement cn = driver.findElement(By.id("company"));
		cn.sendKeys("Greens Technology");
		System.out.println(cn.getAttribute("value"));
		WebElement adr = driver.findElement(By.xpath("//label[@for='address1']"));
		System.out.println(adr.getText());
		WebElement adr1 = driver.findElement(By.id("address1"));
		adr1.sendKeys("no 123 Greens Technology mugalivakkam");
		System.out.println(adr1.getAttribute("value"));
		WebElement con = driver.findElement(By.xpath("//span[contains(text(),'Street address, P.O. Box, Company name, etc.')]"));
		System.out.println(con.getText());
		WebElement ad2 = driver.findElement(By.xpath("//label[@for='address2']"));
		System.out.println(ad2.getText());
		WebElement adr2 = driver.findElement(By.id("address2"));
		adr2.sendKeys("adithi apartment porur ");
		System.out.println(adr2.getAttribute("value"));
		WebElement ct = driver.findElement(By.xpath("//label[@for='city']"));//city
		System.out.println(ct.getText());
		WebElement cty = driver.findElement(By.id("city"));
		cty.sendKeys("Chennai");
		System.out.println(cty.getAttribute("value"));
		
		WebElement st = driver.findElement(By.xpath("//label[@for='id_state']"));//state
		System.out.println(st.getText());
		WebElement sta = driver.findElement(By.id("id_state"));
		Select s4 = new Select(sta);
		s4.selectByIndex(5);
		System.out.println(sta.getAttribute(s4.toString()));
		boolean m = s4.isMultiple();
		System.out.println(m);
		
		
		WebElement z = driver.findElement(By.xpath("//label[@for='postcode']"));//zip
		System.out.println(z.getText());
		WebElement zip = driver.findElement(By.id("postcode"));
		zip.sendKeys("50123");
		System.out.println(zip.getAttribute("value"));
		
		WebElement co = driver.findElement(By.xpath("//label[@for='id_country']"));//country
		System.out.println(co.getText());
		WebElement cnt = driver.findElement(By.id("id_country"));
		System.out.println(cnt.getAttribute("value"));
		boolean en = cnt.isEnabled();
		System.out.println(en);
		
		WebElement inf = driver.findElement(By.xpath("//label[@for='other']"));//add info
		System.out.println(inf.getText());
		WebElement info = driver.findElement(By.id("other"));
		info.sendKeys("java selenium automation testing");
		System.out.println(info.getAttribute("value"));
		
		WebElement hp = driver.findElement(By.xpath("//label[@for='phone']"));//home phn
		System.out.println(hp.getText());
		WebElement hpn = driver.findElement(By.id("phone"));
		hpn.sendKeys("044-2553567");
		System.out.println(hpn.getAttribute("value"));
		
		WebElement mp = driver.findElement(By.xpath("//label[@for='phone_mobile']"));//mobile phn
		System.out.println(mp.getText());
		WebElement mpn = driver.findElement(By.id("phone_mobile"));
		mpn.sendKeys("9994999477");
		System.out.println(mpn.getAttribute("value"));
		
		WebElement as = driver.findElement(By.xpath("//label[@for='alias']"));//alias
		System.out.println(as.getText());
		WebElement ass = driver.findElement(By.id("alias"));
		ass.sendKeys("My Current Address");
		System.out.println(ass.getAttribute("value"));
		
		WebElement rq = driver.findElement(By.xpath("//span[text()='Required field']"));
		System.out.println(rq.getText());
		
		WebElement re = driver.findElement(By.id("submitAccount"));
		re.click();
//		boolean ree = re.isSelected();
//		System.out.println(ree);
		
		
		//MINIPROJECT 2ND PART
		
	    
		
		
		
		
		
				
		
		
		
		
		
		
		
		
		
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	
	
	
	
	
	
	}

}
