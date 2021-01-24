package com.demoqa.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ToolTipPage extends BasePage
{
    public ToolTipPage(WebDriver driver)
    {
        this.driver = driver;
    }

    @FindBy(id = "toolTipButton")
    private WebElement tooltipButton;
    @FindBy(css = "[aria-describedby = 'buttonToolTip']")
    private WebElement butTooltip;
    @FindBy(id = "toolTipTextField")
    private  WebElement fieldTooltip;
    @FindBy(css = "[aria-describedby = 'textFieldToolTip']")
    private WebElement fieTooltip;

    public void hooverOverTooltipButton()
    {
        scrollToElement(tooltipButton);
    }

    public void isTooltipDisplayed()
    {
        Assert.assertTrue(butTooltip.isDisplayed());
    }

    public void hooverOverTooltipField()
    {
        scrollToElement(fieldTooltip);
    }

    public void isTooltipForFieldDisplayed()
    {
        Assert.assertTrue(fieTooltip.isDisplayed());
    }
}
