package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Context {
public	WebDriver driver=null;
	
	
	@Before()
	public WebDriver startBrowser() {
		WebDriverManager.chromedriver().setup();
		if(driver==null)
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		return driver;
		

	}

}