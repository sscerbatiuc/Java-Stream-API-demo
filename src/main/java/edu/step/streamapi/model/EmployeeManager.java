package edu.step.streamapi.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sscerbatiuc
 */
public class EmployeeManager {

    private List<Employee> employees = new ArrayList<>();
    
    public int count(){
        return employees.size();
    }
    
    public void add(Employee emp){
        this.employees.add(emp);
    }
    
    // edit, delete, get
}
