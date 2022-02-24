package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.ContactUsPage;
import pages.HomePage;

public class ContactUsTest extends TestBase{
	
	HomePage home ;
	ContactUsPage contactpage ;
	
String fullName ="Test User" ;
String email = "test1873@test.com";
String enquiry = "Hello admin , this is for testing";

@Test 
public void UserCanContactUs () {
	home = new HomePage(driver);
	home.openContactUsPage();
	contactpage = new ContactUsPage(driver);
	contactpage.ContactUs(fullName, email, enquiry);
	Assert.assertTrue(contactpage.SuccessMessage.getText().contains("enquiry has been successfully sent to the store owner."));
}

}
