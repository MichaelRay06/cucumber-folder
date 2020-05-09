package pageObjects;

import org.openqa.selenium.support.PageFactory;

import pageLocators.LoginPageLocation;
import utils.SeleniumDriver;

public class LoginPageActions {
	
	
	LoginPageLocation loginPageLocation=null;
	
	
	public LoginPageActions() {
		this.loginPageLocation= new LoginPageLocation();
		PageFactory.initElements(SeleniumDriver.getDriver(), loginPageLocation);
		
		
		
	}
	


public void login (String emailAddress,  String passwordAddress) {
	loginPageLocation.emailBox.sendKeys(emailAddress);             
	 
	loginPageLocation.passwordBox.sendKeys(passwordAddress);
	loginPageLocation.Click_Submit.click();
	  
	  
	  }
	  
	  
	  }