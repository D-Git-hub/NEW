package NewPages;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AmazonPage 
{
	WebDriver drv;
	

	@FindBy(xpath = "//*[@id = 'searchDropdownBox']")
	public WebElement drpdwn;

	@FindBy(xpath = "//*[@type = 'submit']")
	public WebElement Submitbtn;
	
	@FindBy(xpath = "//*[@aria-label ='4 Stars & Up']")
	public WebElement Scroll;
	
	@FindBy(xpath = "//*[@id = 'twotabsearchtextbox']")
	public WebElement SrchTB;
	
	public AmazonPage(WebDriver drv)
	{
		this.drv = drv;
		PageFactory.initElements(drv, this);
	}
	public static void ScreenShot(String ImageName, WebDriver wd) throws Exception
	{
		File source;
		File destination;
		
		source = ((TakesScreenshot)wd).getScreenshotAs(OutputType.FILE);
	     destination = new File(ImageName);
	     FileHandler.copy(source, destination);
	}
	
	public void drpdownselection(String TB) throws Exception
	{
		Select dd = new Select(drpdwn);
	    dd.selectByVisibleText("Books");
	    SrchTB.sendKeys(TB);
	  ScreenShot("C:\\Users\\dipti\\SearchScreenshot.png",drv);
	     
	}
	
	public void drpswnsearch() throws Exception
	{
		Submitbtn.click();
		JavascriptExecutor js= (JavascriptExecutor) drv;
		js.executeScript("arguments[0].scrollIntoView()",Scroll);
		ScreenShot("C:\\Users\\dipti\\ScrollScreenshot.png",drv);
		
		Scroll.click();
	}
}
