package framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import framework.base.BaseSetup;

public class RetailSigninPage extends BaseSetup {

	public RetailSigninPage() {
		PageFactory.initElements(getDriver(), this);
	}
	
	@FindBy(id = "email") public WebElement emailInput;
	
	@FindBy(id = "password") public WebElement passwordInput;
	
	@FindBy(id = "loginBtn") public WebElement loginBtn;
	
	@FindBy(id = "newAccountBtn") public WebElement newAccountBtn;
	
}
