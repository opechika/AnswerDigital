package com.demoqa.libs;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalculateDates {

    public Date addingDate(int numOfDays)
    {
        Calendar cal = Calendar.getInstance();
        Date date = cal.getTime();
        cal.setTime(date);
        cal.add(Calendar.DAY_OF_MONTH, numOfDays);
        return cal.getTime();
    }

    public String dateString(Date date, String format)
    {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(format);

        return simpleDateFormat.format(date);
    }
}
