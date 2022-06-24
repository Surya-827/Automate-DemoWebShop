package StepDefinition;

import java.io.IOException;

import com.pages.CheckOutPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class $5_CheckOutModule {

	CheckOutPage cp = new CheckOutPage();
	// Scenario - 1
	@Given("^User is on Home page by logging with (.+) and (.+)$")
    public void user_is_on_home_page_by_logging_with_and(String email, String password) throws IOException {
		cp.user_is_on_home_page_by_logging_with_and(email,password);
	}

	@When("user clicks on shoppingCart button")
	public void user_clicks_on_shopping_cart_button() {
		cp.user_clicks_on_shopping_cart_button();
	}

	@And("^Select and enter (.+) and (.+) and (.+)$")
	public void select_and_enter_and_and(String country, String state, String code){
		cp.select_and_enter_and_and(country,state,code);
	}

	@When("Click Estimate Shipping Button")
	public void click_estimate_shipping_button() {
		cp.click_estimate_shipping_button();
	}

	@When("Click on Checkout button")
	public void click_on_checkout_button() {
		cp.click_on_checkout_button();
	}

	@Then("User should see Billing Page")
	public void user_should_see_billing_page() {
		cp.user_should_see_billing_page();
	}

}