package com.demoqa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AlertPage extends BasePage
{
    public AlertPage(WebDriver driver)
    {
        this.driver = driver;
    }

    @FindBy(id = "timerAlertButton")
    private WebElement secondAlert;

    public void clickOnAlert()
    {
        secondAlert.click();
    }

    public void acceptAlert()
    {
        waitForAlert();
        driver.switchTo().alert().accept();
    }
}
