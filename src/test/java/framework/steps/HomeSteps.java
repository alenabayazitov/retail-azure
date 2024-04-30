package framework.steps;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;

import framework.pages.POMFactory;
import framework.utilities.CommonUtility;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomeSteps extends CommonUtility {

	private POMFactory factory = new POMFactory();
	
	@Given("User is on retail website")
	public void userIsOnRetailWebsite() {
		String expectedTitle = "React App";
		String actualTitle = getTitle(); 
		Assert.assertEquals(expectedTitle, actualTitle); 
		logger.info(actualTitle + " is equal to " + expectedTitle);
	}
	
	@When("User click on All section")
	public void userClickOnAllSection() {
		click(factory.homePage().allSectionBtn);
		logger.info("user clicked on all section button");
	}
	
	@Then("Below options are present in Shop By Department sidebar")
	public void belowOptionsArePresentInShopByDepartmentSidebar(DataTable options) {
		List<List<String>> optionsToDisplay = options.asLists(String.class);
		for(int i=0;i<optionsToDisplay.get(0).size();i++) {
            System.out.println(getDriver().findElement(By.xpath("//span[text() = '" + optionsToDisplay.get(0).get(i) + "']" )).getText());
        Assert.assertTrue(isElementDisplayed(getDriver().findElement(By.xpath("//span[text() = '" + optionsToDisplay.get(0).get(i) + "']" ))));
        }
		logger.info("options" +  optionsToDisplay.get(0).get(0)+ ", " + optionsToDisplay.get(0).get(1) + ", " + optionsToDisplay.get(0).get(2) + ", " + optionsToDisplay.get(0).get(3)+ ", " + optionsToDisplay.get(0).get(4) + " are present");
	}
	
	@When("User click on Sign in option")
	public void userClickOnSignInOption() {
		click(factory.homePage().signIn);
		logger.info("user clicked on sign in option");
	}
	
	@And("User on {string}")
	public void userOnDepartment(String department) {
		click(getDriver().findElement(By.xpath("//div[@class = 'sidebar_content-item']//child::span[text() = '" + department + "']")));
		logger.info("user clicked on department " + department + " option");
	}
	
	@Then("Below options are present in department")
	public void bellowOptionsArePresentInDepartment(DataTable data) {
		List<List<String>> options = data.asLists(String.class);
		Assert.assertTrue(isElementDisplayed(getDriver().findElement(By.xpath("//div[@class = 'sidebar_content-item']//child::span[text() = '" + options.get(0).get(0) + "']"))));
		Assert.assertTrue(isElementDisplayed(getDriver().findElement(By.xpath("//div[@class = 'sidebar_content-item']//child::span[text() = '" + options.get(0).get(1) + "']"))));
		logger.info("options are present in department");
	}
	
	@And("User change the category to {string}")
	public void userChangeTheCategoryTo(String category) {
		selectByVisibleText(factory.homePage().departmentSearch, category);
		logger.info("user changed the category to " + category);
	}
	
	@And("User search for an item {string}")
	public void userSearchForAnItem(String item) {
		sendText(factory.homePage().searchInputField, item);
		logger.info("user search for an item " + item);
	}
	
	@And("User click on Search icon")
	public void userClickOnSearchIcon() {
		click(factory.homePage().searchBtn);
		logger.info("user clicked on Search icon");
	}
	
	@And("User click on Cart option")
	public void userClickOnCartOption() {
		click(factory.homePage().cartSign);
		logger.info("user clicked on cart option");
	}
	
	@And("User click on Orders section")
	public void userClickOnOrdersSection() {
		click(factory.homePage().orderLink);
		logger.info("user clicked on Orders section");
	}
	
	
	
}
