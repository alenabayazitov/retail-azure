package framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import framework.base.BaseSetup;

public class RetailHomePage extends BaseSetup{

	public RetailHomePage() {
		PageFactory.initElements(getDriver(), this);
	}
	
	@FindBy(id = "signinLink") public WebElement signIn;
	
	@FindBy(id = "hamburgerBtn") public WebElement allSectionBtn;
	
	@FindBy(xpath = "//span[text()='Electronics']") public WebElement electronicsSignature;
	
	@FindBy(xpath = "//span[text()='Computers']") public WebElement computersSignature;
	
	@FindBy(xpath = "//span[text()='Smart Home']") public WebElement smartHomeSignature;
	
	@FindBy(xpath = "//span[text()='Sports']") public WebElement sportsSignature;
	
	@FindBy(xpath = "//span[text()='Automative']") public WebElement automativeSignature;
	
	@FindBy(id = "logoutBtn") public WebElement logoutBtn;
	
	@FindBy(xpath = "//select[@id = 'search']") public WebElement departmentSearch;
	
	@FindBy(id = "searchInput") public WebElement searchInputField;
	
	@FindBy(id = "searchBtn") public WebElement searchBtn;
	
	@FindBy(xpath = "//div[@id = 'cartBtn']") public WebElement cartSign;
	
	@FindBy(id = "orderLink") public WebElement orderLink;
	
	

}
