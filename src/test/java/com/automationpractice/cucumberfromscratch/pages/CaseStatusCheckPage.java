package com.automationpractice.cucumberfromscratch.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CaseStatusCheckPage {

	
	public CaseStatusCheckPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="receipt_number")
	public WebElement enterReciptNumber;
	
	@FindBy(css="input[name='initCaseSearch']")
	public WebElement checkStatusButton;
	
}
