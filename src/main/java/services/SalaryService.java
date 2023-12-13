package main.java.services;

import main.java.enums.MartialStatus;

public class SalaryService {

    public static double calcSalary(double salary, double amount ){
        return salary + amount;
    }
    public static double isMarried(MartialStatus martialStatus,double salary){
        return martialStatus == MartialStatus.Married ? calcSalary(salary,50) : salary;
    }

    public static double childAllowance(byte childCount, double salary) {
        double amount = 30 + 25 + 20;

        if (childCount == 1){
            amount -= 25;
        }
        else if (childCount == 2){
            amount -= 20;
        } 
        else if (childCount > 3){
            amount += (childCount - 3) * 15;
        }

        return calcSalary(salary, amount);
    }


}