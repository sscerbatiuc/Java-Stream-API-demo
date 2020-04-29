/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.step.streamapi.model.test;

import edu.step.streamapi.model.Employee;
import edu.step.streamapi.model.EmployeeManager;
import edu.step.streamapi.model.Gender;
import junit.framework.Assert;
import org.junit.Test;

/**
 *
 * @author sscerbatiuc
 */
public class EmployeeManagerTest {
    // @Homework
    // 1. Cand utilizatorul introduce 2 angajati cu acelasi nume, prenume, ad, --> XduplicateX
    // add, edit, delete, get
    // 
    
    @Test
    public void testManager_add(){
        EmployeeManager empmanag = new EmployeeManager();
        empmanag.add(new Employee("name", "surname", Gender.MALE));
        Assert.assertEquals("Testing add single employee", 1, empmanag.count());
    }
}
