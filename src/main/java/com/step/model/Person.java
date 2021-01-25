package com.step.model;

import java.time.LocalDate;

public class Person {
    private String name;
    private Gender gender;
    private Double salary;
    private LocalDate birthdate;

    public Person(String name, Gender gender, Double salary, LocalDate birthdate) {
        this.name = name;
        this.gender = gender;
        this.salary = salary;
        this.birthdate = birthdate;
    }

    public String getName() {
        return name;
    }

    public Gender getGender() {
        return gender;
    }

    public Double getSalary() {
        return salary;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", salary=" + salary +
                ", birthdate=" + birthdate +
                '}';
    }
}
