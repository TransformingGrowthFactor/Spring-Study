package org.example.springstudy.dto;

import org.example.springstudy.data.Gender;

public class PersonCreateRequest {
    private String name;

    private Integer age;

    private Double height;

    private Gender gender;

    public PersonCreateRequest(String name, Integer age, Double height, Gender gender) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public Double getHeight() {
        return height;
    }

    public Gender getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "PersonCreateRequest{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", gender=" + gender +
                '}';
    }
}
