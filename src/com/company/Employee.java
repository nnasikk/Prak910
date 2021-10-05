package com.company;

public class Employee {
    private String firstname;
    private String lastname;
    private double salary;
    private String position;

    public Employee(String firstname, String lastname, double salary, String position) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.salary = salary;
        this.position = position;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", salary=" + salary +
                ", position='" + position + '\'' +
                '}';
    }
}
