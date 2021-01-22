package com.demoqa.stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegistrationFormSteps {

    WebDriver driver;

    @Given("I am on Practice Form page")
    public void i_am_on_practice_form_page() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.navigate().to("https://demoqa.com/automation-practice-form");

    }

    @When("I enter my {string} into  first name field")
    public void i_enter_my_into_first_name_field(String string) {

    }

    @When("I enter my {string} into  last name field")
    public void i_enter_my_into_last_name_field(String string) {

    }

    @When("I enter my {string} into email field")
    public void i_enter_my_into_email_field(String string) {

    }

    @When("I click on {string} as my gender")
    public void i_click_on_as_my_gender(String string) {

    }

    @When("I enter my {string} into Mobile Number field")
    public void i_enter_my_into_mobile_number_field(String string) {

    }

    @When("I enter my {string} into Date of Birth field")
    public void i_enter_my_into_date_of_birth_field(String string) {

    }

    @When("I enter {string} into subject field")
    public void i_enter_into_subject_field(String string) {

    }

    @When("I click on {string} as my hobbies")
    public void i_click_on_as_my_hobbies(String string) {

    }

    @When("I {string} upload picture")
    public void i_upload_picture(String string) {

    }

    @When("I enter my {string} into current address field")
    public void i_enter_my_into_current_address_field(String string) {

    }

    @When("I select {string} from select state dropdown")
    public void i_select_from_select_state_dropdown(String string) {

    }

    @When("I select {string} from select city dropdown")
    public void i_select_from_select_city_dropdown(String string) {

    }

    @When("I submit the form with the details above")
    public void i_submit_the_form_with_the_details_above() {

    }

    @Then("the details entered above are confirmed in a popup")
    public void the_details_entered_above_are_confirmed_in_a_popup() {

    }

}
