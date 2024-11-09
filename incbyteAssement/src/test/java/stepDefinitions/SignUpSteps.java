package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class SignUpSteps {

    @Given("I am on the Magento signup page")
    public void i_am_on_the_magento_signup_page() {
        // Implement the steps to navigate to the Magento signup page
    }

    @When("I enter the first name {string}, last name {string}, email {string}, password {string}, and confirm password {string}")
    public void i_enter_the_first_name_last_name_email_password_and_confirm_password(String firstName, String lastName, String email, String password, String confirmPassword) {
        // Implement the actions to fill in the signup form with the provided data
    }

    @When("I click the Create an Account button")
    public void i_click_the_create_an_account_button() {
        // Implement the action to click the "Create an Account" button
    }

    @Then("I should be redirected to the account dashboard")
    public void i_should_be_redirected_to_the_account_dashboard() {
        // Implement the verification that the user is redirected to the account dashboard
    }

    @Then("I should see an error message {string}")
    public void i_should_see_an_error_message(String errorMessage) {
        // Implement the verification for the error message
    }
}
