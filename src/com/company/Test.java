package com.company;

public class Test {
    public Test(Company Test) {
        Test.hireAll(3,180);
        Test.hireAll(2,80);
        Test.hireAll(1,10);
        System.out.println("Top salary: ");
        Test.getTopSalaryStaff(10);
        System.out.println("Low salary: ");
        Test.getLowestSalaryStaff(30);
        for (int i = 0; i < 270/2; i++)
            Test.fire();
        System.out.println("NewTop salary: ");
        Test.getTopSalaryStaff(10);
        System.out.println("NewLow salary: ");
        Test.getLowestSalaryStaff(30);
    }
}
