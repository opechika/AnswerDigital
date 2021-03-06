package com.demoqa.stepDefinitions;

import com.demoqa.pages.BasePage;
import com.demoqa.pages.DragAndDropPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.PageFactory;

public class DraggableSteps extends BasePage
{
    DragAndDropPage dragAndDropPage = PageFactory.initElements(driver, DragAndDropPage.class);

    @Given("I am on draggable page")
    public void i_am_on_draggable_page() {
        dragAndDropPage.launchDragAndDropUrl();
    }

    @When("I dragged and dropped the element from one location to another")
    public void iDraggedAndDroppedTheElementFromOneLocationToAnother()
    {
        dragAndDropPage.dragAndDrop();
    }

    @Then("I can drag draggable element to droppable element")
    public void i_can_drag_draggable_element_to_droppable_element() {
        dragAndDropPage.isElementDropped();
    }

}
