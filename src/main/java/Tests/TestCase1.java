package Tests;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import Pages.LoginPage;
import Pages.ProductsPage;
import Pages.YourCartPage;
import Pages.YourInformationPage;

public class TestCase1
{

	public static void main(String[] args) throws Exception 
	{
		WebDriver drv = new ChromeDriver();
		drv.manage().window().maximize();
		drv.get("https://www.saucedemo.com/v1/");
		WebDriverWait w = new WebDriverWait(drv,Duration.ofSeconds(10));
		
		LoginPage lpage = new LoginPage(drv);	
		lpage.usernamedata("standard_user");
		lpage.passworddata("secret_sauce");
		lpage.loginclick();
		
		ProductsPage ppage = new ProductsPage(drv);
		//w.until(ExpectedConditions.alertIsPresent());
		Select s = new Select(ppage.Productdropdown);
		//List<WebElement> options = s.getOptions();
		s.selectByValue("hilo");
		Thread.sleep(5000);
		ppage.addtocartbtn();
		ppage.shpgcartbtn();
		
		YourCartPage ycart = new YourCartPage(drv);
		ycart.checkoutbtn();
		
		YourInformationPage infopage = new YourInformationPage(drv);
		infopage.fnamedata("Abc");
		infopage.lnamedata("xyz");
		infopage.postalcodedata("1234");
		infopage.continuebtn();
		
		drv.close();

	}

}
