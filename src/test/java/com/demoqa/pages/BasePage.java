package com.demoqa.pages;

import com.demoqa.common.DriverManager;
import com.demoqa.libs.Utils;
import com.github.javafaker.Faker;
import io.cucumber.java.bs.A;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
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


    public void launchAutomationPracticeFormPage()
    {
        driver.navigate().to(utils.BASE_URL + utils.AUTOMATION_PRACTICE_FORM);
    }

    public void launchAlertPage()
    {
        driver.navigate().to(utils.BASE_URL + utils.ALERTS);
    }

    public void launchToolTipsPage()
    {
        driver.navigate().to(utils.BASE_URL + utils.TOOLTIPS);
    }

    public void launchDroppablePage()
    {
        driver.navigate().to(utils.BASE_URL + utils.DROPPABLE);
    }

    public void launchModalStartPage()
    {
        driver.navigate().to(utils.BASE_URL + utils.MODAL_DIALOGS);
    }

    public void launchDatePickerPage()
    {
        driver.navigate().to(utils.BASE_URL + utils.DATE_PICKERS);
    }


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
        actions = new Actions(driver);
        actions.moveToElement(element).build().perform();
    }

    public void scrollDown()
    {
        js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1000)");
    }

}
