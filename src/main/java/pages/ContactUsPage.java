package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactUsPage extends PageBase{

	public ContactUsPage(WebDriver driver) {
		super(driver);
	}
@FindBy (id="FullName")
WebElement FullNameTxtBox ;

@FindBy (id="Email")
WebElement EmailTxtBox ;

@FindBy (id="Enquiry")
WebElement EnquiryTxt;

@FindBy(name = "send-email")
WebElement SubmitBtn ;

@FindBy (css = "div.result")
public WebElement SuccessMessage;


public void ContactUs (String fullname , String email , String message ) {
	setTextElementText(FullNameTxtBox, fullname);
	setTextElementText(EmailTxtBox, email);
	setTextElementText(EnquiryTxt, message);
	clickButton(SubmitBtn);
	
}
	
	
	
}
