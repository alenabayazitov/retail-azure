package framework.steps;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import framework.pages.POMFactory;
import framework.utilities.CommonUtility;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AccountSteps extends CommonUtility{

	private POMFactory factory = new POMFactory();
	
	@When("User click on Account option")
	public void userClickOnAccountOption() {
		click(factory.accountPage().accountLink);
		logger.info("user clicked on Account option");
	}
	
	@And("User update Name {string} and Phone {string}")
	public void userUpdateNameAndPhone(String name, String phone) {
		clearTextUsingSendKeys(factory.accountPage().nameInputField);
		sendText(factory.accountPage().nameInputField, name);
		sendText(factory.accountPage().phoneNumberInput, phone);
		logger.info("user updated name to " + name + " and phone to " + phone);
	}
	
	@And("User click on Update button")
	public void userClickOUpdateButton() {
		click(factory.accountPage().personalUpdateBtn);
		logger.info("user clicked on update button");
	}
	
	@Then("User profile information should be updated")
	public void userProfileInformationShouldBeUpdated() {
		Assert.assertTrue(isElementDisplayed(waitTillPresence(factory.accountPage().updatePopUp)));
		logger.info("user profile information updated");
	}
	
	@And("User enter below information")
	public void userEnterBelowInformation(DataTable data) {
		List<Map<String, String>> passwordData = data.asMaps(String.class, String.class);
		sendText(factory.accountPage().previousPassword, passwordData.get(0).get("previousPassword"));
		sendText(factory.accountPage().newPasswordField, passwordData.get(0).get("newPassword"));
		sendText(factory.accountPage().confirmPasswordInput, passwordData.get(0).get("confirmPassword"));
		logger.info("user entered required password information into fields");
	}
	
	@And("User click on Change Password button")
	public void userClickOnChangePasswordButton() {
		click(factory.accountPage().changePasswordButton);
		logger.info("user clicked on Change Password button");
	}
	
	@Then("A message should be displayed {string}")
	public void aMessageShouldBeDisplayed(String message) {
		Assert.assertTrue(waitTillPresence(factory.accountPage().popUpmessage).getText().equals(message));
		logger.info(message + "is displayed");
	}
	
	@And("User click on Add a payment method link")
	public void userClickOnAddaPaymentMethodLink() {
		click(factory.accountPage().addPaymentMethodLink);
		logger.info("user clicked on Add a payment method link");
	}
	
	@And("User fill Debit or credit card information")
	public void userFillDebitOrCredirCardInformation(DataTable data) {
		List<Map<String, String>> cardData = data.asMaps(String.class, String.class);
		sendText(factory.accountPage().cardNumberInput, cardData.get(0).get("cardNumber"));
		sendText(factory.accountPage().nameOnCardInput, cardData.get(0).get("nameOnCard"));
		selectByVisibleText(factory.accountPage().expirationYearInput, cardData.get(0).get("expirationYear"));
		selectByVisibleText(factory.accountPage().expirationMonthInput, cardData.get(0).get("expirationMonth"));
		sendText(factory.accountPage().securityCodeInput, cardData.get(0).get("securityCode"));
		logger.info("user filled card information");
	}
	
	@And("User click on Add your card button")
	public void userClickOnAddYourCardButton() {
		click(factory.accountPage().addYourCardButton);
		logger.info("user clicked on Add your card button");
	}
	
	@And("User click on Edit option of card section")
	public void userClickOnEditOption() {
		click(factory.accountPage().cardSign);
		click(factory.accountPage().editButton);
		logger.info("user clicked on Edit option");
	}
	
	@And("User edit information with below data")
	public void userEditInformationWithBelowData(DataTable data) {
		List<Map<String, String>> newCardData = data.asMaps(String.class, String.class);
		clearTextUsingSendKeys(factory.accountPage().cardNumberInput);
		sendText(factory.accountPage().cardNumberInput, newCardData.get(0).get("cardNumber"));
		clearTextUsingSendKeys(factory.accountPage().nameOnCardInput);
		sendText(factory.accountPage().nameOnCardInput, newCardData.get(0).get("nameOnCard"));
		selectByVisibleText(factory.accountPage().expirationYearInput, newCardData.get(0).get("expirationYear"));
		selectByVisibleText(factory.accountPage().expirationMonthInput, newCardData.get(0).get("expirationMonth"));
		clearTextUsingSendKeys(factory.accountPage().securityCodeInput);
		sendText(factory.accountPage().securityCodeInput, newCardData.get(0).get("securityCode"));
		logger.info("user edited information with new card data");
	}
	
	@And("User click on Update Your Card button")
	public void userClickOnUpdateYourCardButton() {
		click(factory.accountPage().updateYourCardButton);
		logger.info("user clicked on update your card button");
	}
	
	@And("User click on remove option of card section")
	public void userClickOnRemoveOptionOfCardSection() {
		click(factory.accountPage().cardSign);
		factory.accountPage().cardText = factory.accountPage().cardSign.getText();
		click(factory.accountPage().removeCardButton);
		logger.info("user clicked on remove option");
	}
	
	@Then("Payment details should be removed")
	public void paymentDetailsShouldBeRemoved(){
		Assert.assertTrue(waitTillAbsence(factory.accountPage().cardSign));
			}
	
	@And("User click on Add address option")
	public void userClickOnAddAddressOption() {
		click(factory.accountPage().addNewAddressBtn);
		logger.info("user clicked on Add address option");
	}
	
	@And("User fill new address form with below information")
	public void userFillNewAddressFormWithBelowInformation(DataTable data) {
		List<Map<String, String>> addressData = data.asMaps(String.class, String.class);
		selectByVisibleText(factory.accountPage().countryDropdown, addressData.get(0).get("country"));
		sendText(factory.accountPage().fullNameInput, addressData.get(0).get("fullName"));
		sendText(factory.accountPage().phoneNumber, addressData.get(0).get("phoneNumber"));
		sendText(factory.accountPage().streetInput, addressData.get(0).get("streetAddress"));
		sendText(factory.accountPage().apartmentInput, addressData.get(0).get("apt"));
		sendText(factory.accountPage().cityInput, addressData.get(0).get("city"));
		selectByValue(factory.accountPage().stateDropdown, addressData.get(0).get("state"));
		sendText(factory.accountPage().zipCodeInput, addressData.get(0).get("zipCode"));
		logger.info("user filled new address form with data");
	}
	
	@And("User click Add Your Address button")
	public void userClickAddYourAddressButton() {
		click(factory.accountPage().addressBtn);
		logger.info("user clicked Add Your Address button");
	}
	
	@And("User click on edit address option")
	public void userClickOnEditAddressOption() {
		click(factory.accountPage().editAddressButton);
		logger.info("user clicked on Edit button");
	}
	
	@And("User fill new address form with below new information")
	public void userFillNewAddressFormWithBelowEditedInformation(DataTable data) {
		List<Map<String, String>> newAddressData = data.asMaps(String.class, String.class);
		selectByVisibleText(factory.accountPage().countryDropdown, newAddressData.get(0).get("country"));
		clearTextUsingSendKeys(factory.accountPage().fullNameInput);
		sendText(factory.accountPage().fullNameInput, newAddressData.get(0).get("fullName"));
		clearTextUsingSendKeys(factory.accountPage().phoneNumber);
		sendText(factory.accountPage().phoneNumber, newAddressData.get(0).get("phoneNumber"));
		clearTextUsingSendKeys(factory.accountPage().streetInput);
		sendText(factory.accountPage().streetInput, newAddressData.get(0).get("streetAddress"));
		clearTextUsingSendKeys(factory.accountPage().apartmentInput);
		sendText(factory.accountPage().apartmentInput, newAddressData.get(0).get("apt"));
		clearTextUsingSendKeys(factory.accountPage().cityInput);
		sendText(factory.accountPage().cityInput, newAddressData.get(0).get("city"));
		selectByValue(factory.accountPage().stateDropdown, newAddressData.get(0).get("state"));
		clearTextUsingSendKeys(factory.accountPage().zipCodeInput);
		sendText(factory.accountPage().zipCodeInput, newAddressData.get(0).get("zipCode"));
		logger.info("user filled new address form with new data");
	}
	
	@And("User click update Your Address button")
	public void userClickUpdateYourAddressButton() {
		click(factory.accountPage().updateYourAddressButton);
		logger.info("user clicked Update Your Address button");
	}
	
	@And("User click on remove option of Address section")
	public void userClickOnRemoveOptionOfAddressSection() {
		click(factory.accountPage().removeAddressButton);
		logger.info("user clicked on remove option of address section");
	}
	
	@Then("Address details should be removed")
	public void addressDetailsShouldBeRemoved() {
		Assert.assertTrue(waitTillAbsence(factory.accountPage().addressSign));
		logger.info("address details are removed");
	}
}
