package com.example.personallista;

import java.util.ArrayList;

public class DataManager {
    // En ArrayList som används för att lagra anställda objekt.
    public static ArrayList<Employee> employees = new ArrayList <>();

//Lägger in ny employees i Arrayen
    public Employee createEmployee(String name, String age, String salary){
        Employee employee = new Employee(name, age, salary);
        employees.add(employee);
        return employee;

    }
}
