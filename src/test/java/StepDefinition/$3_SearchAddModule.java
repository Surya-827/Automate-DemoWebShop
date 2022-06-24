package StepDefinition;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.pages.SearchAddPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class $3_SearchAddModule {

	SearchAddPage sp = new SearchAddPage();
	// Scenario - 1
	@Given("^User should be on Home Page by logging-in using (.+) and (.+)$")
	public void user_should_be_on_home_page_by_loggingin_using_and(String email, String password) throws IOException {
		sp. user_should_be_on_home_page_by_loggingin_using_and(email,password);
	}

	@When("^User enters (.+) in search bar$")
	public void user_enters_in_search_bar(String productname) {
		sp.user_enters_in_search_bar(productname);
	}

	@And("User clicks on search button")
	public void user_clicks_on_search_button() {
		sp.user_clicks_on_search_button();
	}

	@And("User clicks on Add to Cart button")
	public void user_clicks_on_add_to_cart_button() {
		sp.user_clicks_on_add_to_cart_button();
	}

	// table//td[@class='product']
	@Then("^User added (.+) should be added to shoppingCart$")
	public void user_added_should_be_added_to_shoppingcart(String productname) throws InterruptedException {
		sp.user_added_should_be_added_to_shoppingcart(productname);
		sp.QuitBrowser();

	}

	// Scenario - 2
	@Then("^User gets search results$")
	public void user_gets_search_results() throws InterruptedException {
		sp.user_gets_search_results();
		sp.QuitBrowser();
	}

}