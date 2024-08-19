package de.ricardo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathTest {

    @Test //Annotation
    void aad_shouldReturn10_whenCalledWith7and3() {
        // GIVEN
        int a = 7;
        int b = 3;
        int expected = 10;

        //WHEN
        int actual = Main.add(a, b);
        //THEN
        assertEquals(expected, actual);
    }

    @Test
    void isEven_shouldReturnTrue_whenCalledWith4() {
        // GIVEN
        int number = 4;

        // WHEN
        boolean actual = Main.isEven(number);

        // THEN
        assertTrue(actual);
    }

    @Test
    void isEven_shouldReturnFalse_whenCalledWith5() {
        //GIVEN
        int number = 5;

        //WHEN
        boolean actual = Main.isEven(number);

        //THEN
        assertFalse(actual);
    }

    @Test
    void product_ShouldReturn6_whenCalledWith2and3() {
        //GIVEN
        int a = 2;
        int b = 3;
        int expected = 6;

        //WHEN
        int actual = Main.product(a,b);

        //THEN
        assertEquals(expected, actual);
    }

    @Test
    void toUpperCase_ShouldReturnHello_whenCalledWithHello(){
        //GIVEN
        String input = "Hello";
        String expected = "HELLO";

        //WHEN
        String actual = Main.toUpperCase(input);

        //THEN
        assertEquals(expected, actual);
    }

    @Test
    void isPositive_shouldReturnTrue_whenCalledWithPositive(){
        //GIVEN
        int number = 1;

        //WHEN
        boolean actual = Main.isPositive(number);

        //THEN
        assertTrue(actual);
    }

}