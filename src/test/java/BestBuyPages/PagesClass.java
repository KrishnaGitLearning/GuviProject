package BestBuyPages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import BestBuyUtils.Utils;

public class PagesClass extends Utils {

	// Common
	// country Selecting Locator
	@FindBy(xpath = "//img[@alt='United States']")
	WebElement country;

	// HomePageAccountLocator
	@FindBy(xpath = "//span[@class='v-p-right-xxs line-clamp']")
	WebElement account;

	// HomePageSigninlocators
	@FindBy(xpath = "//a[contains(text(), 'Sign in or Create Account')]")
	WebElement HomesignIn;
	@FindBy(xpath = "//input[@id='fld-e']")
	WebElement emailAddress;
	@FindBy(xpath = "//input[@id='fld-p1']")
	WebElement passWord;
	@FindBy(xpath = "//button[@class='c-button c-button-secondary c-button-lg c-button-block c-button-icon c-button-icon-leading cia-form__controls__submit ']")
	WebElement signInbutton;

	// Create an account Locator
	@FindBy(xpath = "//a[@href='/identity/global/createAccount']")
	WebElement createAccount;
	@FindBy(id = "firstName")
	WebElement firstName;
	@FindBy(id = "lastName")
	WebElement Lastname;
	@FindBy(id = "email")
	WebElement CreateAccountemail;
	@FindBy(name = "fld-p1")
	WebElement RegisterFirstPassword;
	@FindBy(id = "reenterPassword")
	WebElement RegisterReEnterPassword;
	@FindBy(id = "phone")
	WebElement mobilePhone;
	@FindBy(xpath = "//button[@class='c-button c-button-secondary c-button-lg c-button-block c-button-icon c-button-icon-leading cia-form__controls__submit ']")
	WebElement CreateAnAccountSubmitButton;

	// 4. Write a code for navigation of all Menu and validation of title in each
	// page.

	@FindBy(xpath = "(//a[@class='bottom-left-links '])[1]")
	WebElement topDeals;

	@FindBy(xpath = "(//a[@class='bottom-left-links '])[2]")
	WebElement DealOfTheDay;

	@FindBy(xpath = "(//a[@class='bottom-left-links '])[3]")
	WebElement TotalTech;

	@FindBy(xpath = "(//a[@class='bottom-left-links '])[4]")
	WebElement creditCard;

	@FindBy(xpath = "(//a[@class='bottom-left-links '])[5]")
	WebElement giftCards;
	
	//5.	Write a code to validate the bottom links on the homepage.
	
	@FindBy(xpath = "//a[@href='/site/electronics/gift-cards/cat09000.c?id=cat09000#/']")
	WebElement giftCardlink;
	@FindBy(xpath = "//a[@href='https://jobs.bestbuy.com/bby']")
	WebElement careers;
	

	
	// 6. Write code to search for and add an item to the shopping cart.
	@FindBy(xpath = "//input[@id = 'gh-search-input']")
	WebElement homesearch;
	@FindBy(xpath = "//span[@class='header-search-icon']//*[name()='svg']")
	WebElement productSearch;
	@FindBy(xpath = "(//button[@class='c-button c-button-primary c-button-sm c-button-block c-button-icon c-button-icon-leading add-to-cart-button'])[1]")
	WebElement addToCart;
	@FindBy(xpath = "//div[@class = 'quantity']")
	WebElement addToCartText;

	// 7. Write a code to select and add an item from (Menu à Shop by Department).

	@FindBy(xpath = "//button[@class='c-button-unstyled hamburger-menu-button']")
	WebElement menu;
	@FindBy(xpath = "(//button[@class='c-button-unstyled hamburger-menu-flyout-list-item '])[5]")
	WebElement audio;
	@FindBy(xpath = "(//button[@class='c-button-unstyled hamburger-menu-flyout-list-item '])[2]")
	WebElement headPhones;
	@FindBy(xpath = "(//a[@class='hamburger-menu-flyout-list-item  '])[1]")
	WebElement airPods;
	@FindBy(xpath = "(//button[@class='c-button c-button-primary c-button-sm c-button-block c-button-icon c-button-icon-leading add-to-cart-button'])[1]")
	WebElement addtoCartAirPods;

	// 8. Write a code to select and add an item from (Menu à Brands à Select Any
	// Brand).

