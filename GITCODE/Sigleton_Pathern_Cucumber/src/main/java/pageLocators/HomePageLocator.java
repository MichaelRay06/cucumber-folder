package pageLocators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePageLocator {
	
	  @FindBy(how=How.CSS, using="div.breadcrumb.clearfix") 
	  public WebElement myAccountImage;
	  
	  @FindBy(how=How.CSS, using="h1.page-heading") 
	  public WebElement getAccountText;
	  
	  @FindBy(how=How.ID, using="search_query_top")
	  public  WebElement productSearchBox;
	  
	  @FindBy(how=How.NAME, using="submit_search") 
	  public WebElement clickSearch;
	

}
