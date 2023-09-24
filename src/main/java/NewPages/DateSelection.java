package NewPages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DateSelection
{
	WebDriver drv;

	@FindBy(xpath = "(//*[@aria-label = 'Flight origin input'])/div[2]")
	public WebElement From;
	
	@FindBy(xpath = "(//*[@aria-label = 'Flight destination input'])/div[2]")
	public WebElement To;
	
	@FindBy(xpath = "(//*[@role = 'button'])[4]")
	public WebElement Switch;
	
	@FindBy(xpath = "(//*[@class = 'cQtq-value'])[1]")
	public WebElement FromDate;
	
	@FindBy(xpath = "(//*[@class = 'cQtq-value'])[2]")
	public WebElement ToDate;
	
	@FindBy(xpath = "(//*[@class = 'Iqt3-button-content'])[2]")
	public WebElement Searchbtn;
	
	public DateSelection(WebDriver drv)
	{
		this.drv = drv;
		PageFactory.initElements(drv, this);
	}

	public void Fromdata() throws Exception
	{
		From.click();
		drv.findElement(By.xpath("//*[@class='k_my-input']")).clear();
		Thread.sleep(1000);
		drv.findElement(By.xpath("//*[@class='k_my-input']")).sendKeys("MEL");
		Thread.sleep(1000);
		drv.findElement(By.xpath("//*[text()='Melbourne, Victoria, Australia']")).click();
		
	}
	
	
	public void Todata() throws Exception
	{	
		To.click();
		//Actions a = new Actions(drv);
		//a.keyDown(Keys.BACK_SPACE).keyUp(Keys.BACK_SPACE).build().perform();
		drv.findElement(By.xpath("//*[@placeholder= 'To?']")).clear();
		Thread.sleep(1000);
		drv.findElement(By.xpath("//*[@placeholder= 'To?']")).sendKeys("ZQN");
		Thread.sleep(1000);
		drv.findElement(By.xpath("//*[text()='Queenstown, New Zealand']")).click();
//	JavascriptExecutor js = (JavascriptExecutor)drv;
//	js.executeAsyncScript("arguments[0].value = 'Test'", To);
//		To.clear();
//		To.sendKeys(Tdata);
	}
	
	public void Switchdata()
	{
		Switch.click();
	}
	
	public void FromToDateSelection()
	{
		FromDate.click();
		drv.findElement(By.xpath("//*[@aria-label = 'Sunday 27 August, 2023']")).click();
		drv.findElement(By.xpath("(//*[@aria-label = 'Thursday 31 August, 2023'])[1]")).click();
	}
	
	public void SearchClick()
	{
		Searchbtn.click();
	}
	
	
}
