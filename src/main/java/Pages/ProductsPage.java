package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ProductsPage
{
	WebDriver drv;

	@FindBy(xpath = "//*[text() = 'Products']")
	public WebElement products;	

	@FindBy(xpath = "(//*[text() = 'ADD TO CART'])[3]")
	public WebElement addtocart;		

	@FindBy(xpath = "//*[@data-icon = 'shopping-cart']")
	public WebElement shpgcart;	
	
	@FindBy(xpath = "//*[@text() = 'Sauce Labs Bolt T-Shirt']")
	public WebElement tshirtlogo;	
	
	@FindBy(xpath = "//*[@class = 'product_sort_container']")
	public WebElement Productdropdown;

	public ProductsPage(WebDriver drv)
	{
		this.drv = drv;
		PageFactory.initElements(drv, this);
	}

	public void productsDisplay()
	{
		products.isDisplayed();
	}

	
	public void addtocartbtn()
	{
		addtocart.click();
	}
	
	public void shpgcartbtn()
	{
		shpgcart.click();
	}

}
