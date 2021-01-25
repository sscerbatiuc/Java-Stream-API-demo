package com.step.demo;

import com.step.model.Gender;
import com.step.model.Person;

import java.time.LocalDate;
import java.time.Month;
import java.util.*;

public class DemoUsingRegularSolutions implements PersonFilter {

    public void max3Salaries(List<Person> persons) {
        persons.sort(new ReverseSalaryComparator());
        int counter = 3;
        for (int i = 0; i < counter; i++) {
            System.out.println(persons.get(i));
        }
    }

    public void printWomen1990(List<Person> personList) {
        int counter = 0;
        for (Person p : personList) {
            if (p.getGender() == Gender.MALE) {
                continue;
            }
            if (p.getBirthdate().isAfter(LocalDate.of(1990, Month.JANUARY, 1))) {
                System.out.println(p);
            }
            if (++counter == 2) {
                break;
            }
        }
    }

    @Override
    public void printMen(List<Person> personList) {
        for (Person p : personList) {
            if (p.getGender() == Gender.MALE) {
                System.out.println(p);
            }
        }
    }

    @Override
    public void salaryAsc(List<Person> personList) {
        List<Double> salaries = new ArrayList<>();
        for (Person p : personList) {
            salaries.add(p.getSalary());
        }
        Collections.sort(salaries);
        for (Double s : salaries) {
            System.out.println(s);
        }
    }

    @Override
    public void uniqueSalaries(List<Person> personList) {
        Set<Double> uniqueSalaries = new HashSet<>();
        for (Person p : personList) {
            uniqueSalaries.add(p.getSalary());
        }
        for (Double unique : uniqueSalaries) {
            System.out.println(unique);
        }
    }


}


/**
 * Classic way of defining the comparator that it is used to compare the objects of type {@link Person} by the salary descending.
 */
class ReverseSalaryComparator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        return o2.getSalary().compareTo(o1.getSalary());
    }
}
