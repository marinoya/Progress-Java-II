package edu.progress.filesproject;


public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private int year;
    private String movie;

    public Person(String firstName, String lastName, int age, String movie, int year) {
        setFirstName(firstName);
        setAge(age);
        setLastName(lastName);
        setMovie(movie);
        setYear(year);
    }

    //    public Person() {
//        this("Unknown", "Unknown", 0,"Unknown",0 );
//    }
//

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getYear() {
        return year;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getMovie() {
        return movie;
    }

    public void setMovie(String movie) {
        this.movie = movie;
    }






    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", year=" + year +
                ", movie='" + movie + '\'' +
                '}';
    }
}
