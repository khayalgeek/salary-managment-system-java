package main.java.models;

import main.java.enums.MartialStatus;

public class EmployeeInput {
    public static String fullName;
    public static double salary;
    public static MartialStatus martialStatus;
    public static byte childrenCount;
    public static boolean isDisabled;

    public static void setMartialStatus(int value) {
        martialStatus = MartialStatus.fromInt(value);
    }

    public static void setIsDisabled(byte status) {
        switch (status) {
            case 0:
                isDisabled = false;
                break;
            case 1:
                isDisabled = true;
                break;
            default:
                throw new IllegalArgumentException("Səhv seçim: " + status);
        }
    }
}
