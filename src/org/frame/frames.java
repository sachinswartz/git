package org.frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class frames {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\Selin7\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/guru99home/");
		driver.manage().window().maximize();
		driver.switchTo().frame("a077aa5e");
		 driver.findElement(By.xpath("//img[@src='Jmeter720.png']")).click();
		
	}

}
