package com.automation;




import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.automation.pom.Login;

public class seleniumDemo2Test {
	 WebDriver driver;
   /**
	 * 
	 */
	public seleniumDemo2Test() {
		super();
		// TODO Auto-generated constructor stub
	}


	@Before
 public void setUpBeforeClass() throws Exception {
		System.setProperty("webdriver.gecko.driver","./src/test/resources/geckodriverwin64/geckodriver.exe");
		 driver = new FirefoxDriver();
		driver.get("http://demo.guru99.com/V4/");
	}

	@After
	public  void tearDownAfterClass() throws Exception {
	}

	@Before
	public  void setUp() throws Exception {
	}

	@After
	public  void tearDown() throws Exception {
	}

	@Test
	public  void test() {
		
		Login login = new Login(driver);
		login.setTextUserId("abc");
		login.setTextPassword("password");
		login.clickButtonLogin();
		Alert alert = driver.switchTo().alert();
		
		
	
		String alertText = alert.getText();
	    
		String output= "User or Password is not valid";
		assertEquals(alertText,output);
		
	}
	
	@Test
	public  void test2() {
		
		assert(false);
		
	}

}
