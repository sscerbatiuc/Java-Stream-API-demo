package edu.step.streamapi.model.test;

import edu.step.streamapi.model.Employee;
import edu.step.streamapi.model.Gender;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author sscerbatiuc
 */
public class EmployeeTest {

    Employee emp;

    private final String name = "name";

    @Before
    public void init() {
        emp = new Employee(name, "surname", Gender.MALE);
    }

    @Test
    public void testEmployee_constructor3params() {
        Assert.assertEquals("Testing name attribute.", name, emp.getName());
        Assert.assertEquals("Testing surname attribute.", "surname", emp.getSurname());
    }

    @Test
    public void testEmployee_equals() {
        Employee e1 = new Employee(name, "surname", Gender.MALE);
        Employee e2 = new Employee(name, "surname", Gender.MALE);
        Assert.assertTrue(e1.equals(e2));
        Employee e3 = new Employee(name, "Surname", Gender.MALE);
        Employee e4 = new Employee(name, "surname", Gender.MALE);
        Assert.assertFalse(e3.equals(e4));

    }

    @Test
    public void testEmployee_setSalaryOK() {
        Employee e1 = new Employee("name", "surname", Gender.MALE);
        e1.setSalary(1500.55);
        Assert.assertEquals("Testing salary attribute", 1500.55, e1.getSalary(), 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testEmployee_setSalaryNegative() {
        Employee e1 = new Employee("name", "surname", Gender.MALE);
        e1.setSalary(-1.5);
        
    }

}
