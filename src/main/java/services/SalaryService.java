package main.java.services;

import main.java.enums.MartialStatus;

public class SalaryService {

    public static double calcSalary(double salary, double amount ){
        return salary + amount;
    }

    public static double isMarried(MartialStatus martialStatus,double salary){
        return martialStatus == MartialStatus.Married ? calcSalary(salary,50) : salary;
    }

    // Uşaq pulunun hesablanması
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

    //Gəlir vergisi və gəlir vergisinin dərəcəsi
    public static double[] incomeTax(double salary, boolean disabled){
        double percentage;

        if (salary <= 1000) {
            percentage = 15;
        } else if (salary <= 2000) {
            percentage = 20;
        } else if (salary <= 3000) {
            percentage = 25;
        } else {
            percentage = 30;
        }
        percentage = disabled ? percentage/2 : percentage;

        double incomeTaxResult = (salary * percentage) / 100;

        return new double[] {incomeTaxResult, percentage};
    }

}