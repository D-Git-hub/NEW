package a;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class A {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		File f = new File("C:\\Users\\dipti\\eclipse-workspace\\Sample_Maven\\src\\test\\resources\\data.properties");
		FileReader fr = new FileReader(f);
		
		Properties p = new Properties();
		p.load(fr);
		
		System.out.println(p.getProperty("url"));
		System.out.println(p.getProperty("user"));
		System.out.println(p.getProperty("password"));
		
		
	}

}