	@FindBy(xpath = "(//button[@class='c-button-unstyled top-four v-fw-medium'])[3]")
	WebElement brand;
	@FindBy(xpath = "(//a[@class='hamburger-menu-flyout-list-item  '])[4]")
	WebElement microsoft;
	@FindBy(xpath = "(//div[@class='tile-heading esg-link esg-margin-top-none'])[3]")
	WebElement xBox;
	@FindBy(xpath = "(//a[@class='flex-link'])[4]")
	WebElement clickXboxAccessories;
	@FindBy(xpath = "(//button[@class='c-button c-button-primary c-button-sm c-button-block c-button-icon c-button-icon-leading add-to-cart-button'])[1]")
	WebElement addToCartXbox;
	@FindBy(xpath = "(//img[@class = 'esg-image'])[2]")
	WebElement xbox2;
	@FindBy(xpath = "(//a[@class = 'flex-link'])[4]")
	WebElement clickXboxAccessories2;
	@FindBy(xpath = "(//button[@class = 'c-button c-button-primary c-button-sm c-button-block c-button-icon c-button-icon-leading add-to-cart-button'])[1]")
	WebElement hardrive;

	// @FindBy(xpath= "//a[@class='c-button c-button-secondary c-button-sm
	// c-button-block ']")
	// WebElement gotoCart;
	@FindBy(xpath = "(//a[normalize-space()='Go to Cart'])[1]")
	WebElement gotocart2;
	@FindBy(xpath = "//button[@class='btn btn-lg btn-block btn-primary']")
	WebElement checkout;

	@FindBy(xpath = "//input[@id='fld-e']")
	WebElement paymentLogin;

	@FindBy(xpath = "//input[@id='fld-p1']")
	WebElement paymentPassword;

	@FindBy(xpath = "//button[@class='c-button c-button-secondary c-button-lg c-button-block c-button-icon c-button-icon-leading cia-form__controls__submit ']")
	WebElement paymentSignIn;

	@FindBy(xpath = "//button[@class='c-button c-button-secondary c-button-lg cia-guest-content__continue guest']")
	WebElement continueAsGuest;

	@FindBy(xpath = "//input[@id='user.emailAddress']")
	WebElement paymentEmailAddress;

	@FindBy(xpath = "//input[@id='user.phone']")
	WebElement phone;

	@FindBy(xpath = "//button[@class='btn btn-lg btn-block btn-secondary']")
	WebElement continuePayment;
	
	@FindBy(xpath = "//input[@id='number']")
	WebElement creditCardPayment;
	
	@FindBy(xpath = "//select[@id='expMonth']']")
	WebElement selectMonth;
	
	@FindBy(xpath = "//select[@id='expYear']")
	WebElement selectYear;
	
	@FindBy(xpath = "//input[@id='cvv']")
	WebElement CVV;
	
	@FindBy(xpath = "//input[@id='first-name']")
	WebElement paymentName;
	
	@FindBy(xpath = "//input[@id='last-name']")
	WebElement paymentLName;
	
	@FindBy(xpath = "//input[@name='addressLine1']")
	WebElement addressCreditCard;
	
	@FindBy(xpath = "//input[@name='city']")
	WebElement cityCreditCard;
	
	@FindBy(xpath = "//Select[@name='state']")
	WebElement stateDropDown;
	
	@FindBy(xpath = "//input[@name='postalCode']")
	WebElement zipCode;
	
	
	

	public PagesClass() {

		PageFactory.initElements(driver, this);

	}

	public void countrySelection() {

		country.click();

	}

	public void createAccount(String firstName, String Lastname, String CreateAccountemail,
			String RegisterFirstPassword, String RegisterReEnterPassword, String mobilePhone) {

	}

	public void signIn(String emailID, String pass) throws Exception {

		clickElement(country);
		clickElement(HomesignIn);
		this.emailAddress.sendKeys(emailID);
		this.passWord.sendKeys(pass);
		signInbutton.click();
		System.out.println(driver.getTitle());
		Thread.sleep(5000);
		this.Screenshot(driver,
				"C:\\Users\\krishnamoorthy.kasi\\OneDrive - SoftwareONE\\Desktop\\Selenium Original\\TestAutomation\\Screenshot.png");
	}

