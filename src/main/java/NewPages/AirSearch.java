package NewPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AirSearch 
{
	WebDriver drv;

	@FindBy(xpath = "//*[@data-pcu = 'https://www.cheapflights.com.au/']")
	public WebElement Asearch;
	
	public AirSearch(WebDriver drv)
	{
		this.drv = drv;
		PageFactory.initElements(drv, this);
	}

	public void Asearchdata()
	{
		Asearch.click();
	}
}
