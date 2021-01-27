package com.demoqa.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DragAndDropPage extends BasePage
{
    public DragAndDropPage(WebDriver driver)
    {
        this.driver = driver;
    }

    @FindBy(id = "draggable")
    private WebElement dragElement;
    @FindBy(id = "droppable")
    private WebElement dropElement;
    @FindBy(css = "#droppable p")
    private WebElement dropped;

    public void launchDragAndDropUrl()
    {
        driver.navigate().to(utils.BASE_URL+utils.DROPPABLE);
    }

    public void dragAndDrop()
    {
        dragAndDropAnElement(dragElement, dropElement);
    }

    public void isElementDropped()
    {
        Assert.assertTrue("Dropped is " + dropped.getText(),
                dropped.getText().equalsIgnoreCase("Dropped!"));

    }
}
