package org.screen;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Schreenshot {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","E:\\Selin7\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://greenstech.in/selenium-course-content.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//i[@class='fas fa-plus'])[1]")).click();
		TakesScreenshot t  = (TakesScreenshot)driver;
		File src = t.getScreenshotAs(OutputType.FILE);
		File des = new File("E:\\Selin7\\ss//interview.png");
		FileUtils.copyFile(src, des);
		
			
		
	}

}
