package com.demoqa.stepDefinitions;

import com.demoqa.pages.BasePage;
import com.demoqa.pages.PracticeFormPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.PageFactory;

public class RegistrationFormSteps extends BasePage {

    PracticeFormPage practiceFormPage = PageFactory.initElements(driver, PracticeFormPage.class);

    @Given("I am on Practice Form page")
    public void i_am_on_practice_form_page() {
        practiceFormPage.launchPracticeUrl();
    }

    @When("I enter my {string} into  first name field")
    public void i_enter_my_into_first_name_field(String firstName) {
        practiceFormPage.enterFirstName(firstName);
    }

    @When("I enter my {string} into  last name field")
    public void i_enter_my_into_last_name_field(String lastName) {
        practiceFormPage.enterSurName(lastName);
    }

    @When("I enter my {string} into email field")
    public void i_enter_my_into_email_field(String email) {
        practiceFormPage.enterEmailAddress(email);
    }

    @When("I click on {string} as my gender")
    public void i_click_on_as_my_gender(String gender) {
        practiceFormPage.clickOnGender(gender);
    }

    @When("I enter my {string} into Mobile Number field")
    public void i_enter_my_into_mobile_number_field(String mobileNumber) {
        practiceFormPage.enterMobileEnter(mobileNumber);
    }

    @When("I enter my {string} into Date of Birth field")
    public void i_enter_my_into_date_of_birth_field(String dateOfBirth) {
        practiceFormPage.enterDateOfBirth(dateOfBirth);
    }

    @When("I enter {string} into subject field")
    public void i_enter_into_subject_field(String subject) {
        practiceFormPage.enterSubject(subject);
    }

    @When("I click on {string} as my hobbies")
    public void i_click_on_as_my_hobbies(String hobbies) {
        practiceFormPage.clickOnHobbiesRadioButton(hobbies);
    }

    @When("I {string} upload picture")
    public void i_upload_picture(String uploadPicture) {
        practiceFormPage.uploadPictureToTheServer(uploadPicture);
    }

    @When("I enter my {string} into current address field")
    public void i_enter_my_into_current_address_field(String currentAddress) {
        practiceFormPage.enterCurrentAddress(currentAddress);
    }

    @When("I select {string} from select state dropdown")
    public void i_select_from_select_state_dropdown(String state) {
        practiceFormPage.selectStateFromList(state);
    }

    @When("I select {string} from select city dropdown")
    public void i_select_from_select_city_dropdown(String city) {

    }

    @When("I submit the form with the details above")
    public void i_submit_the_form_with_the_details_above() {
        practiceFormPage.submitForm();
    }

    @Then("the details entered above are confirmed in a popup")
    public void the_details_entered_above_are_confirmed_in_a_popup() {
        practiceFormPage.CloseModalPopUp();
    }

}
