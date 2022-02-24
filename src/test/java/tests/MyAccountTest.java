package tests;

import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;
import pages.MyAccountPage;
import pages.UserRegistrationPage;

public class MyAccountTest extends TestBase { 
	HomePage homeobject ; 
	UserRegistrationPage registerobject ;
	LoginPage loginObject ;
	MyAccountPage myaccountObject ;
	String oldpassword = " 12345678 " ;
	String newpassword = " 123456 " ;
	String firstName = "Asser" ;
	String lastName = "Abbas" ;
	String email = "testc224@gmail.com" ;
	@Test (priority = 1)
	public void UserCanRegisterSuccessfully () {

		homeobject = new HomePage(driver);
		homeobject.openRegistrationPage();
		registerobject = new UserRegistrationPage (driver);
		registerobject.userRegistration(firstName, lastName, email, oldpassword);
		//Assert.assertTrue(registerobject.successMessage.getText().contains("Your registration completed"));

	}
@Test (priority = 2 )
public void RegisteredUserCanChangePassword () {
	myaccountObject = new MyAccountPage(driver);
	registerobject.OpenMyAccountPage();
	myaccountObject.openChangePasswordPage();
	myaccountObject.ChangePassword(oldpassword, newpassword);
	//Assert.assertTrue(myaccountObject.resultlbl.getText().contains("Password was changed"));
}
@Test (priority = 3)
public void RegisteredUserCanLogout () {
	registerobject.userLogout(); 
}
@Test (priority = 4)
public void RegisteredUserCanLoginwithnewpassword () {
	homeobject.openLoginPage () ;
	loginObject = new LoginPage(driver);
	loginObject.UserLogin(email , newpassword );
	//Assert.assertTrue(registerobject.logoutlink.getText().contains("Log out"));

}
}
