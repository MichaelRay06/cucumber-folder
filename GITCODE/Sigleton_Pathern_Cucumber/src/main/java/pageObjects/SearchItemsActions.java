package pageObjects;

import org.openqa.selenium.support.PageFactory;

import pageLocators.SearchItemsLocator;
import utils.SeleniumDriver;

public class SearchItemsActions {
	SearchItemsLocator searchItemsLocator=null;
	
	public SearchItemsActions() {
		this.searchItemsLocator = new SearchItemsLocator();
		PageFactory.initElements(SeleniumDriver.getDriver(), searchItemsLocator);
		
		
	}

	
}