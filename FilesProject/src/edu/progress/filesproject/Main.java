package edu.progress.filesproject;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.lang.*;

public class Main {

    public static void main(String[] args) {

        File toRead = new File("C:\\Users\\C17942A\\Documents\\ProgressJava\\oscar_age_female.csv");

        List<String> result = null;

        try {
            result = Files.readAllLines(toRead.toPath());
        } catch (IOException e) {
            e.printStackTrace();
        }

//        if(result != null){
//            for (String s : result){
//                System.out.println(s);
//            }
//
//        }

        if(result != null){
            List<Person> people = new ArrayList<Person>();
            boolean skip = true;
            for (String s : result){

                if (skip){
                    skip = false;
                    continue;
                }
                String[] parts = s.split(",", 5);
//                for(int  i = 1; i < parts.length; i++){
//                    System.out.print(parts[i] + " ");
//                }
//                System.out.println();

                if(parts.length<5){
                    continue;
                }

                int year = Integer.parseInt(parts[1].trim());
                int age = Integer.parseInt(parts[2].trim());
                String [] mySplit = parts[3].trim().split(" ");
                String firstName = mySplit[0].substring(1);
                String lastName  = mySplit.length < 2 ? "" : mySplit[1].substring(0, mySplit[1].length()-1);

                        //parts[3].split(" ")[1].substring(0, parts[3].split(" ")[1].length()-1);
                String movieName = parts[4].trim();

                people.add(new Person(firstName, lastName, age, movieName, year));



            }
            Stream <Person> myStream = people.stream();
            //Всички под 30г
            //List<String> partOf = myStream.filter( person -> person.getAge()<30).map(person -> person.getFirstName()+" "+person.getLastName()+" "+person.getAge()).collect(Collectors.toList());

            /*
            myStream.filter( person -> person.getAge()<30).map(person -> person.getFirstName()+" "+person.getLastName()+" "+person.getAge()).forEach(System.out::println);
            //средната възраст на всички , които са над 30


            myStream = people.stream();
            OptionalDouble ave = myStream.filter(person -> person.getAge()>30).mapToInt(person -> person.getAge()).average();
            System.out.println(ave.getAsDouble());
            */

            //всички, (име и години) чиито имена заповат с J и филмът е спечелил оскар преди средата на миналия век
            myStream = people.stream();
            myStream.filter(person ->  (person.getFirstName().startsWith("J")) && person.getYear() <= 1950 ). map(person -> person.getFirstName()+" "+person.getLastName()+" "+person.getYear()).forEach(System.out::println);


            //броя на буквите от заглавията на всички филми спешелили оскар
            myStream = people.stream();
            int a = myStream.mapToInt(person -> person.getMovie().length()).sum();

            myStream = people.stream();
            /*int b =*/ myStream.map(person -> person.getMovie().substring(2, person.getMovie().length()-1).split("[ ,\']")).reduce(new StringBuilder(), (sb, x) -> {sb.append(x); return sb;}, (b1, b2) -> {b1.append(b2.toString()); return b1;});

            System.out.println(a);


            myStream = people.stream();
            int k = myStream.map(person -> person.getMovie().substring(1, person.getMovie().length()-1)).reduce (new StringBuilder(), (stb, xx) -> {((String)xx).chars().filter(c ->(c>='a'&&c<='z')||(c>='A'&&c<='Z')).forEach(c->stb.append((char)c)); return stb;},(b1 , b2) -> {b1.append(b2.toString()); return b1;}).toString().length();
            System.out.println(k);



            //изпуснах наалото на упрежнението за reduce
            myStream = people.stream();
            List<Integer> av = myStream.filter(person -> person.getAge()>30).map(person -> person.getAge()).reduce(new ArrayList<Integer>(), (x, y) ->{x.add(y); return x;}, (x, y)->{x.addAll(y);return x;});
            System.out.println(av);


            //да се напише reduce който връща Map(new HashMap), ключа да е буквата, а стойността да е броя на срещанията на тази буква във всички имена на филми
            myStream = people.stream();
            HashMap<Character, Integer> hm = myStream.map(person -> person.getMovie().toLowerCase()).reduce(new HashMap<Character, Integer>(), (b, x) ->{((String )x.chars().filter(c->(c>='a'&&c<='z'))}

            ()

        }

    }
}
