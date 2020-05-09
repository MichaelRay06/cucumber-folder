package pageObjects;

import org.openqa.selenium.support.PageFactory;

import pageLocators.HomePageLocator;
import utils.SeleniumDriver;

public class HomePageActions {
	
	
	HomePageLocator homePageLocator=null;
	
	public HomePageActions() {
		this.homePageLocator= new HomePageLocator();
		PageFactory.initElements(SeleniumDriver.getDriver(), homePageLocator);
		
	}
	
	 public String getMyAccountTitle_Text() { 
		return  homePageLocator.getAccountText.getText();
	  
	  }
	  
	  public void product_search(String searchProduct) {
		  homePageLocator.productSearchBox.sendKeys(searchProduct);
	 
	  }
	  
	  public void  clickToSearch()  {
		  homePageLocator.clickSearch.click();
	 
	  
	  } 
	 

}
