package com.company;

public class TopManager extends Employee implements EmployeePosition {
    public TopManager(String firstname, String lastname, double salary, String position) {
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
