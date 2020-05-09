package pageLocators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchItemsLocator {

	
	  @FindBy(css="div.breadcrumb.clearfix") 
	  public WebElement myAccountImage;
	  
	  @FindBy(css="h1.page-heading") 
	  public WebElement    getAccountText;
	  
	  @FindBy(id="search_query_top") 
	  public WebElement productSearchBox;
	  
	  @FindBy(name="submit_search") 
	  public WebElement clickSearch;
}
