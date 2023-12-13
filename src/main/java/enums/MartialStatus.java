package main.java.enums;

public enum MartialStatus {
    Married,
    Unmarried,
    Dull;

    public static MartialStatus fromInt(int value) {
        switch (value) {
            case 0:
                return Married;
            case 1:
                return Unmarried;
            case 2:
                return Dull;
            default:
                throw new IllegalArgumentException("Düzgün ailə vəziyyəti seçilməyib: " + value);
        }
    }

    }
