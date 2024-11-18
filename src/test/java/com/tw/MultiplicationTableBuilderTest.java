package com.tw;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class MultiplicationTableBuilderTest {
    @Test
    void should_return_multiply_table_when_build_given_start_number_2_end_number_4() {
        //given
        MultiplicationTableBuilder builder = new MultiplicationTableBuilder();
        int start = 2;
        int end = 4;
        //when
        String multiplicationTable = builder.build(start, end);
        String expectedMultiplicationTable = String.format("2*2=4%n2*3=6 3*3=9%n2*4=8 3*4=12 4*4=16%n");
        //then
        assertEquals(expectedMultiplicationTable, multiplicationTable);
    }

    @Test
    void should_return_null_when_build_given_start_number_2_end_number_1() {
        //given
        MultiplicationTableBuilder builder = new MultiplicationTableBuilder();
        int start = 2;
        int end = 1;
        //when
        String multiplicationTable = builder.build(start, end);
        //then
        assertNull(multiplicationTable);
    }

    @Test
    void should_return_null_when_build_given_start_number_0_end_number_2() {
        //given
        MultiplicationTableBuilder builder = new MultiplicationTableBuilder();
        int start = 0;
        int end = 2;
        //when
        String multiplicationTable = builder.build(start, end);
        //then
        assertNull(multiplicationTable);
    }

    @Test
    void should_return_null_when_build_given_start_number_2_end_number_1001() {
        //given
        MultiplicationTableBuilder builder = new MultiplicationTableBuilder();
        int start = 2;
        int end = 1001;
        //when
        String multiplicationTable = builder.build(start, end);
        //then
        assertNull(multiplicationTable);
    }

    @Test
    void should_return_multiply_table_when_build_given_start_number_2_end_number_5() {
        //given
        MultiplicationTableBuilder builder = new MultiplicationTableBuilder();
        int start = 2;
        int end = 5;
        //when
        String multiplicationTable = builder.build(start, end);
        String expectedMultiplicationTable = String.format("2*2=4%n2*3=6 3*3=9%n2*4=8 3*4=12 4*4=16%n2*5=10 3*5=15 4*5=20 5*5=25%n");
        //then
        assertEquals(expectedMultiplicationTable, multiplicationTable);
    }
}
