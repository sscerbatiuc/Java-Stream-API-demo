package com.step.model;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class PersonHelper {
    public static List<Person> getRandomPerson(int amount) {
        if (amount <= 0) throw new IllegalArgumentException("Please provide a positive number");
        List<Person> personList = new ArrayList<>();
        for (int i = 0; i < amount; i++) {
            Gender gender = i % 2 == 0 ? Gender.MALE : Gender.FEMALE;
            personList.add(new Person("Name " + i, gender, i * 15.0, LocalDate.of(1985 + i, Month.APRIL, 1)));
        }
        return personList;
    }
}
