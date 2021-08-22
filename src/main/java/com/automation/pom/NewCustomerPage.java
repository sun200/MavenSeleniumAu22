package com.automation.pom;

import java.nio.file.DirectoryStream.Filter;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class NewCustomerPage {
	
	@FindBy(name="name")
	private WebElement textCustomerName;
	
	@FindBys(@FindBy(name="rad1"))
	private List<WebElement> radioBtnGenders;

	/**
	 * @param textCustomerName the textCustomerName to set
	 */
	public void setTextCustomerName(String textCustomerName) {
		this.textCustomerName.sendKeys(textCustomerName);
	}

	/**
	 * @param radioBtnGenders the radioBtnGenders to set
	 */
	public void setRadioBtnGenders(String gender) {
		this.radioBtnGenders.stream()
		.filter(value->value.getText().equals(gender))
		.forEach(filter->filter.click());
			}
	
	public NewCustomerPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	

}
