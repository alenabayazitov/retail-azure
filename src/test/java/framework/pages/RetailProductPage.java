package framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import framework.base.BaseSetup;

public class RetailProductPage extends BaseSetup {

	public RetailProductPage() {
		PageFactory.initElements(getDriver(), this);
	}
	
	@FindBy(css = "div[class = 'products__layout']>p[class = 'products__name']") public WebElement product;
	
	@FindBy(xpath = "//select[@class = 'product__select']") public WebElement quantitySelect;
	
	@FindBy(id = "addToCartBtn") public WebElement addToCartBtn;
	
	@FindBy(id = "cartQuantity") public WebElement cartQuantity;
	
	
}