	public void SignUp(String fName, String lName, String createEmail, String rPassword, String rePassword,
			String mPhone) throws Exception {

		clickElement(country);
		// Thread.sleep(20000);
		clickElement(createAccount);
		this.firstName.sendKeys(fName);
		this.Lastname.sendKeys(lName);
		this.CreateAccountemail.sendKeys(createEmail);
		this.RegisterFirstPassword.sendKeys(rPassword);
		this.RegisterReEnterPassword.sendKeys(rePassword);
		this.mobilePhone.sendKeys(mPhone);
		// JavascriptExecutor js = (JavascriptExecutor) driver;
		// js.executeScript("window.scrollBy(0,250)", "");

		CreateAnAccountSubmitButton.click();
		Thread.sleep(5000);
		this.Screenshot(driver,
				"C:\\Users\\krishnamoorthy.kasi\\OneDrive - SoftwareONE\\Desktop\\Selenium Original\\TestAutomation\\Screenshot.png");

	}

	public void MenuValidationTitle() {

		clickElement(country);
		clickElement(topDeals);

		
	}

	public void MenuValidationTitle2() {

		clickElement(country);

		clickElement(DealOfTheDay);

	}

	public void MenuValidationTitle3() {

		clickElement(country);
		clickElement(TotalTech);

	}
	
	public void bottomlinkPage1() {

		clickElement(country);
		clickElement(giftCardlink);

		
	}
	
	
	public void bottomlinkPage2() {

		clickElement(country);
		clickElement(careers);

		
	}

	

	public void addToCart(String airPodPro) throws Exception {

		clickElement(country);
		// clickElement(HomesignIn);
		// this.emailAddress.sendKeys(emailID);
		// this.passWord.sendKeys(pass);
		// clickElement(signInbutton);
		// Thread.sleep(5000);
		waitforme(homesearch);
		this.homesearch.sendKeys(airPodPro);
		clickElement(productSearch);
		addToCart.click();

	}

	public void addAnItemFromMenu() {

		clickElement(country);
		clickElement(menu);
		clickElement(audio);
		clickElement(headPhones);
		clickElement(airPods);
		clickElement(addtoCartAirPods);

	}

	public void brandXbox() {

		clickElement(country);
		clickElement(menu);
		clickElement(brand);
		clickElement(microsoft);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)", "");
		clickElement(xBox);
		clickElement(clickXboxAccessories);
		clickElement(addToCartXbox);

	}

	public void checkOutAndPayment(String pEmail, String pPhone) throws Exception {

		clickElement(country);
		clickElement(menu);
		clickElement(brand);
		clickElement(microsoft);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)", "");
		clickElement(xbox2);
		clickElement(clickXboxAccessories2);
		clickElement(hardrive);
		driver.getWindowHandle();
		// driver.switchTo().defaultContent();
		// Actions act = new Actions(driver);
		// act.moveToElement(gotocart2).perform();
		clickElement(gotocart2);
		clickElement(checkout);
		clickElement(continueAsGuest);
		Thread.sleep(5000);
		this.paymentEmailAddress.sendKeys(pEmail);
		this.phone.sendKeys(pPhone);
		clickElement(continuePayment);
		// Thread.sleep(5000);
		// this.Screenshot(driver, "C:\\Users\\krishnamoorthy.kasi\\OneDrive -
		// SoftwareONE\\Desktop\\Selenium Original\\TestAutomation\\Screenshot.png");

	}
	
	
	public void orderConfirmation(String pEmail, String pPhone, String cCard) throws Exception {
		
		
		clickElement(country);
		clickElement(menu);
		clickElement(brand);
		clickElement(microsoft);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)", "");
		clickElement(xbox2);
		clickElement(clickXboxAccessories2);
		clickElement(hardrive);
		driver.getWindowHandle();
		clickElement(gotocart2);
		clickElement(checkout);
		clickElement(continueAsGuest);
		Thread.sleep(5000);
		this.paymentEmailAddress.sendKeys(pEmail);
		this.phone.sendKeys(pPhone);
		clickElement(continuePayment);
		this.creditCardPayment.sendKeys(cCard);
		Screenshot(driver, "C:\\Users\\krishnamoorthy.kasi\\OneDrive - SoftwareONE\\Desktop\\Selenium Original\\TestAutomation\\Screenshot.jpg");
		Select sel = new Select(selectMonth);
//		creditCardPayment
//		selectMonth
//		selectYear
//		CVV
//		paymentName
//		paymentLName
//		addressCreditCard
//		cityCreditCard
//		stateDropDown
//		zipCode
		
	
	
	
	}

}