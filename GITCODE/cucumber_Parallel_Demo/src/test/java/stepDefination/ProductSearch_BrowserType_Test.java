
package stepDefination;

import org.openqa.selenium.By;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utilities.BaseTest;

public class ProductSearch_BrowserType_Test extends BaseTest {
	
	
	
	  @Before public void runtest() {
	  
	  }
	  
	  @After public void closeBrowser() { 
		  closeDriver();
	  }
	 
	 
		
		
	  @Given("^I navigate to Carguruji site on \"([^\"]*)\"$")
	  public void i_navigate_to_Carguruji_site_on(String browserName) {
		startWebDriver(browserName);
		getUrl();
	   
	}
	  
	  @Then("^I verified the page tile as  \"([^\"]*)\"$")
	  public void i_verified_the_page_tile_as(String pageTitle) {
		  
		driver.getTitle().equals(pageTitle);
		driver.findElement(By.cssSelector("a.login")).click();

	    
	}
	  
	  @When("^I logged in the site {string} password as  \"([^\"]*)\"$")
	  public void i_logged_in_the_site_password_as(String email, String password) {
	  
		driver.findElement(By.id("email")).sendKeys(email);
		driver.findElement(By.id("passwd")).sendKeys(password);
		driver.findElement(By.id("SubmitLogin")).click();

	   
	}
	  
	  @Then("^I verify my  account text title  \"([^\"]*)\"$")
	  public void i_verify_my_account_text_title(String myAccount) {
		driver.findElement(By.cssSelector("h1.page-heading")).getText().contentEquals(myAccount);
	   
	}
	  
	  @Then("^I search for the wanted product   \"([^\"]*)\"$")
	  public void i_search_for_the_wanted_product(String productName) {

	
		driver.findElement(By.id("search_query_top")).clear();
		driver.findElement(By.id("search_query_top")).sendKeys(productName);
		driver.findElement(By.name("submit_search")).click();
	   
	}
	  

@Then("^I could verifyed the serched product  \"([^\"]*)\"$")
public void i_could_verifyed_the_serched_product(String vrifyProduct) {

		driver.findElement(By.cssSelector("span.lighter")).getText().contains(vrifyProduct);
		}
	
}
