package com.jqueryui.utils;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class GetCurrentDate {

    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("MM/dd/yyyy");

    public static String getDay() {
        int day = LocalDate.now().getDayOfMonth();
        return String.valueOf(day);
    }


    public static String getCurrentDate() {
        LocalDate today = LocalDate.now();
        return today.format(FORMATTER);
    }

    public static String getDateNextMonth(int dia) {
        return LocalDate.now()
                .plusMonths(1)
                .withDayOfMonth(dia)
                .format(FORMATTER);
    }


}
