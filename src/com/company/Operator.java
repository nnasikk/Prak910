package com.company;

public class Operator extends Employee implements EmployeePosition {
    public Operator(String firstname, String lastname, double salary, String position) {
        super(firstname, lastname, salary, position);
    }
    @Override
    public String getJobTitle() {
        return getPosition();
    }

    @Override
    public double calcSalary() {
        return getSalary();
    }
}
