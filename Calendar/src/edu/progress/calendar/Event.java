package edu.progress.calendar;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Event {

    private Date eventDate;
    private String title;
    private String details;
    private EventType eventType;

    public Event(){
        this.eventDate = new Date() ;
        setTitle("NOW");
    }


    public Event(String yearMonthDay, String title, EventType et) {
        setEventDate(yearMonthDay);
        setTitle(title);
        setEventType(et);
    }

    public Event(String yearMonthDay, String hourMinute, String title, EventType et){
        setEventDate(yearMonthDay, hourMinute);
        setTitle(title);
        setEventType(et);
    }

    public Date getEventDate() {
        return this.eventDate;
    }

    public void setEventDate(Date eventDate) {
        this.eventDate = eventDate;
    }
    public void setEventDate(String yearMonthDate) {

        SimpleDateFormat ft = new SimpleDateFormat ("yyyy-MM-dd");

        Date dateOfEvent = new Date();
        try {
            dateOfEvent = ft.parse(yearMonthDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        this.eventDate=dateOfEvent;
    }

    public void setEventDate(String yearMonthDate, String hourMinute) {

        String yearMonthDateHourMinute = yearMonthDate.concat(" at ").concat(hourMinute);

        SimpleDateFormat ft = new SimpleDateFormat ("yyyy-MM-dd 'at' hh:mm");

        Date dateOfEvent = new Date();
        try {
            dateOfEvent = ft.parse(yearMonthDateHourMinute);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        this.eventDate=dateOfEvent;

    }



    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDetails() {
        return this.details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public EventType getEventType() {
        return eventType;
    }

    public void setEventType(EventType eventType) {
        this.eventType = eventType;
    }
}
