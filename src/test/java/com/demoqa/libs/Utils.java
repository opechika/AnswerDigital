package com.demoqa.libs;

import com.github.javafaker.Faker;

public class Utils {


    public String BASE_URL = "https://demoqa.com/";
    public String AUTOMATION_PRACTICE_FORM = "automation-practice-form";
    public String ALERTS = "alerts";
    public String TOOLTIPS = "tool-tips";
    public String DROPPABLE = "droppable";
    public String MODAL_DIALOGS = "modal-dialogs";
    public String DATE_PICKERS = "date-picker";

    Faker faker = new Faker();

    public String firstName()
    {
        return faker.name().firstName();
    }

    public String surName()
    {
        return faker.name().lastName();
    }

    public String email()
    {
        return faker.internet().emailAddress();
    }

    public String mobile()
    {
        return faker.number().digits(10);
    }

    public String subject()
    {
        return faker.programmingLanguage().name();
    }

    public String address()
    {
        return faker.address().fullAddress();
    }

}
