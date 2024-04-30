package framework.steps;

import org.junit.Assert;
import org.openqa.selenium.By;

import framework.pages.POMFactory;
import framework.utilities.CommonUtility;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class CheckoutSteps extends CommonUtility {

	private POMFactory factory = new POMFactory();
	
	@And("User click Add a new address link for shipping address")
	public void userClickAddANewAddressLinkForShippingAddress() {
		click(factory.checkoutPage().addAddressBtn);
		logger.info("user clicked add a new address link for shipping address");
	}
	
	@And("User click Add a Credit card or Debit Card for Payment method")
	public void userClickAddACreditCardOrDebitCardForPaymentMethod() {
		clickElementWithJS(waitTillClickable(factory.checkoutPage().addPaymentBtn));
		logger.info("user clicked add a credit card or debit card for payment method");
		
	}
	
	@And("User click on Place Your Order")
	public void userClickOnPlaceYourOrder() {
		clickElementWithJS(waitTillClickable(factory.checkoutPage().placeOrderBtn));
		logger.info("user clicked on place your order button");
	}
	
	@Then("A Message should be displayed {string}")
	public void aMessageShouldBeDisplayed(String message) {
		Assert.assertTrue(isElementDisplayed(waitTillPresence(getDriver().findElement(By.xpath("//p[text() = '" + message + "']")))));
		logger.info("a message is displayed " + message);
	}
	
}
