package NewPages;

import org.openqa.selenium.WebDriver;import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class ChromeBrowser_New {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ChromeOptions op = new ChromeOptions();
		op.setBinary("C:\\Users\\dipti\\Downloads\\chrome-win64 (1)\\chrome-win64\\chrome.exe");
		WebDriver driver = new ChromeDriver(op);
		driver.get("https://trip.com/");
		
		
		
		
	}

}
