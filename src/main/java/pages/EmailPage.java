package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EmailPage extends PageBase {

	public EmailPage(WebDriver driver) {
		super(driver);
	}
@FindBy (id="FriendEmail")
WebElement FriendEmailTxt;

@FindBy (id="PersonalMessage")
WebElement PersonalMessageTxt;

@FindBy (name  = "send-email")
WebElement SendemailBtn;

@FindBy (css="div.result")
public WebElement MessageNotification;

public void sendemailtofriend (String friendemail, String personalMessage) {
	setTextElementText(FriendEmailTxt, friendemail);
	setTextElementText(PersonalMessageTxt, personalMessage);
	clickButton(SendemailBtn);
}
}
