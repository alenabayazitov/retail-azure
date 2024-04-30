package framework.pages;

import framework.base.BaseSetup;

public class POMFactory extends BaseSetup{

	private RetailHomePage homePage;
	private RetailSigninPage signinPage;
	private RetailSignUpPage signUpPage;
	private RetailAccountPage accountPage;
	private RetailProductPage productPage;
	private RetailShoppingCartPage cartPage;
	private RetailCheckoutPage checkoutPage;
	private RetailOrdersPage ordersPage;
	
	public POMFactory() {
		this.homePage = new RetailHomePage();
		this.signinPage = new RetailSigninPage();
		this.signUpPage = new RetailSignUpPage();
		this.accountPage = new RetailAccountPage();
		this.productPage = new RetailProductPage();
		this.cartPage = new RetailShoppingCartPage();
		this.checkoutPage = new RetailCheckoutPage();
		this.ordersPage = new RetailOrdersPage();
	}
	
	public RetailHomePage homePage() {
		return this.homePage;
	}
	
	public RetailSigninPage signinPage() {
		return this.signinPage;
	}
	
	public RetailSignUpPage signUpPage() {
		return this.signUpPage;
	}
	
	public RetailAccountPage accountPage() {
		return this.accountPage;
	}
	
	public RetailProductPage productPage() {
		return this.productPage;
	}
	
	public RetailShoppingCartPage cartPage() {
		return this.cartPage;
	}
	
	public RetailCheckoutPage checkoutPage() {
		return this.checkoutPage;
	}
	
	public RetailOrdersPage ordersPage() {
		return this.ordersPage;
	}
}
