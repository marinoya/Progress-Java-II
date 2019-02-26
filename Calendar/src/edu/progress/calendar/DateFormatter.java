package edu.progress.calendar;

import java.util.Scanner;

public class DateFormatter {


    String year;
    String month;
    String day;

    String hours;
    String minutes;

    public DateFormatter(String year, String month, String day) {

    }

    public DateFormatter(String year, String month, String day, String hours, String minutes) {

    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getHours() {
        return hours;
    }

    public void setHours(String hours) {
        this.hours = hours;
    }

    public String getMinutes() {
        return minutes;
    }

    public void setMinutes(String minutes) {
        this.minutes = minutes;
    }
}
