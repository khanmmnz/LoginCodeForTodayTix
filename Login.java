package com.testCases;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Login {

	WebDriver driver;
	
	@BeforeMethod
	public void setup ()
	
	{		
		System.setProperty("webdriver.chrome.driver", "/Users/mohammadkhan/Downloads/chromedriver");
		driver = new ChromeDriver();
	}	
	
	@Test
	public void login()
	{
		driver.get("https://www.todaytix.com/");
		
driver.findElement(By.xpath("//*[@id=\"navBarLoginButton\"]/span[1]")).click();
        
        driver.findElement(By.xpath("//span[text()='Email']")).click();
        
        driver.findElement(By.name("username")).sendKeys("hartzrain@yahoo.com");
        
        driver.findElement(By.name("password")).sendKeys("password");
        
        driver.findElement(By.xpath("//*[@id=\"sign-in-submit\"]/span[1]")).click();
	
				
	}
	
}
