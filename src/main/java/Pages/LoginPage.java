package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage
{
WebDriver drv;

@FindBy(xpath = "//*[@id = 'user-name']")
public WebElement uname;	

@FindBy(xpath = "//*[@id = 'password']")
public WebElement pwd;		

@FindBy(xpath = "//*[@id = 'login-button']")
public WebElement loginbtn;	

public LoginPage(WebDriver drv)
{
	this.drv = drv;
	PageFactory.initElements(drv, this);
}

public void usernamedata(String username)
{
	uname.sendKeys(username);
}
public void passworddata(String password)
{
	pwd.sendKeys(password);
}
public void loginclick()
{
	loginbtn.click();
}
}
