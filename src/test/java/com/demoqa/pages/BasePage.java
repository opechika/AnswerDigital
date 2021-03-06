package com.demoqa.pages;

import com.demoqa.common.DriverManager;
import com.demoqa.libs.Utils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage extends DriverManager
{

    public Select select;
    public Utils utils = new Utils();
    public Actions actions;
    public JavascriptExecutor js;

    public void selectElementByVisibleText(WebElement element, String text)
    {
        select = new Select(element);
        select.selectByVisibleText(text);
    }

    public void waitForElementToBeClickable(WebElement element)
    {
        waitFor();
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public void waitForAlert()
    {
        waitFor();
        wait.until(ExpectedConditions.alertIsPresent());
    }

    private void waitFor() {
        wait = new WebDriverWait(driver, 30);
    }

    public void scrollToElement(WebElement element)
    {
        actionsInit();
        actions.moveToElement(element).build().perform();
    }

    private void actionsInit() {
        actions = new Actions(driver);
    }

    public void dragAndDropAnElement(WebElement dragElement, WebElement dropElement)
    {
        actionsInit();
        actions.dragAndDrop(dragElement, dropElement).build().perform();
    }

    public void scrollDown()
    {
        js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1000)");
    }

}
