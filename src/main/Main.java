package main;

import main.java.helper.Helper;
import main.java.models.EmployeeInput;
import main.java.services.SalaryService;

import java.util.Scanner;

public class Main  {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        Helper.showMessageForUser("işçinin ad və soyadı");
        EmployeeInput.fullName = scanner.nextLine();

        Helper.showMessageForUser("əmək haqqın");
        EmployeeInput.salary = scanner.nextFloat();

        Helper.showMessageForUser("ailə vəziyyətin (0: evli, 1: subay, 2: dul)");
        int martialStatusValue = scanner.nextInt();
        EmployeeInput.setMartialStatus(martialStatusValue);

        EmployeeInput.salary = SalaryService.isMarried(EmployeeInput.martialStatus,EmployeeInput.salary);

        Helper.showMessageForUser("uşaq sayını");
        EmployeeInput.childrenCount = scanner.nextByte();

        EmployeeInput.salary = SalaryService.childAllowance(EmployeeInput.childrenCount,EmployeeInput.salary);

        Helper.showMessageForUser("əlillik statusunuzu (0: Xeyr, 1: Bəli)");
        byte isDisabledValue = scanner.nextByte();
        EmployeeInput.setIsDisabled(isDisabledValue);
        scanner.close();
        
        EmployeeInput.salary = SalaryService.incomeTax(EmployeeInput.salary, EmployeeInput.isDisabled )[0];

        System.out.println("İşçinin ad və soyadı: "+EmployeeInput.fullName);
        System.out.println("İşçinin əmək haqqı: "+EmployeeInput.salary);
        System.out.println("İşçinin ailə vəziyyəti: "+EmployeeInput.martialStatus);
        System.out.println("İşçinin uşaqlarının sayı: "+EmployeeInput.childrenCount);
        System.out.println("İşçinin əlillik vəziyəti: "+EmployeeInput.isDisabled);

    }
}