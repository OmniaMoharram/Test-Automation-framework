package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductDetailsPage extends PageBase {

	public ProductDetailsPage(WebDriver driver) {
		super(driver);
		
	}
@FindBy (className = "current-item")
public WebElement productNamebreadcrumb;

@FindBy (css = "button.button-2.email-a-friend-button")
public WebElement EmailafriendBtn;


@FindBy(css="span.price-value-4")
public WebElement productPricelbl ;

@FindBy(id="add-to-wishlist-button-4")
WebElement addToWishlistBtn ; 

@FindBy(linkText="Add your review")
WebElement addReviewLink; 

@FindBy(css="button.button-2.add-to-compare-list-button")
WebElement addToCompareBtn ; 

@FindBy(id="add-to-cart-button-4")
WebElement addToCartBtn ; 
public void opensendemail () {
	clickButton(EmailafriendBtn);
		
}
public void openAddReviewPage() 
{
	clickButton(addReviewLink);
}

public void AddProductToWishlist() 
{
	clickButton(addToWishlistBtn);
}

public void AddProductToCompare() 
{
	clickButton(addToCompareBtn);
}

public void AddToCart() 
{
	clickButton(addToCartBtn);
}

	
}

