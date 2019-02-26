package edu.progress.files.and.folders;

import java.util.List;
import java.util.function.*;

public class PersonFilter {
    private List<Person> people;

    public PersonFilter(List<Person> p){
        people = p;
    }

//    public void processPeople(int maxAge, Sex s){
//        for (Person p : people) {
//            if(p.getAge() <= maxAge && p.getSex().equals(s)){
//                System.out.println(p.getName());
//            }
//
//        }
//    }

//    public void processPeоple(PeopleFilterInterface i){
//        for (Person p : people){
//            if (i.match(p)){
//                System.out.println(p.getName());
//            }
//        }
//    }

    public <T> void processPeоple(PeopleFilterInterface i , PeopleMapInterface<T> pmi , PeopleProcessInterface<T> ppf){
        for (Person p : people){
            if (i.match(p)){
                ppf.action(pmi.map(p));
            }
        }
    }

    public <T> void processPeopleWithJavaInterface(Predicate<Person> predicate , Function<Person, T> function , Consumer<T> consumer){
        for (Person p : people){
            if (predicate.test(p)){
                consumer.accept(function.apply(p));
            }
        }
    }



}
