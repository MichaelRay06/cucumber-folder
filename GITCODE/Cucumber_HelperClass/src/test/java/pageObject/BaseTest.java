package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseTest {
	WebDriver driver;
	WebDriverWait wait;
	
	public BaseTest(WebDriver driver) {
		this.driver=driver;
	this.wait= new WebDriverWait(driver, 15);
		
		
	}
	


public void waitForVisibilityOfElement2(WebElement element) {
	wait.until(ExpectedConditions.visibilityOf(element));
}


public void waitForClickabilityOfElement2(WebElement element) {
	wait.until(ExpectedConditions.elementToBeClickable(element));
}

public boolean isElementPresent2(WebElement element) {
	waitForVisibilityOfElement2(element);
	return element.isDisplayed();
	
}
public boolean isElementSelectable2(WebElement element) {
	waitForVisibilityOfElement2(element);
	return element.isSelected();
}
public boolean isElementEnable(WebElement element) {
	waitForVisibilityOfElement2(element);
	return element.isEnabled();
}
public void click(WebElement element) {
	waitForClickabilityOfElement2(element);
	element.click();
	
}
public void sendKeys(WebElement element, String value) {
	waitForVisibilityOfElement2(element);
	element.clear();
	element.sendKeys(value);
	
}



public String getAttribute(WebElement element, String attribute) {
	waitForVisibilityOfElement2(element);
	return element.getAttribute(attribute);
	
}


public String getText(WebElement element) {
	waitForVisibilityOfElement2(element);
	return element.getText();
}
public String getCurrentUrl() {
	return driver.getCurrentUrl();
}

public String getPageTitile() {
	return driver.getTitle();
}
	

}
