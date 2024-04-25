package com.example.petshopbackend.utils;

import java.time.LocalDate;

public class DateOperations {

    public static boolean isWeekend(LocalDate date) {
        return date.getDayOfWeek().getValue() >= 6;
    }
}
