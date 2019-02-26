package edu.progress.files.and.folders;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Person> peopleList = new ArrayList<>();
        peopleList.add(new Person("Ivan", 45, Sex.MALE));
        peopleList.add(new Person("Vanya", 35, Sex.FEMALE));
        peopleList.add(new Person("Kiro", 66, Sex.MALE));
        peopleList.add(new Person("Mariya", 48, Sex.FEMALE));
        peopleList.add(new Person("Stoyanka", 26, Sex.FEMALE));
        peopleList.add(new Person("Vanyo", 33,Sex.MALE));
        peopleList.add(new Person("Joro", 40,Sex.MALE));
        peopleList.add(new Person("Xanathar", 7589,Sex.DO_NOT_KNOW));
        peopleList.add(new Person("Thing", 1,Sex.DO_NOT_KNOW));




        PersonFilter filter = new PersonFilter(peopleList);
        //filter.processPeople(35,Sex.FEMALE);

        PeopleFilterInterface iFace = new PeopleFilterInterface() {
            @Override
            public boolean match(Person p) {
                if(p.getAge() <=35 && p.getSex().equals(Sex.FEMALE)){
                    return true;
                }
                return false;
            }
        };

        PeopleFilterInterface lambdaFace = (q) -> q.getAge()>40 && q.getSex().equals(Sex.MALE);
        PeopleFilterInterface lambdaFace2 = (r) -> { return r.getAge()>40 && r.getSex().equals(Sex.MALE);};

        //filter.processPeоple(iFace);

        //алтернативно, вкарваме директно ламбдата вътре във аргументите на метода
        //filter.processPeоple( (q) -> q.getAge()>40 && q.getSex().equals(Sex.MALE));

        //filter.processPeоple( (q) -> q.getAge()>40 && q.getSex().equals(Sex.MALE), (s) -> System.out.println(s.getName()));

        filter.processPeоple( (q) -> q.getAge()>40 && q.getSex().equals(Sex.MALE), (t) -> t.getName() , System.out::println );

        filter.processPeopleWithJavaInterface((pr) -> pr.getAge()<=35 && pr.getSex().equals(Sex.FEMALE), (fun) -> fun.getName(), System.out::println);


        //TODO филтър който
        //1 - извежда на екрана името и годините на всички хора от мъжки пол н авъзраст между [30, 40]
        //2 - извежда на екрана името на всички хора които нямат определен пол и са под 18г.

        //1a
        filter.processPeopleWithJavaInterface( (pr) -> pr.getSex().equals(Sex.MALE) && (pr.getAge()>=30 && pr.getAge()<=40)  , (fun) -> fun, (con) -> System.out.println(con.getName() + con.getAge()) );
        //1b
        filter.processPeopleWithJavaInterface( (pr) -> pr.getSex().equals(Sex.MALE) && (pr.getAge()>=30 && pr.getAge()<=40)  , (fun) -> fun.getName() + " " + fun.getAge() , System.out::println );

        //2
        filter.processPeopleWithJavaInterface( (pr) -> pr.getSex().equals(Sex.DO_NOT_KNOW), (fun) -> fun.getName(), System.out::println);

    }
}
