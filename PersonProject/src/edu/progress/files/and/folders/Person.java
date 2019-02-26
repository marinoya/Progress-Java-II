package edu.progress.files.and.folders;

public class Person {
    private String name;
    private int age;
    private Sex sex;

    public Person(String name, int age, Sex sex) {
        setName(name);
        setAge(age);
        setSex(sex);
    }

    public Person() {
        this("Unknown", 0, Sex.DO_NOT_KNOW);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                '}';
    }
}
