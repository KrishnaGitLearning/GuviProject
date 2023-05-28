package BestBuyTestCase;

import static org.testng.Assert.assertEquals;

import java.net.HttpURLConnection;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import BestBuyBase.BaseClass;
import BestBuyPages.PagesClass;

public class TestCases extends BaseClass {
	
	
	@Test // Test Case Passed
	public void TestCase001() { 
		
		///loading the URL www.bestbuy.com
		
		PagesClass country = new PagesClass();
		country.countrySelection();
		
	}
	
	@Test // Test Case Passed
	public void TestCase002() throws Exception { 
		
		/// Checking if the link www.bestbuy.com is not broken
		
		driver.get("https://www.bestbuy.com/");
		String url = "https://www.bestbuy.com/";
		
		HttpURLConnection connection = (HttpURLConnection) new URL(url).openConnection();
		connection.setRequestMethod("HEAD");
		connection.connect();
		int respCode = connection.getResponseCode();
		if(respCode == 200) {
			
			System.out.println("The link is not Broken");
		} else {
			
			System.out.println("The link is Broken");

			
		}
		
		
	}
		
	@Test // Test Case Failed
	public void TestCase003SignUp() throws Exception{
		
		//postive
		PagesClass cAccount = new PagesClass();
		cAccount.SignUp("Krishnamoorthy", "Kasi", "Krishnaseven@hotmail.com", "GuviProject*@123", "GuviProject*@123", "7243748910");
		//negative
		PagesClass cAccount2 = new PagesClass();
		cAccount2.SignUp("Krishnamoorthy", "Kasi", "nirmaladevi@gmail.com", "GuviProject*@123", "123", "7243748910");
		
		
		
		// Test Case Failed - Screenshot attached

		
		
	}
	
	@Test // Test Case Passed
	public void TestCase003SignIn() throws Exception {
		
		PagesClass sAccount1 = new PagesClass();
		sAccount1.signIn("Krishnaseven@hotmail.com", "GuviProject*@124");
		
		// Test Case Failed - Screenshot attached
		
		
	}
	
	
	@Test
	public void TestCase004ValidationTitle() {
		
		PagesClass menuTitleValidation = new PagesClass();
		menuTitleValidation.MenuValidationTitle();
		String actual = driver.getTitle();
		String expected = "Top Deals and Featured Offers on Electronics - Best Buy";
		Assert.assertEquals(actual, expected);
		System.out.println(driver.getTitle());

		
	}
	
	@Test
	public void TestCase004ValidationTitle2() {
		
		PagesClass menuTitleValidation2 = new PagesClass();
		menuTitleValidation2.MenuValidationTitle2();
		String actual = driver.getTitle();
		String expected = "Deal of the Day: Electronics Deals - Best Buy";
		Assert.assertEquals(actual, expected);
		System.out.println(driver.getTitle());
		
		
	}
	
	@Test
	public void TestCase004ValidationTitle3() {
		
		PagesClass menuTitleValidation3 = new PagesClass();
		menuTitleValidation3.MenuValidationTitle3();
		String actual = driver.getTitle();
		String expected = "Best Buy Totaltech™ – Best Buy";
		Assert.assertEquals(actual, expected);
		System.out.println(driver.getTitle());

		
	}
	
	
	@Test
	public void TestCase005bottomValidation1() {
		
		PagesClass bottomlink1 = new PagesClass();
		bottomlink1.bottomlinkPage1();
		String actual = driver.getTitle();
		String expected = "Gifts Cards and E-Gift Cards - Best Buy";
		Assert.assertEquals(actual, expected);
		System.out.println(driver.getTitle());
		
		
	}
	
	
	@Test
	public void TestCase005bottomValidation2() {
		
		PagesClass bottomlink2 = new PagesClass();
		bottomlink2.bottomlinkPage2();
		String actual = driver.getTitle();
		String expected = "Best Buy Jobs - Best Buy Jobs";
		Assert.assertEquals(actual, expected);
		System.out.println(driver.getTitle());
		
		
		
	}
	
	
	@Test // Test Case Passed
	public void TestCase006ShoppingCart() throws Exception {
		
		PagesClass cart = new PagesClass();
		cart.addToCart("airpods pro");
		
		
	}
	
	@Test // Test Case Passed
	public void TestCase007MenuAddCart() {
		
		PagesClass menuCart = new PagesClass();
		menuCart.addAnItemFromMenu();
		
		
		
	}
	
	@Test // Test Case Passed
	public void TestCase008MenuBrandAddCart() {
		
		PagesClass brandToCart = new PagesClass();
		brandToCart.brandXbox();
			
	}
	
	@Test
	public void TestCase009CheckOut() throws Exception {
		
		PagesClass checkout = new PagesClass();
		checkout.checkOutAndPayment("Krishna7591@gmail.com", "2025550166");		
		//with right password and user name, not able to log in, screenshot will be taken once the script is done
		
	}
	
	
	@Test
	public void TestCase010orderConfirmationMsg() throws Exception {
		
		
		PagesClass orderConf = new PagesClass();
		orderConf.orderConfirmation("nirmaladevi@gmail.com", "2025550166", "3566000020000410");
		
		//Test Case Failed. getting error in the page, but script is completed
	}
	
	
	
	
}
