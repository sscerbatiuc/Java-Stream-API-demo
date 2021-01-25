package com.step.stream;

import com.step.model.Person;
import com.step.model.PersonHelper;

import java.util.List;
import java.util.Optional;

public class UsingOptional {

    public static void main(String[] args) {
        List<Person> list = PersonHelper.getRandomPerson(10);

        Optional<Person> optionalPerson = list.stream()
                .filter(person -> person.getName().contains("1"))
                .findAny();
    }

    public static void findAny(List<Person> list) {
        Optional<Person> optionalPerson = list.stream()
                .filter(person -> person.getName().contains("1"))
                .findAny();
    }

    public static void findFirst(List<Person> personList) {
        Optional<Person> optionalPerson = personList.stream()
                .filter(person -> person.getName().contains("1"))
                .findFirst();
    }

}
