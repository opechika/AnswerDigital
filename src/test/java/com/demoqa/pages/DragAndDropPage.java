package com.demoqa.pages;

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

    public void dragAndDrop()
    {
        dragAndDropAnElement(dragElement, dropElement);
    }
}
