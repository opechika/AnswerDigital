package com.demoqa.stepDefinitions;

import com.demoqa.pages.AlertPage;
import com.demoqa.pages.BasePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.PageFactory;

public class AlertSteps extends BasePage
{
    AlertPage alertPage = PageFactory.initElements(driver, AlertPage.class);


    @Given("I am on Alert page")
    public void i_am_on_alert_page() {
        alertPage.launchAlertUrl();
    }

    @When("I click on the second alert button")
    public void i_click_on_the_second_alert_button() {
        alertPage.clickOnAlert();
    }

    @Then("I can accept the alert")
    public void i_can_accept_the_alert() {
        alertPage.acceptAlert();
    }

}
