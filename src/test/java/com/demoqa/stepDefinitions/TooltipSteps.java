package com.demoqa.stepDefinitions;

import com.demoqa.pages.BasePage;
import com.demoqa.pages.ToolTipPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.PageFactory;

public class TooltipSteps extends BasePage
{
    ToolTipPage toolTipPage = PageFactory.initElements(driver, ToolTipPage.class);

    @Given("I am on tool tip page")
    public void i_am_on_tool_tip_page() {
        toolTipPage.launchToolTipUrl();
    }

    @When("I hoover over tooltip button")
    public void i_hoover_over_tooltip_button() {
        toolTipPage.hooverOverTooltipButton();
    }

    @Then("the button tooltip is displayed")
    public void the_button_tooltip_is_displayed() {
        toolTipPage.isTooltipDisplayed();
    }

    @When("I hoover over tooltip field")
    public void i_hoover_over_tooltip_field() {
        toolTipPage.hooverOverTooltipField();
    }

    @Then("the field tooltip is displayed")
    public void the_field_tooltip_is_displayed() {
        toolTipPage.isTooltipForFieldDisplayed();
    }
}
