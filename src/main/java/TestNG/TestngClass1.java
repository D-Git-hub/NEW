package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import NewPages.AmazonPage;



public class TestngClass1 
{
WebDriver drv;
NewPages.AmazonPage Ap ;


@BeforeClass
public void openbwsr()
{
	drv = new ChromeDriver();
	//drv.get("https://www.google.com");
	drv.get("https://www.amazon.in//");
	drv.manage().window().maximize();
	drv.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
}

@AfterClass
public void Closebwsr()
{
 drv.close();
}

@Test
public void TestCase1() throws Exception
{	
	Ap = new AmazonPage(drv);	
	Ap.drpdownselection("activity books for kids");
	Ap.drpswnsearch();
}
}
