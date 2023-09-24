package NewPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Google_Search
{
	WebDriver drv;

	@FindBy(xpath = "//*[@class= 'gLFyf']")
	public WebElement Gsearch;


public Google_Search(WebDriver drv)
{
	this.drv = drv;
	PageFactory.initElements(drv, this);
}

public void Gsearchdata(String Gdata)
{
	Gsearch.sendKeys(Gdata);
}

}