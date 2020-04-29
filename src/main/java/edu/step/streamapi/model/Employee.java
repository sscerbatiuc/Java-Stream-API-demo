/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.step.streamapi.model;

import java.util.Objects;

/**
 *
 * @author sscerbatiuc
 */
public class Employee {

    String name;
    String surname;
    Gender gender;
    double salary;

    public Employee(String name, String surname, Gender gender) {
        this.surname = surname;
        this.name = name;
        this.gender = gender;
    }

    public Employee(String name, String surname, Gender gender, double salary) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Gender getGender() {
        return gender;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary > 0) {
            this.salary = salary;
        } else {
//            System.out.println("Eroare: salariul nu poate fi negativ.");
            throw new IllegalArgumentException("Eroare: salariul nu poate fi negativ.");
        }

    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.name);
        hash = 29 * hash + Objects.hashCode(this.surname);
        hash = 29 * hash + Objects.hashCode(this.gender);
        hash = 29 * hash + (int) (Double.doubleToLongBits(this.salary) ^ (Double.doubleToLongBits(this.salary) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Employee other = (Employee) obj;
        if (Double.doubleToLongBits(this.salary) != Double.doubleToLongBits(other.salary)) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.surname, other.surname)) {
            return false;
        }
        if (this.gender != other.gender) {
            return false;
        }
        return true;
    }

}
