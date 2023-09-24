package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class YourCartPage
{
	WebDriver drv;

	@FindBy(xpath = "//*[text() = 'Your Cart']")
	public WebElement yourcart;	

	@FindBy(xpath = "//*[text() = 'CHECKOUT']")
	public WebElement checkout;		

		

	public YourCartPage(WebDriver drv)
	{
		this.drv = drv;
		PageFactory.initElements(drv, this);
	}

	public void YourCartDisplay()
	{
		yourcart.isDisplayed();
	}
	public void checkoutbtn()
	{
		checkout.click();
	}

}
