package com.demoqa.pages;

import com.demoqa.libs.Utils;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class PracticeFormPage extends BasePage{

    public PracticeFormPage(WebDriver driver)
    {
        this.driver = driver;
    }

    @FindBy(id = "firstName")
    private WebElement firstName;
    @FindBy(id = "lastName")
    private WebElement surName;
    @FindBy(id = "userEmail")
    private WebElement emailAddress;
    @FindBy(css = "[for=\"gender-radio-1\"]")
    private WebElement maleRadioButton;
    @FindBy(css = "[for=\"gender-radio-2\"]")
    private WebElement femaleRadioButton;
    @FindBy(css = "[for=\"gender-radio-3\"]")
    private WebElement otherRadioButton;
    @FindBy(id = "userNumber")
    private WebElement mobile;
    @FindBy(id = "dateOfBirthInput")
    private WebElement dob;
    @FindBy(css = ".subjects-auto-complete__control--is-focused")
    private WebElement subject;
    @FindBy(id = "subjectsContainer")
    private WebElement subjectContainer;
    @FindBy(id = "uploadPicture")
    private WebElement pictureUpload;
    @FindBy(css = "[for=\"hobbies-checkbox-1\"]")
    private WebElement sports;
    @FindBy(css = "[for=\"hobbies-checkbox-2\"]")
    private WebElement reading;
    @FindBy(css = "[for=\"hobbies-checkbox-3\"]")
    private WebElement music;
    @FindBy(id = "currentAddress")
    private WebElement curAddress;
    @FindBy(className = "css-1hwfws3")
    private WebElement stateDrpDwn;
    @FindBy(className = "css-1uccc91-singleValue")
    private List<WebElement> stateList;
    @FindBy(id = "submit")
    private WebElement submitButton;
    @FindBy(id = "closeLargeModal")
    private WebElement closeModal;


    public void launchPracticeUrl()
    {
        driver.navigate().to(utils.BASE_URL+utils.AUTOMATION_PRACTICE_FORM);
    }

    public void enterFirstName(String name)
    {
        if(name.equalsIgnoreCase( "fakeFirstName"))
        {
            firstName.sendKeys(new Utils().firstName());
        } else {
            firstName.sendKeys(name);
        }
    }

    public void enterSurName(String name)
    {
        if(name.equalsIgnoreCase( "fakeLastName"))
        {
            surName.sendKeys(new Utils().surName());
        } else {
            surName.sendKeys(name);
        }
    }

    public void enterEmailAddress(String email)
    {
        if(email.equalsIgnoreCase( "fakeEmail"))
        {
            emailAddress.sendKeys(new Utils().email());
        } else {
            emailAddress.sendKeys(email);
        }
    }

    public void clickOnGender(String gender)
    {
        if(gender.equalsIgnoreCase("male"))
        {
            waitForElementToBeClickable(maleRadioButton);
            maleRadioButton.click();
        } else if(gender.equalsIgnoreCase("female"))
        {
            waitForElementToBeClickable(femaleRadioButton);
            femaleRadioButton.click();
        } else if(gender.equalsIgnoreCase("other"))
        {
            waitForElementToBeClickable(otherRadioButton);
            otherRadioButton.click();
        }
    }

    public void enterMobileEnter(String mob)
    {
        if(mob.equalsIgnoreCase("fakeMobileNumber")){
            mobile.sendKeys(new Utils().mobile());
        } else {
            mobile.sendKeys(mob);
        }

    }

    public void enterDateOfBirth(String dtB)
    {
       dob.click();
        dob.sendKeys(Keys.BACK_SPACE);
        dob.sendKeys(Keys.BACK_SPACE);
        dob.sendKeys(Keys.BACK_SPACE);
        dob.sendKeys(Keys.BACK_SPACE);
        dob.sendKeys(Keys.BACK_SPACE);
        dob.sendKeys(Keys.BACK_SPACE);
        dob.sendKeys(Keys.BACK_SPACE);
        dob.sendKeys(Keys.BACK_SPACE);
        dob.sendKeys(Keys.BACK_SPACE);
        dob.sendKeys(Keys.BACK_SPACE);
        dob.sendKeys(dtB);
        dob.sendKeys(Keys.ENTER);
    }

    public void enterSubject(String sub)
    {
        subjectContainer.click();

        if(sub.equalsIgnoreCase("fakeSubject"))
        {
            subjectContainer.sendKeys(new Utils().subject());
        } else
        {
            subjectContainer.sendKeys(sub);
        }
    }

    public void clickOnHobbiesRadioButton(String hob)
    {
        if(hob.equalsIgnoreCase("sports"))
        {
            waitForElementToBeClickable(sports);
            sports.click();
        } else if(hob.equalsIgnoreCase("reading"))
        {
            waitForElementToBeClickable(reading);
            reading.click();
        } else if(hob.equalsIgnoreCase("music"))
        {
            waitForElementToBeClickable(music);
            music.click();
        }
    }

    public void uploadPictureToTheServer(String optional) {
        if (optional.equalsIgnoreCase("True")) {
            pictureUpload.sendKeys(System.getProperty("user.dir")
                    + "/src/test/java/com/demoqa/image/eiffel.jpg");
        }
    }

    public void enterCurrentAddress(String add)
    {
        if(add.equalsIgnoreCase("fakeAddress"))
        {
            curAddress.sendKeys(new Utils().address());
        } else {
            curAddress.sendKeys(add);
        }
    }

    public void selectStateFromList(String state)
    {
        stateDrpDwn.click();

        for (WebElement eachState : stateList) {

            if(eachState.getText().equalsIgnoreCase(state))
            {
                eachState.click();
                break;
            }

        }
    }

    public void submitForm()
    {
        scrollDown();
        submitButton.click();
    }

    public void CloseModalPopUp()
    {
        closeModal.click();
    }
}
