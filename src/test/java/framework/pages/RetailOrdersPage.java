package framework.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import framework.base.BaseSetup;

public class RetailOrdersPage extends BaseSetup{

	public RetailOrdersPage() {
		PageFactory.initElements(getDriver(), this);
	}
	
	@FindBy(xpath = "//p[text() = 'Order Placed, Thanks']") public WebElement orderMessage;
	
	@FindBy(xpath = "//div[@class = 'order__header-number']//child::p[@class = 'order__header-title']") public List<WebElement> orderNumbers;
	
	@FindBy(xpath = "//div[@class = 'order__status-arriving']") public WebElement arriving;
	
	@FindBy(xpath = "//p[@class = 'order__header-btn'][1]") public WebElement showHideOrderDetails;
	
	@FindBy(id = "cancelBtn") public WebElement cancelOrderBtn;
	
	@FindBy(id = "reasonInput") public WebElement cancelReasonChoice;
	
	@FindBy(xpath = "//button[@id = 'orderSubmitBtn']") public WebElement cancelOrderButton;
	
	@FindBy(xpath = "//div[@class = 'cancel__confirm-message']//descendant::p") public WebElement cancelationMessage;
	
	@FindBy(id = "returnBtn") public WebElement returnBtn;
	
	@FindBy(id = "dropOffInput") public WebElement dropOffInput;
	
	@FindBy(xpath = "//div[@class = 'return__confirm-message']//descendant::p") public WebElement returnConfirm;
	
	@FindBy(id = "reviewBtn") public WebElement reviewBtn;
	
	@FindBy(id = "headlineInput") public WebElement headlineInput;
	
	@FindBy(id = "descriptionInput") public WebElement descriptionInput;
	
	@FindBy(id = "reviewSubmitBtn") public WebElement reviewSubmitBtn;
	
	@FindBy(xpath = "//div[@class = 'Toastify__toast-body']//descendant::div") public WebElement message;
}
