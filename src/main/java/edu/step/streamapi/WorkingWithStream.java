/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.step.streamapi;

import edu.step.streamapi.model.Person;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 *
 * @author sscerbatiuc
 */
public class WorkingWithStream {

    public static void main(String[] args) {
        Person p1 = new Person("John", "Smith", "M");
        Person p2 = new Person("Jane", "Smith", "F");
        Person p3 = new Person("Angela", "Smith", "F");
        Person p4 = new Person("Peter", "Smith", "M");

        List<Person> persons = new ArrayList<>();
        persons.add(p1);
        persons.add(p2);
        persons.add(p3);
        persons.add(p4);

        // Get the list of names
        List<String> names = persons.stream()
                .map(person -> person.getName())
                .collect(Collectors.toList());

        // Get the list of names for females only
        List<String> females = persons.stream()
                .filter(person -> person.getGender().equalsIgnoreCase("f"))
                .map(female -> female.getName())
                .collect(Collectors.toList());

        // Group the persons by gender
        Map<String, List<Person>> people = persons.stream()
                .collect(Collectors.groupingBy(p -> p.getGender()));

    }

    static void withoutStreams() {
        Person p1 = new Person("John", "Smith", "M");
        Person p2 = new Person("Jane", "Smith", "F");
        Person p3 = new Person("Angela", "Smith", "F");
        Person p4 = new Person("Peter", "Smith", "M");

        List<Person> persons = new ArrayList<>();
        persons.add(p1);
        persons.add(p2);
        persons.add(p3);
        persons.add(p4);

        // Get the list of names
        List<String> names = new ArrayList<>();
        for (Person person : persons) {
            names.add(person.getName());
        }

        // Get the list of names for females only
        List<String> females = new ArrayList<>();
        for (Person person : persons) {
            if (person.getGender().equalsIgnoreCase("f")) {
                females.add(person.getName());
            }
        }

        // Group the persons by gender
        Map<String, List<Person>> map = new HashMap<>();
        map.put("M", new ArrayList<>());
        map.put("F", new ArrayList<>());
        for (Person person : persons) {
            map.get(person.getGender()).add(person);
        }
    }
}
