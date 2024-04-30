package framework.steps;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import framework.pages.POMFactory;
import framework.utilities.CommonUtility;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class SignInSteps extends CommonUtility {

	private POMFactory factory = new POMFactory();
	
	@And("User enter email {string} and password {string}")
	public void userEnterEmailAndPasword(String email, String password) {
		sendText(factory.signinPage().emailInput, email);
		sendText(factory.signinPage().passwordInput, password);
		logger.info("email " + email + " and password " + password + " are entered");
	}
	
	@And("User click on login button")
	public void userClickOnLoginButton() {
		click(factory.signinPage().loginBtn);
		logger.info("user clicked on login button");
	}
	
		
	@Then("User should be logged in into Account")
	public void userShouldBeLoggedInIntoAccount() {
		Assert.assertTrue(isElementDisplayed(factory.homePage().logoutBtn));
		logger.info("user is logged in into Account");
	}
	
	@And("User click on Create New Account button")
	public void userClickOnCreateNewAccountButton() {
		click(factory.signinPage().newAccountBtn);
		logger.info("user clicked on Create New Account button");
	}
	
	@And("User fill the signUp information with below data")
	public void userFillTheSignUpFormWithBelowInformation(DataTable data) {
		List<Map<String, String>> signUpData = data.asMaps(String.class, String.class);
		sendText(factory.signUpPage().nameInput, signUpData.get(0).get("name"));
		sendText(factory.signUpPage().emailInput, signUpData.get(0).get("email"));
		sendText(factory.signUpPage().passwordInput, signUpData.get(0).get("password"));
		sendText(factory.signUpPage().confirmPasswordInput, signUpData.get(0).get("confirmPassword"));
		logger.info("user entered required information into sign up form");
	}
	
	@And("User click on SignUp button")
	public void userClickOnSignUpButton() {
		click(factory.signUpPage().signupBtn);
		logger.info("user clicked on SignUp button");
	}
	
	@Then("User should be logged into account page")
	public void userShouldBeLoggedIntoAccountPage() {
		Assert.assertTrue(isElementDisplayed(factory.accountPage().accountUsername));
		Assert.assertTrue(isElementDisplayed(factory.accountPage().yourProfileText));
		logger.info("user is logged into account page");
	}

}
