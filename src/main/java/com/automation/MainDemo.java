package com.automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MainDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\kemou\\Downloads\\geckodriverwin64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("file:///C:/Users/kemou/Desktop/selenuim/index.html");
		WebElement findElement = driver.findElement(By.id("name"));
		findElement.sendKeys("Appolin Kwemou");

        
		List<WebElement> findElements = driver.findElements(By.tagName("input"));
		System.out.println("size "+ findElements.size());
	}

}
