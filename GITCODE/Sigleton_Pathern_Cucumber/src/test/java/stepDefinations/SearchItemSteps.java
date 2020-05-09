package stepDefinations;

import org.testng.Assert;

import cucumber.api.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.HomePageActions;
import pageObjects.LoginPageActions;
import utils.SeleniumDriver;

public class SearchItemSteps {
	
	LoginPageActions loginPageActions=new LoginPageActions();
	HomePageActions homePageActions= new HomePageActions();
	

	@Given("I am on Carguruji site")
	public void i_am_on_Carguruji_site() {
	SeleniumDriver.openPage("http://carguruji.com/shop/");
  
}


	@When("I logged in the site with user name as {string} password as \"([^\"]*)\"$")
	public void i_logged_in_the_site_with_user_name_as_password_as(String emailAddress, String passwordAddress) {

	loginPageActions.login(emailAddress, passwordAddress);
   
}


	@Then("I verify my  account title text as \"([^\"]*)\"$")
	public void i_verify_my_account_title_text_as(String myAccountTitleText) {

	String vrifyAcoountText =homePageActions.getMyAccountTitle_Text();
	Assert.assertEquals(vrifyAcoountText, myAccountTitleText, null);
   
}

	

@And("I search for desired product as  \"([^\"]*)\"$")
public void i_search_for_desired_product_as(String searchProduct) {
	
	homePageActions.product_search(searchProduct);
    
}

@Then("I click to make product search")
public void i_click_to_make_product_search() {
	homePageActions.clickToSearch();
   
}


@And("I clicked on the selected product of the searched result")
public void i_clicked_on_the_selected_product_of_the_searched_result() {
   
}
@Then("I verifyed the serched product as \"([^\"]*)\"$")
public void i_verifyed_the_serched_product_as(String vrifyProduct) {}

	
}
