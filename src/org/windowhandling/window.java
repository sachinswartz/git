package org.windowhandling;

import java.awt.AWTException;
import java.awt.List;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class window {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver","E:\\Selin7\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("iphone x");
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		Thread.sleep(3000);
		Actions a = new Actions(driver);
		Robot r = new Robot();
		WebElement as = driver.findElement(By.xpath("//span[text()='Apple iPhone XS, US Version, 256GB, Space Gray - Unlocked (Renewed)']"));
		a.contextClick(as).perform();
		
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
			
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		String pid = driver.getWindowHandle();
		System.out.println(pid);
		
		Set<String> cid = driver.getWindowHandles();
		
		for (String eachid : cid) {
			if (!eachid.equals(pid)) {
				
				System.out.println(driver.switchTo().window(eachid));
				
				
			}
			
		}
			
		
		
			
		
		Thread.sleep(2000);
		WebElement print = driver.findElement(By.xpath("//span[text()=' Climate Pledge Friendly ']"));
		System.out.println(print.getText());
		
		
		
		
	}

}
