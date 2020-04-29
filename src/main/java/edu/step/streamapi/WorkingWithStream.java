/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.step.streamapi;

import edu.step.streamapi.model.Employee;
import edu.step.streamapi.model.Gender;
import java.util.ArrayList;
import java.util.DoubleSummaryStatistics;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;

/**
 *
 * @author sscerbatiuc
 */
public class WorkingWithStream {

    public static void main(String[] args) {
        Employee p1 = new Employee("John", "Smith", Gender.MALE);
        Employee p2 = new Employee("Jane", "Smith", Gender.FEMALE);
        Employee p3 = new Employee("Angela", "Smith", Gender.FEMALE);
        Employee p4 = new Employee("Peter", "Smith", Gender.MALE);

        List<Employee> employees = new ArrayList<>();
        employees.add(p1);
        employees.add(p2);
        employees.add(p3);
        employees.add(p4);

        // Get the list of names
        List<String> names = employees.stream()
                .map(person -> person.getName())
                .collect(Collectors.toList());

        // Get the list of names for females only
        List<String> females = employees.stream()
                .filter(person -> person.getGender() == Gender.FEMALE)
                .map(female -> female.getName())
                .collect(Collectors.toList());

        // Group the persons by gender
        Map<Gender, List<Employee>> people = employees.stream()
                .collect(Collectors.groupingBy(p -> p.getGender()));

        // Get salaries
        DoubleStream salaries = employees.stream().mapToDouble(e -> e.getSalary());
        double average = salaries.average().orElse(-1);
        double sum = salaries.sum();

        Double sum2 = employees.stream().map(e -> e.getSalary()).reduce(0.0, (s1, s2) -> s1 + s2);

        // Join the names
        String empNames = employees.stream()
                .map(e -> e.getName())
                .collect(Collectors.joining(", "));

        DoubleSummaryStatistics stats = employees.stream()
                .collect(Collectors.summarizingDouble(e -> e.getSalary()));
        stats.getAverage();
        stats.getCount();
        stats.getMax();
        stats.getMin();
        stats.getSum();

    }

    static void withoutStreams() {
        Employee p1 = new Employee("John", "Smith", Gender.MALE);
        Employee p2 = new Employee("Jane", "Smith", Gender.FEMALE);
        Employee p3 = new Employee("Angela", "Smith", Gender.FEMALE);
        Employee p4 = new Employee("Peter", "Smith", Gender.MALE);

        List<Employee> persons = new ArrayList<>();
        persons.add(p1);
        persons.add(p2);
        persons.add(p3);
        persons.add(p4);

        // Get the list of names
        List<String> names = new ArrayList<>();
        for (Employee person : persons) {
            names.add(person.getName());
        }

        // Get the list of names for females only
        List<String> females = new ArrayList<>();
        for (Employee person : persons) {
            if (person.getGender() == Gender.FEMALE) {
                females.add(person.getName());
            }
        }

        // Group the persons by gender
        Map<Gender, List<Employee>> map = new HashMap<>();
        map.put(Gender.MALE, new ArrayList<>());
        map.put(Gender.FEMALE, new ArrayList<>());
        for (Employee person : persons) {
            map.get(person.getGender()).add(person);
        }
    }
}
