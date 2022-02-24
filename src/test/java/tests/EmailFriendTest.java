package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.EmailPage;
import pages.HomePage;
import pages.LoginPage;
import pages.ProductDetailsPage;
import pages.SearchPage;
import pages.UserRegistrationPage;

public class EmailFriendTest extends TestBase {
	
	//1-user registration
	HomePage homeobject ; 
	UserRegistrationPage registerobject ;
	LoginPage loginObject ;
	String productName = "Apple MacBook Pro 13-inch"; 
	SearchPage searchObject ; 
	ProductDetailsPage detailsObject ; 
	EmailPage emailObejct ;
	
	@Test (priority = 1)
	public void UserCanRegisterSuccessfully () {

		homeobject = new HomePage(driver);
		homeobject.openRegistrationPage();
		registerobject = new UserRegistrationPage (driver);
		registerobject.userRegistration("Omnia", "Hesham", "omnia652@gmail.com", " 12345678 ");
		Assert.assertEquals(registerobject.successMessage.getText(), "Your registration completed");
	}
		//2-search for product
		
		@Test (priority = 2)
		public void UserCanSearchForProducts1() 
		{
			searchObject  = new SearchPage(driver); 
			detailsObject = new ProductDetailsPage(driver); 
			searchObject.ProductSearch(productName);
			searchObject.OpenProductDetailsPage();
			Assert.assertEquals(detailsObject.productNamebreadcrumb.getText(), productName);
		}
		//3-email to friend 
		@Test (priority = 3)
		public void RegisteredUserCanSendProductToFriend () {
			detailsObject.opensendemail();
			emailObejct = new EmailPage(driver);
			emailObejct.sendemailtofriend("2321@test.com", "hello my friend checkout this product");
		Assert.assertTrue(emailObejct.MessageNotification.getText().contains("Your message has been sent"));
			
		}

	

	
//4- user log out 
@Test (priority = 4)
public void RegisteredUserCanLogout () {
	registerobject.userLogout () ;
}

}
