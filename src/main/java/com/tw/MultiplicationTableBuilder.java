package com.tw;

public class MultiplicationTableBuilder {

    public static void main(String[] args) {
        MultiplicationTableBuilder builder = new MultiplicationTableBuilder();
        int start = 2;
        int end = 4;
        String multiplicationTable = builder.build(start, end);

        System.out.println(multiplicationTable);
    }

    public String build(int start, int end) {
        return "";
    }

    // 1.1 isValidInputOnRange
    public static boolean isValidInputOnRange(int start, int end) {
        if (start < 2 || start > 1000 || end < 1 || end > 1000) {
            System.out.println("The numbers out of Range");
            return false;
        }
        return true;
    }

    // 1.2 isStartValueSmallerEndValue
    public static boolean isStartValueSmallerEndValue(int start, int end) {
        if (end < start) {
            System.out.println("The end number must be greater than or equal to the start number!");
            return false;
        }
        return true;
    }
}
