package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class Company {
    ArrayList <Double> salary = new ArrayList<Double>();
    int sum;//деньги заработанные менеджерами для компании

    public void hire(int position){
        if (position==1)//TopManager S=200000
        {
            double plus = 0.0;
            if (sum > 10000000)
                plus = 200000.0 * 1.5;
            TopManager person = new TopManager("Анастасия","Хрущева", 200000.0 + plus, "TopManager");
            salary.add(person.calcSalary());
        }
        if (position==2)//Managern S=100000
        {
            int salManforCompany = (int) (115000 + Math.random() * 35000);
            sum = salManforCompany + sum;
            Manager person = new Manager("Вячеслав","Прокопьев", 100000.0 + salManforCompany * 0.05, "Manager");
            salary.add(person.calcSalary());
        }
        if (position==3)//Operator S=60000
        {
            Operator person = new Operator("Иван","Трушин",60000, "Operator");
            salary.add(person.calcSalary());
        }
    }
    public void hireAll(int position, int num){
        for (int i=0; i<num; i++) {
            hire(position);
        }

    }
    public void fire() {
        int num = (int) ( Math.random() * salary.size());
        salary.remove(num);
    }
    public int getlncome ()
    {
        return sum;
    }
    ArrayList getTopSalaryStaff(int count){
        Collections.sort(salary, Collections.reverseOrder());
        for(int i=0; i<count;i++)
        {
            System.out.println(salary.get(i));
        }
        return (salary);
    }
    ArrayList getLowestSalaryStaff(int count)
    {
        Collections.sort(salary);
        for(int i=0; i<count;i++)
        {
            System.out.println(salary.get(i));
        }
        return (salary);
    }
}
