package StepDefinition;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

import org.apache.commons.collections.bag.SynchronizedSortedBag;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.pages.BillingPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class $6_BillingModule {

	BillingPage bp = new BillingPage();
	@Given("^User is on Home Page by logging in by using the (.+) and (.+)$")
	public void user_is_on_home_page_by_logging_in_by_using_the_and(String email, String password) throws IOException {
        bp.user_is_on_home_page_by_logging_in_by_using_the_and( email,password);
	}

	@When("User loggedin navigate to Billing Page")
	public void user_loggedin_navigate_to_billing_page() {
		bp.user_loggedin_navigate_to_billing_page();
	}

	@And("^Now Enter respective  (.+)$")
	public void now_enter_respective(String company) {
		bp.now_enter_respective(company);
	}

	@And("^Select the (.+) and (.+)$")
	public void select_the_and(String country, String state) {
		bp.select_the_and(country,state);
	}

	@And("^Enter the (.+) name$")
	public void enter_the_name(String city) {
		bp.enter_the_name(city);
	}

	@And("^User Enter the (.+) details$")
	public void user_enter_the_details(String address) {
		bp.user_enter_the_details(address);
	}

	@And("^Now enter the (.+)$")
	public void now_enter_the(String postalcode) {
		bp.now_enter_the(postalcode);
	}

	@And("^Enter (.+) in the field$")
	public void enter_in_the_field(String phonenumber) {
		bp.enter_in_the_field(phonenumber);
	}

	@And("^At last enter the (.+)$")
	public void at_last_enter_the(String faxnumber) {
		bp.at_last_enter_the(faxnumber);
	}

	@And("User clicks-on continue button")
	public void user_clicks_on_continue_button() {
		bp.user_clicks_on_continue_button();
	}

	@And("User enters to shipping step")
	public void user_enters_to_shipping_step() throws InterruptedException {
		bp.user_enters_to_shipping_step();
	}

	@And("User Select a shipping address from your address book or enter a new address")
	public void user_select_a_shipping_address_from_your_address_book_or_enter_a_new_address() {
		bp.user_select_a_shipping_address_from_your_address_book_or_enter_a_new_address();
	}

	@And("Clickon the continue button")
	public void clickon_the_continue_button() {
		bp.clickon_the_continue_button() ;
	}

	@And("Go to shipping method")
	public void go_to_shipping_method() {
		bp.go_to_shipping_method();
	}

	@And("click on the type of shipping method and tick the continue button")
	public void click_on_the_type_of_shipping_method_and_tick_the_continue_button() {
		bp.click_on_the_type_of_shipping_method_and_tick_the_continue_button();
	}

	@And("^select the (.+) of payment method and press the continue button$")
    public void select_the_of_payment_method_and_press_the_continue_button(String typeofpayment) throws InterruptedException{
		bp.select_the_of_payment_method_and_press_the_continue_button( typeofpayment);
	}

	@And("press the  confirm order button")
	public void press_the_confirm_order_button() {
		bp.press_the_confirm_order_button();
	}

	@Then("User is able to see placed order details")
	public void user_is_able_to_see_placed_order_details() throws InterruptedException {
		bp.user_is_able_to_see_placed_order_details(); 
	}
}