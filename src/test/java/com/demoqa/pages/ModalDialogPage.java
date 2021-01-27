package com.demoqa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ModalDialogPage extends BasePage
{
    public ModalDialogPage(WebDriver driver)
    {
        this.driver = driver;
    }

    @FindBy(id = "showSmallModal")
    private WebElement smallModal;
    @FindBy(id = "closeSmallModal")
    private WebElement closeModal;

    public void launchModalUrl()
    {
        driver.navigate().to(utils.BASE_URL+utils.MODAL_DIALOGS);
    }

    public void displaySmallModal()
    {
        smallModal.click();
    }

    public void closeSmallModal()
    {
        closeModal.click();
    }
}
