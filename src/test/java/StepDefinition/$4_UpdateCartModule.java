package StepDefinition;

import java.io.IOException;

import com.pages.UpdateCartPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class $4_UpdateCartModule {

	UpdateCartPage up = new UpdateCartPage();
    //Scenario - 1
    @Given("^User on Demo Web Shop Home Page with login (.+) and (.+)$")
    public void user_is_on_demo_web_shop_home_page_with_login_and(String email, String password) throws IOException {
		up.IntializeBrowser();
		up.Login(email, password);
	}

	@When("User clicks on shopping cart")
	public void user_clicks_on_shopping_cart() {
		up.user_clicks_on_shopping_cart();
	}

	@And("^User selects (.+) in Cart$")
	public void user_selects_in_cart(String productname) {
		up.user_selects_in_cart(productname);
	}

	@And("^User checks the respective checkbox of that (.+)$")
	public void user_checks_the_respective_checkbox_of_that(String productname) {
		up.user_checks_the_respective_checkbox_of_that(productname);
	}

	@And("User clicks on Update shopping cart for removing Product")
	public void user_clicks_on_update_shopping_cart_for_removing_product() {
		up.user_clicks_on_update_shopping_cart_for_removing_product();
	}
	
	@Then("Checked item should be removed from Cart")
	public void checked_item_should_be_removed_from_cart() throws InterruptedException {
		up.checked_item_should_be_removed_from_cart() ;

	}
	
	//Scenario - 2
	@And("^User enters (.+) value of (.+) in itemquantity box$")
	public void user_enters_value_of_itemquantity_box(String quantity, String productname) {
		up.user_enters_value_of_itemquantity_box(quantity, productname);
	}

	@And("^User clicks on Update shopping cart button for AddQuantity update$")
	public void user_clicks_on_update_shopping_cart_button_for_adding_update() throws Throwable {
		up.user_clicks_on_update_shopping_cart_button_for_adding_update();
	}

	@Then("^User entered (.+) item quantity (.+) is updated$")
    public void user_entered_item_quantity_is_updated(String productname, String quantity) throws InterruptedException{
		up.user_entered_item_quantity_is_updated(productname ,quantity);
	}
	

}