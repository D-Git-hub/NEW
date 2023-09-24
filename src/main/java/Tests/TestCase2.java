package Tests;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import NewPages.AirSearch;
import NewPages.DateSelection;
import NewPages.Google_Search;
import io.github.bonigarcia.wdm.WebDriverManager;


public class TestCase2
{

	public static void main(String[] args) throws Exception
	{
//		System.setProperty("webdriver.chrome.drive", "C:\\Users\\dipti\\Downloads\\chromedriver_win32\\chromedriver.exe");
//		ChromeOptions co = new ChromeOptions();
//		co.setBinary("C:\\Users\\dipti\\Downloads\\chrome-win64\\chrome-win64\\chrome.exe");
		
		
		WebDriverManager.chromiumdriver().setup();

		WebDriver drv = new ChromeDriver();
		drv.manage().window().maximize();
		//drv.get("https://www.google.com/search?q=cheapest+flights+from+melbourne+to+queensland+new+zealand&source=hp&ei=qMzQZLm9A8uo2roP3IaV8AY&iflsig=AD69kcEAAAAAZNDauIBcs94xShROH6iVHrY1khE4IpT9&oq=cheapest+flights+from+melbourne+to+queensland+new&gs_lp=Egdnd3Mtd2l6IjFjaGVhcGVzdCBmbGlnaHRzIGZyb20gbWVsYm91cm5lIHRvIHF1ZWVuc2xhbmQgbmV3KgIIADIFECEYoAEyBRAhGKABMgUQIRigATIFECEYoAEyCBAhGBYYHhgdSPS-BVCKlwJYmqYFcAZ4AJABAZgB7gOgAZ5wqgEKMC40LjM3LjkuM7gBAcgBAPgBAagCCsICEBAAGAMYjwEY6gIYjAMY5QLCAhAQLhgDGI8BGOoCGIwDGOUCwgISEAAYAxiPARjqAhgKGIwDGOUCwgILEAAYgAQYsQMYgwHCAhEQLhiABBixAxiDARjHARjRA8ICERAuGIMBGMcBGLEDGNEDGIAEwgILEC4YigUYsQMYgwHCAg4QLhiABBixAxjHARjRA8ICBRAAGIAEwgILEC4YgAQYsQMYgwHCAgUQLhiABMICDhAuGIAEGLEDGMcBGK8BwgIIEAAYgAQYsQPCAggQABiABBjJA8ICCBAAGIoFGJIDwgILEC4YgwEYsQMYgATCAg4QABiABBixAxiDARjJA8ICDhAAGIAEGLEDGIMBGJIDwgIIEC4YgAQY1ALCAgsQLhiABBjHARjRA8ICCxAAGIoFGLEDGIMBwgIGEAAYFhgewgIIEAAYFhgeGA_CAg0QABgWGB4YDxjxBBgKwgIIEAAYFhgeGArCAggQABiKBRiGAw&sclient=gws-wiz");
		drv.get("https://www.google.com");
		
		Google_Search gpage = new Google_Search(drv);	
		gpage.Gsearchdata("cheapest flights from melbourne to queensland new zealand");
		gpage.Gsearch.sendKeys(Keys.ENTER);
		
		AirSearch apage = new AirSearch(drv);
		apage.Asearchdata();
		
		DateSelection datepage = new DateSelection(drv);
		Thread.sleep(3000);
		datepage.Fromdata();
//		Thread.sleep(3000);
		//datepage.Todata("Queenstown");
		datepage.Todata();
		Thread.sleep(3000);
		//datepage.Switchdata();
		datepage.FromToDateSelection();
		datepage.SearchClick();
//		datepage.FromDateSelection();
//		Thread.sleep(3000);
//		datepage.ToDateSelection();
//		Thread.sleep(3000);
	}

}
