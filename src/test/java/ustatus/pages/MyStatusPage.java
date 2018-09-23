package ustatus.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyStatusPage {

	
	public MyStatusPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//p[contains(text(),'On November 15, 2017')]")
	public WebElement recentStatus;

	
}
