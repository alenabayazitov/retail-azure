package framework.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import framework.base.BaseSetup;

public class RetailAccountPage extends BaseSetup {

	public RetailAccountPage() {
		PageFactory.initElements(getDriver(), this);
	}
	
	@FindBy(xpath = "//h1[text() = 'Your Profile']") public WebElement yourProfileText;
	
	@FindBy(xpath = "//h1[@class = 'account__information-username']") public WebElement accountUsername;
	
	@FindBy(id = "accountLink") public WebElement accountLink;
	
	@FindBy(xpath = "//div[@class = 'account__personal-edit']//descendant::input[@id = 'nameInput']") public WebElement nameInputField;
	
	@FindBy(xpath = "//input[@class = 'account__input'][@id = 'personalPhoneInput']") public WebElement phoneNumberInput;
	
	@FindBy(id = "personalUpdateBtn") public WebElement personalUpdateBtn;
	
	@FindBy(xpath = "//div[text() = 'Personal Information Updated Successfully']") public WebElement updatePopUp;
	
	@FindBy(css = "div[class = 'Toastify__toast-body']>div:last-child") public WebElement popUpmessage;
	
	@FindBy(id = "previousPasswordInput") public WebElement previousPassword;
	
	@FindBy(id = "newPasswordInput") public WebElement newPasswordField;
	
	@FindBy(id = "confirmPasswordInput") public WebElement confirmPasswordInput;
	
	@FindBy(id = "credentialsSubmitBtn") public WebElement changePasswordButton;
	
	@FindBy(xpath = "//p[text() = 'Add a payment method']") public WebElement addPaymentMethodLink;
	
	@FindBy(id = "cardNumberInput") public WebElement cardNumberInput;
	
	@FindBy(id = "nameOnCardInput") public WebElement nameOnCardInput;
	
	@FindBy(xpath = "//select[@id = 'expirationMonthInput']") public WebElement expirationMonthInput;
	
	@FindBy(xpath = "//select[@id = 'expirationYearInput']") public WebElement expirationYearInput;
	
	@FindBy(id = "securityCodeInput") public WebElement securityCodeInput;
	
	@FindBy(id = "paymentSubmitBtn") public WebElement addYourCardButton;
	
	//@FindBy(xpath = "//div[@class = 'account__payment-image-wrapper']") public WebElement cardSign;
	
	@FindBy(xpath = "//p[@class = 'account__payment__sub-text']") public WebElement cardSign;
	
	public String cardText = new String();
	public WebElement oldCard = getDriver().findElement(By.xpath("//p[contains(text(),'" + cardText + "')]")) ;
	
	@FindBy(xpath = "//button[text() = 'Edit']") public WebElement editButton;
	
	@FindBy(xpath = "//button[text() = 'remove']") public WebElement removeCardButton;
	
	@FindBy(id = "paymentSubmitBtn") public WebElement updateYourCardButton;
	
	@FindBy(xpath = "//h1[@class = 'account__payment-new-title']") public WebElement addCardMessage;
	
	@FindBy(xpath = "//div[@class = 'account__address-new']") public WebElement addNewAddressBtn;
	
	@FindBy(id = "countryDropdown") public WebElement countryDropdown;
	
	@FindBy(id = "fullNameInput") public WebElement fullNameInput;
	
	@FindBy(xpath = "//div[@class = 'account__address-new-modal']//following::input[@id = 'phoneNumberInput']") public WebElement phoneNumber;
	
	@FindBy(id = "streetInput") public WebElement streetInput;
	
	@FindBy(id = "apartmentInput") public WebElement apartmentInput;
	
	@FindBy(id = "cityInput") public WebElement cityInput;
	
	@FindBy(css = "select[name = 'state']") public WebElement stateDropdown;
	
	@FindBy(id = "zipCodeInput") public WebElement zipCodeInput;
	
	@FindBy(id = "addressBtn") public WebElement addressBtn;
	
	@FindBy(xpath = "//button[text() = 'Edit']") public WebElement editAddressButton;
	
	@FindBy(xpath = "//button[text() = 'Remove']") public WebElement removeAddressButton;
	
	@FindBy(xpath = "//button[text() = 'Update Your Address']") public WebElement updateYourAddressButton;
	
	@FindBy(xpath = "//div[@class = 'account__address-single']") public WebElement addressSign;
	
}
