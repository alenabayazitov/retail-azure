package framework.steps;

import org.junit.Assert;

import framework.pages.POMFactory;
import framework.utilities.CommonUtility;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class ProductsSteps extends CommonUtility {

	private POMFactory factory = new POMFactory();
	
	@And("User click on item")
	public void userClickOnItem() {
		click(factory.productPage().product);
		logger.info("user clicked on item");
	}
	
	@And("User select quantity {string}")
	public void userSelectQuantity(String quantity){
		selectByValue(factory.productPage().quantitySelect, quantity);
		logger.info("user selected quantity" + quantity);
	}
	
	@And("User click add to Cart button")
	public void userClickAddToCartButton() {
		click(factory.productPage().addToCartBtn);
		logger.info("user clicked on add to cart button");
	}
	
	@Then("The cart icon quantity should change to {string}")
	public void theCartIconQuantityShouldChangeTo(String quantity) {
		Assert.assertTrue(getText(factory.productPage().cartQuantity).equals(quantity));
		logger.info("the cart icon quantity changed to " + quantity);
	}
	
	
}
