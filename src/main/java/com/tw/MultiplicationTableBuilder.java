package com.tw;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MultiplicationTableBuilder {

    public static int  MIN_RANGE =  1;
    public static int  MAX_RANGE =  1000;

    public static void main(String[] args) {
        MultiplicationTableBuilder builder = new MultiplicationTableBuilder();
        int start = 2;
        int end = 4;
        String multiplicationTable = builder.build(start, end);

        System.out.println(multiplicationTable);
    }

    public String build(int start, int end) {
        return printMultiplicationTableByStartAndEnd(start, end);
    }

    // Main method to validate input and generate the multiplication table
    public static String printMultiplicationTableByStartAndEnd(int start, int end) {
        // Validate the input range
        if (isValidInput(start, end)) {
            // Generate the multiplication table
            return generateMultiplicationTable(start, end);
        }
        return null;
    }

    // 1、isValidInput
    private static boolean isValidInput(int start, int end) {
        return isValidInputOnRange(start) && isValidInputOnRange(end) && isStartValueSmallerEndValue(start,end);
    }

    // 1.1 isValidInputOnRange
    public static boolean isValidInputOnRange(int number) {
        return number >= MIN_RANGE && number <= MAX_RANGE;
    }

    // 1.2 isStartValueSmallerEndValue
    public static boolean isStartValueSmallerEndValue(int start, int end) {
        return start <= end;
    }

    // 2.2 Generate the entire multiplication table
    public static String generateMultiplicationTable(int start, int end) {
        return IntStream.range(0, end - start + 1) // Loop through rows
                .mapToObj(i -> generateMultiplicationRow(start, i))
                .collect(Collectors.joining("\r\n")) + "\r\n"; // Add a newline at the end
    }

    // 2.1 Generate one row of the multiplication table
    private static String generateMultiplicationRow(int start, int rowIndex) {
        int end = start + rowIndex;
        return IntStream.rangeClosed(start, end)
                .mapToObj(i -> String.format("%d*%d=%d", i, end, i * end))
                .collect(Collectors.joining(" ")); // Join expressions with a space
    }

}
