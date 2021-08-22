package com.automation.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	@FindBy(name="uid")
	public WebElement textUserId;
	@FindBy(xpath="/html/body/form/table/tbody/tr[2]/td[2]/input")
	public WebElement textPassword;
	@FindBy(name="btnLogin")
	public WebElement buttonLogin;
	@FindBy(name="btnReset")
	public WebElement buttonReset;
	
	
 /**
	 * @param textUserId the textUserId to set
	 */
	public void setTextUserId(String textUserId) {
		this.textUserId.sendKeys(textUserId);
	}


	/**
	 * @param textPassword the textPassword to set
	 */
	public void setTextPassword(String textPassword) {
		this.textPassword.sendKeys(textPassword);
	}


	/**
	 * @param buttonLogin the buttonLogin to set
	 */
	public void clickButtonLogin() {
		this.buttonLogin.click();
	}


	/**
	 * @param buttonReset the buttonReset to set
	 */
	public void clickButtonReset() {
		this.buttonReset.getRect();
	}


public Login(WebDriver diriver) {
	 PageFactory.initElements(diriver, this);
	 
 }

}
