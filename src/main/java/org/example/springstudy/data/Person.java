package org.example.springstudy.data;

import java.util.Objects;

public class Person {
    private String name;
    private Integer age;
    private Double height;
    private Gender gender;

    public Person(String name, Integer age, Double height, Gender gender) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.gender = gender;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name) && Objects.equals(age, person.age) && Objects.equals(height, person.height) && gender == person.gender;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, height, gender);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", gender=" + gender +
                '}';
    }
}
