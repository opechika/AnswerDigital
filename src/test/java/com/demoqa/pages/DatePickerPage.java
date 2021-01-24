package com.demoqa.pages;

import com.demoqa.libs.CalculateDates;
import com.demoqa.libs.Utils;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.Date;
import java.util.List;

public class DatePickerPage extends BasePage
{
    CalculateDates calculateDates = new CalculateDates();

    public DatePickerPage(WebDriver driver)
    {
        this.driver = driver;
    }


    Date monthTime = calculateDates.addingDate(30);
    String monthToSelect = calculateDates.dateString(monthTime, "MMMM");
    String dayToSelect = calculateDates.dateString(monthTime, "dd");
    String fullDate = calculateDates.dateString(monthTime, "MM/dd/yyyy");

    @FindBy(id = "datePickerMonthYearInput")
    private WebElement datePicker;
    @FindBy(css = "select.react-datepicker__month-select")
    private WebElement calendarMonthDropDown;
    @FindBy(css = "div[class*='react-datepicker__day react-datepicker__day']")
    private List<WebElement> dayPicker;

    public void clickOnDatePicker()
    {
        datePicker.click();
    }


    private void selectDateMonth(String month)
    {
        selectElementByVisibleText(calendarMonthDropDown, month);
    }

    public void selectMonthFromDatePicker()
    {
        selectDateMonth(monthToSelect);
    }

    public void selectDateDay(String day)
    {
        for (WebElement dPicker : dayPicker)
        {
            String dayString = dPicker.getText();

            if(dayString.equalsIgnoreCase(day))
            {
                dPicker.click();
                break;
            }
        }
    }

    public void selectDayFromDatePicker()
    {
        if(dayToSelect.startsWith("0"))
        {
            new Utils().removeLeadingZeros(dayToSelect);
        }

        selectDateDay(dayToSelect);
    }

    public void isRightDateDisplayed()
    {
        String dateDisplayed = datePicker.getAttribute("value");

        Assert.assertEquals(dateDisplayed + " not equal to " + fullDate,
                                        dateDisplayed, fullDate);
    }
}
