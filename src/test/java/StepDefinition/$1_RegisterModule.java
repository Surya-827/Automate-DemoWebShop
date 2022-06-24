package StepDefinition;



import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

import com.pages.RegistrationPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class $1_RegisterModule {
	public static WebDriver driver;
	public static Properties prop;

	RegistrationPage reg = new RegistrationPage();
	// Scenario1
	@Given("User is on DemoWebShop page")
	public void user_is_on_demo_web_shop_page() throws IOException {
		reg.IntializeBrowser();
	}

	@When("User click on Register button")
	public void user_click_on_register_button() {
		reg.user_click_on_register_button();
	}

	@Then("User is on Registration Page")
	public void user_is_on_registration_page() {
		reg.user_is_on_registration_page();
	}

	// Scenario 2 and 3
	@And("^User clicks on the (.+)$")
	public void user_clicks_on_the(String gender) {
		reg.user_clicks_on_the(gender);
	}

	@And("^User enters (.+) and (.+)$")
	public void user_enters_and(String firstname, String lastname) {
		reg.user_enters_and(firstname,lastname);
	}

	@And("^User types (.+)$")
	public void user_types(String email) {
		reg.user_types(email);

	}

	@And("^User Types (.+) , (.+)$")
	public void user_Types_(String password, String confirmpass) {
		reg.user_Types_(password,confirmpass);

	}

	@And("User Clicks on Register button")
	public void user_Clicks_on_register_button() {
		reg.user_Clicks_on_register_button();

	}

	@Then("User is succesfully registered")
	public void user_is_succesfully_registered() {
		reg.user_is_succesfully_registered();
	}

	@Then("User should not able to registered")
	public void user_should_not_able_to_registered() {
        reg.user_should_not_able_to_registered();
	}

}