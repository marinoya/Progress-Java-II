package edu.progress.calendar;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import static edu.progress.calendar.EventType.REPEATS_YEARLY;

public class Main {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);



        Event birthday = new Event("1985-10-04", "Yassens Birthday", REPEATS_YEARLY);
        Event test = new Event("1985-10-04", "14:40", "Yassens Birthday", REPEATS_YEARLY);




        Calendar cal = new Calendar();
        cal.addEvent(birthday);
        System.out.println(cal.isEventOnThisDate(test));

        System.out.println(test.getTitle() + " is on " + test.getEventDate());

        Event now = new Event();
        cal.addEvent(now);


        System.out.println(cal.showTodaysEvent(now));



//        SimpleDateFormat ft = new SimpleDateFormat ("yyyy-MM-dd");
//        String input =  "1818-11-11" ;
//
//        System.out.print(input + " Parses as ");
//
//        Date t;
//        try {
//            t = ft.parse(input);
//            System.out.println(t);
//        } catch (ParseException e) {
//            System.out.println("Unparseable using " + ft);
//        }
//
//        String ybd = "1985-10-04";
//
//        Date birthday;
//        try {
//            birthday = ft.parse(ybd);
//            System.out.println(birthday);
//        } catch (ParseException e) {
//            e.printStackTrace();
//        }



    }
}