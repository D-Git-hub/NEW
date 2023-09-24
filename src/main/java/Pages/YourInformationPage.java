package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class YourInformationPage
{
	WebDriver drv;

	@FindBy(xpath = "//*[@id = 'first-name']")
	public WebElement fname;	

	@FindBy(xpath = "//*[@id = 'last-name']")
	public WebElement lname;		

	@FindBy(xpath = "//*[@id = 'postal-code']")
	public WebElement postalcode;	
	
	@FindBy(xpath = "//*[text() = 'Checkout: Your Information']")
	public WebElement yourinfo;

	@FindBy(xpath = "//*[@value = 'CONTINUE']")
	public WebElement cntbtn;
	
	public YourInformationPage(WebDriver drv)
	{
		this.drv = drv;
		PageFactory.initElements(drv, this);
	}

	public void YourInformationDisplay()
	{
		yourinfo.isDisplayed();
	}
	public void fnamedata(String firstname)
	{
		fname.sendKeys(firstname);
	}
	public void lnamedata(String lastname)
	{
		lname.sendKeys(lastname);
	}
	public void postalcodedata(String pcode)
	{
		postalcode.sendKeys(pcode);
	}
	public void continuebtn()
	{
		cntbtn.click();
	}

}
