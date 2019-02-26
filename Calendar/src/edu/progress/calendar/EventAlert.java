package edu.progress.calendar;

public class EventAlert {
    String text;

    public EventAlert(Event e) {
        this.text = "You have " + e.getTitle() + "Today";
    }

    public String getText(){
        return text;
    }
}
