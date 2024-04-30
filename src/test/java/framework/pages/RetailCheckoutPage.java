package framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import framework.base.BaseSetup;

public class RetailCheckoutPage extends BaseSetup {

	public RetailCheckoutPage() {
		PageFactory.initElements(getDriver(), this);
	}
	
	@FindBy(id = "addAddressBtn") public WebElement addAddressBtn;
	
	@FindBy(xpath = "//button[@id = 'addPaymentBtn']") public WebElement addPaymentBtn;
	
	@FindBy(xpath = "//img[@class = 'checkout__payment-image']") public WebElement checkoutPaymentImage;
	
	@FindBy(id = "placeOrderBtn") public WebElement placeOrderBtn;
	
	@FindBy(id = "paymentSubmitBtn") public WebElement paymentSubmitBtn;
	
	
	
}
