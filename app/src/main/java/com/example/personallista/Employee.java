package com.example.personallista;

public class Employee {
    String name;
    String age;
    String salary;

    //Controller som skickar till adaptern som sen kan skicka till listviewn



    //Settar och gettar

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }


    //Konstruktor till name, age och salary
    public Employee(String name, String age, String salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

}
