package com.automationpractice.cucumberfromscratch.step_definitions;

import static org.junit.Assert.assertTrue;

import com.automationpractice.cucumberfromscratch.pages.CaseStatusCheckPage;
import com.automationpractice.cucumberfromscratch.pages.MyStatusPage;
import com.automationpractice.cucumberfromscratch.utilities.ConfigurationReader;
import com.automationpractice.cucumberfromscratch.utilities.Driver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StatusCheck {
	
	CaseStatusCheckPage caseStatus = new CaseStatusCheckPage(Driver.getDriver());
	MyStatusPage myStatus = new MyStatusPage(Driver.getDriver());
	
	@Given("the user is on the status check website")
	public void the_user_is_on_the_status_check_website() {
		
		Driver.getDriver().get(ConfigurationReader.getProperty("url"));
	}
	

	@When("the user enters his\\/her recipt number {string} and checks")
	public void the_user_enters_his_her_recipt_number_and_checks(String receiptNum) {
		
		caseStatus.enterReciptNumber.sendKeys(receiptNum);
		caseStatus.checkStatusButton.click();
	
	}

	@Then("status info should start with the following date {string}")
	public void status_info_should_start_with_the_following_date(String string) {
		String actualStatus = myStatus.recentStatus.getText();
		assertTrue("YOUR STATUS CHANGED AS : " +actualStatus ,actualStatus.contains(string));
	}
	
	
}
