package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;
import pages.UserRegistrationPage;

public class UserRegistrationTest extends TestBase {

	HomePage homeobject ; 
	UserRegistrationPage registerobject ;
	LoginPage loginObject ;
	@Test (priority = 1)
	public void UserCanRegisterSuccessfully () {

		homeobject = new HomePage(driver);
		homeobject.openRegistrationPage();
		registerobject = new UserRegistrationPage (driver);
		registerobject.userRegistration("Omnia", "Hesham", "omnia202@gmail.com", " 12345678 ");
		Assert.assertEquals(registerobject.successMessage.getText(), "Your registration completed");

	}
@Test (priority = 2)
public void RegisteredUserCanLogout () {
	registerobject.userLogout () ;
}
@Test (priority = 3)
public void RegisteredUserCanLogin () {
	homeobject.openLoginPage () ;
	loginObject = new LoginPage(driver);
	loginObject.UserLogin("omnia224@gmail.com" , "12345678" );
	//Assert.assertTrue(registerobject.logoutlink.getText().equals("Log out"));

}

}