package com.automation;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.automation.pom.Login;

public class seleniumDemo2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","./src/test/resources/geckodriverwin64/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://demo.guru99.com/V4/");
		 //driver.findElement(By.cssSelector("#L2AGLb > div:nth-child(1)")).click();
		
		Login login = new Login(driver);
		login.setTextUserId("abc");
		login.setTextPassword("password");
		login.clickButtonLogin();
		
		

		
		
		
        
		
		

	}

}
