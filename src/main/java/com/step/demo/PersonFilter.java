package com.step.demo;

import com.step.model.Person;

import java.util.List;

public interface PersonFilter {

    void max3Salaries(List<Person> personList);
    void printWomen1990(List<Person> personList);
    void printMen(List<Person> personList);
    void salaryAsc(List<Person> personList);
    void uniqueSalaries(List<Person> personList);
}
