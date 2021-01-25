package com.step.demo;

import com.step.model.Gender;
import com.step.model.Person;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

public class DemoUsingStream implements PersonFilter {

    @Override
    public void max3Salaries(List<Person> personList) {
        personList.stream()
                .map(p -> p.getSalary())
                .sorted()
                .forEach(salary -> System.out.println(salary));
    }

    @Override
    public void printWomen1990(List<Person> personList) {
        LocalDate reference = LocalDate.of(1990, Month.JANUARY, 1);
        personList.stream()
                .filter(p ->  p.getGender() == Gender.FEMALE && p.getBirthdate().isAfter(reference))
                .limit(2)
                .forEach(female -> System.out.println(female));
    }

    @Override
    public void printMen(List<Person> personList) {
        personList.stream()
                .filter(p -> p.getGender() == Gender.MALE)
                .forEach(male -> System.out.println(male));
    }

    @Override
    public void salaryAsc(List<Person> personList) {
        personList.stream()
                .map(p -> p.getSalary())
                .sorted()
                .forEach(salary -> System.out.println(salary));
    }

    @Override
    public void uniqueSalaries(List<Person> personList) {
        personList.stream()
                .map(p -> p.getSalary())
                .distinct()
                .forEach(uniqueDouble -> System.out.println(uniqueDouble));
    }
}
