package com.demoqa.stepDefinitions;

import com.demoqa.pages.BasePage;
import com.demoqa.pages.ModalDialogPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.PageFactory;

public class ModalDialogSteps extends BasePage
{
    ModalDialogPage modalDialogPage = PageFactory.initElements(driver, ModalDialogPage.class);


    @Given("I am on modal dialog page")
    public void i_am_on_modal_dialog_page() {
        modalDialogPage.launchModalStartPage();
    }

    @When("I click on small modal page")
    public void i_click_on_small_modal_page() {
        modalDialogPage.displaySmallModal();
    }

    @Then("I can close the modal page")
    public void i_can_close_the_modal_page() {
        modalDialogPage.closeSmallModal();
    }
}
