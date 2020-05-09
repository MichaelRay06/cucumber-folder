
package stepDefination;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.LogingPage;
import pageObject.SearchProduct;
import utils.Context;

public class SearchStepDefTest {
	WebDriver driver;
	public Context contex;

	SearchProduct searchProduct;
	LogingPage logingPage;

	public SearchStepDefTest(Context contex) {

		driver = contex.startBrowser();

	}

	@Given("^I am on Carguruji site$")
	public void i_am_on_Carguruji_site() throws Throwable {

		driver.get("http://www.carguruji.com/shop/");

	}

	@Then("^I coud vrify the page tile as \"([^\"]*)\"$")
	public void i_coud_vrify_the_page_tile_as(String pageTitle) throws Throwable {

		searchProduct = new SearchProduct(driver);
		String actualPageTitl = searchProduct.getPageTitile();
		Assert.assertEquals(actualPageTitl, pageTitle, "FAIL MESSAGE: Title not matched");

	}

	@When("^I logged in the site with user name as \"([^\"]*)\" password as \"([^\"]*)\"$")
	public void i_logged_in_the_site_with_user_name_as_password_as(String emailAddress, String passwordAddress)
			throws Throwable {
		LogingPage logingPage = new LogingPage(driver);
		logingPage.login(emailAddress, passwordAddress);

	}

}
