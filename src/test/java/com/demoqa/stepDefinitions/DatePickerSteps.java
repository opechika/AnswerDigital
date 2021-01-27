package com.demoqa.stepDefinitions;

import com.demoqa.pages.BasePage;
import com.demoqa.pages.DatePickerPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.PageFactory;

public class DatePickerSteps extends BasePage
{
    DatePickerPage datePickerPage = PageFactory.initElements(driver, DatePickerPage.class);

    @Given("I am on date picker page")
    public void i_am_on_date_picker_page() {
        datePickerPage.launchDatePickerUrl();
    }

    @When("I click on date field")
    public void i_click_on_date_field() {
        datePickerPage.clickOnDatePicker();
    }

    @When("I select a date that is a month away from today")
    public void i_select_a_date_that_is_a_month_away_from_today() {
        datePickerPage.selectMonthFromDatePicker();
        datePickerPage.selectDayFromDatePicker();
    }

    @Then("the correct date selected above is displayed")
    public void the_correct_date_selected_above_is_displayed() {
        datePickerPage.isRightDateDisplayed();
    }
}
