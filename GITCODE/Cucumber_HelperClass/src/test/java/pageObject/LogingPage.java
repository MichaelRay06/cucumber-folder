package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogingPage  extends BaseTest {
	
	 @FindBy(css="div.breadcrumb.clearfix") WebElement VrifyHomePageImage;
	  
	  @FindBy(id="email") WebElement emailBox;
	  
	  @FindBy(id="email") WebElement passwordBox;
	  
	  @FindBy(id="SubmitLogin") WebElement Click_Submit;
	  
	  @FindBy(css="div>a.account") WebElement user_ID;
	  

	public LogingPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
		
	}
	
	 public void login (String emailAddress,  String passwordAddress) {
		  emailBox.sendKeys(emailAddress);
		  sendKeys(passwordBox, passwordAddress);
		  click(Click_Submit);
}
}