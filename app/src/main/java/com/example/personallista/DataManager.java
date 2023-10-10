package com.example.personallista;

import java.util.ArrayList;

public class DataManager {

    public static ArrayList<Employee> employees = new ArrayList <>();



    public Employee createEmployee(String name, String age, String salary){
        Employee employee = new Employee(name, age, salary);
        employees.add(employee);
        return employee;

    }
}
