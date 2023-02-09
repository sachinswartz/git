package org.windowhandling;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class green {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver","E:\\Selin7\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://greenstech.in/selenium-course-content.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("(//i[@class='fas fa-plus'])[6]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[text()=' DAY 10 TASK'])[1]")).click();
		
		String pid = driver.getWindowHandle();
		System.out.println(pid);
		
		Set<String> aid = driver.getWindowHandles();
		System.out.println(aid);
		
		for (String eid: aid) {
			
			if (!eid.equals(pid)) {
				System.out.println(driver.switchTo().window(eid));
				
			}
			
		}
		
	    driver.findElement(By.xpath("//pre[@style='word-wrap: break-word; white-space: pre-wrap;']"));
	    Robot r = new Robot();
	    r.keyPress(KeyEvent.VK_CONTROL);
	    r.keyPress(KeyEvent.VK_A);
	    r.keyRelease(KeyEvent.VK_CONTROL);
	    r.keyRelease(KeyEvent.VK_A);
	    
	   
	    
		
		
		
		
		
		
	}

}
