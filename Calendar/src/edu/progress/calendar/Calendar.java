package edu.progress.calendar;

import javafx.scene.control.Alert;

import java.util.ArrayList;

public class Calendar {
    private ArrayList<Event> calendarEvents = new ArrayList<Event>();

    public void addEvent(Event e){
      calendarEvents.add(e);
    }

    public boolean isEventOnThisDate(Event e){
        for (Event ce : calendarEvents) {
            if(ce.getTitle().equals(e.getTitle()) && ce.getEventDate().equals(e.getEventDate())){
                return true;
            }
        }
        return false;
    }

    public EventAlert showTodaysEvent(Event e){
        if(isEventOnThisDate(e)){
            return new EventAlert(e);
        }
        return null;
    }
}
