package StepDefinition;

import java.io.IOException;

import com.pages.LoginPage;

import io.cucumber.java.en.*;


public class $2_LoginModule {

	LoginPage lp = new LoginPage();
	
	@Given("User should be on Home page")
	public void user_should_be_on_home_page() throws IOException {
        lp.user_should_be_on_home_page();
	}

	@When("User clicks on Login button")
	public void user_clicks_on_login_button() {
		lp.user_clicks_on_login_button();
	}

    @And("^User should enter Registered (.+) and (.+)$")
    public void user_should_enter_registered_and(String email, String password)  {
    	lp.user_should_enter_registered_and(email,password);
    }

	@And("User should click on Log in button")
	public void user_should_click_on_log_in_button() {
		lp.user_should_click_on_log_in_button();
		
	}

	@Then("User should be able to logged in successfully")
	public void user_should_be_able_to_logged_in_successfully()  {
		lp.user_should_be_able_to_logged_in_successfully();
	}

	@And("User should enter Unregistered (.+) and (.+)$")
	public void user_should_enter_unregistered_and(String email, String password) {
		lp.user_should_enter_unregistered_and(email,password);
	}

	@Then("User should not be able to logged in")
	public void user_should_not_be_able_to_logged_in(){
		lp.user_should_not_be_able_to_logged_in();
	}

}