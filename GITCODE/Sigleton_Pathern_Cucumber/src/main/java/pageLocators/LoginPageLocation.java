package pageLocators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPageLocation {
	
	  @FindBy(how=How.CSS, using="div.breadcrumb.clearfix")
	  public  WebElement VrifyHomePageImage;
	  
	  @FindBy(how=How.ID, using="email")  
	  public WebElement emailBox;
	  
	  @FindBy(how=How.ID, using="email") 
	  public WebElement passwordBox;
	  
	  @FindBy(how=How.ID, using="SubmitLogin") 
	  public WebElement Click_Submit;
	  
	  @FindBy(how=How.CSS, using="div>a.account") 
	  public WebElement user_ID;
	  
	 
}
