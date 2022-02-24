package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserRegistrationPage extends PageBase
{

	public UserRegistrationPage(WebDriver driver) {
		super(driver);

	}

	@FindBy (id="gender-female")
	WebElement genderRdoBtn ;

	@FindBy (id="FirstName")
	WebElement fnTxtBox ;

	@FindBy (id="LastName")
	WebElement lnTxtbox ;

	@FindBy (id="Email")
	WebElement emailTxtBox ;

	@FindBy (id="Password")
	WebElement passwordTxtBox ;

	@FindBy (id="ConfirmPassword")
	WebElement confirmpasswordTxtBox ;

	@FindBy (id="register-button")
	WebElement registerBtn ;
	
	@FindBy (css="div.result")
	public WebElement successMessage ;
	
	@FindBy (className = "ico-logout")
	public WebElement logoutlink ;
	
	@FindBy (linkText = "My account")
	 public WebElement MyAccountLink ;

	public void userRegistration (String firstName , String lastName , String email , String Password) {
		clickButton(genderRdoBtn);
		setTextElementText(fnTxtBox, firstName);
		setTextElementText(lnTxtbox, lastName);
		setTextElementText(emailTxtBox, email);
		setTextElementText(passwordTxtBox, Password);
		setTextElementText(confirmpasswordTxtBox, Password);
		clickButton(registerBtn);	
	}

	public void userLogout() {
clickButton(logoutlink);		
	}
	public void OpenMyAccountPage () {
		clickButton(MyAccountLink);
	}
}
