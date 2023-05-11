package edu.skypro.homework.service.impl;

import edu.skypro.homework.exception.NoArgumentSpecifiedException;
import org.junit.jupiter.api.Test;

import static edu.skypro.homework.constants.CalcServiceImplTestConstants.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CalcServiceImplTest {

    private final CalcServiceImpl out = new CalcServiceImpl(new ValidatorServiceImpl());

    @Test
    void shouldReturnCorrectResultWithMethodPlusTest1() {
        int expected = NUM1 + NUM2;
        int actual = out.plus(NUM1, NUM2);
        assertEquals(expected, actual);
    }

    @Test
    void shouldReturnCorrectResultWithMethodPlusTest2() {
        int expected = NUM3 + NUM4;
        int actual = out.plus(NUM3, NUM4);
        assertEquals(expected, actual);
    }

    @Test
    void shouldReturnCorrectResultWithMethodPlusTest3() {
        int expected = NUM1 + NUM4;
        int actual = out.plus(NUM1, NUM4);
        assertEquals(expected, actual);
    }

    @Test
    void shouldThrowNoArgumentSpecifiedExceptionWithMethodPlus() {
        assertThrows(NoArgumentSpecifiedException.class, () -> out.plus(NUM1, null));
        assertThrows(NoArgumentSpecifiedException.class, () -> out.plus(null, NUM2));
    }

    @Test
    void shouldReturnCorrectResultWithMethodMinusTest1() {
        int expected = NUM1 - NUM2;
        int actual = out.minus(NUM1, NUM2);
        assertEquals(expected, actual);
    }

    @Test
    void shouldReturnCorrectResultWithMethodMinusTest2() {
        int expected = NUM3 - NUM4;
        int actual = out.minus(NUM3, NUM4);
        assertEquals(expected, actual);
    }

    @Test
    void shouldReturnCorrectResultWithMethodMinusTest3() {
        int expected = NUM1 - NUM4;
        int actual = out.minus(NUM1, NUM4);
        assertEquals(expected, actual);
    }

    @Test
    void shouldThrowNoArgumentSpecifiedExceptionWithMethodMinus() {
        assertThrows(NoArgumentSpecifiedException.class, () -> out.minus(NUM1, null));
        assertThrows(NoArgumentSpecifiedException.class, () -> out.minus(null, NUM2));
    }

    @Test
    void shouldReturnCorrectResultWithMethodMultiplyTest1() {
        int expected = NUM1 * NUM2;
        int actual = out.multiply(NUM1, NUM2);
        assertEquals(expected, actual);
    }

    @Test
    void shouldReturnCorrectResultWithMethodMultiplyTest2() {
        int expected = NUM3 * NUM4;
        int actual = out.multiply(NUM3, NUM4);
        assertEquals(expected, actual);
    }

    @Test
    void shouldReturnCorrectResultWithMethodMultiplyTest3() {
        int expected = NUM1 * NUM4;
        int actual = out.multiply(NUM1, NUM4);
        assertEquals(expected, actual);
    }

    @Test
    void shouldThrowNoArgumentSpecifiedExceptionWithMethodMultiply() {
        assertThrows(NoArgumentSpecifiedException.class, () -> out.multiply(NUM1, null));
        assertThrows(NoArgumentSpecifiedException.class, () -> out.multiply(null, NUM2));
    }

    @Test
    void shouldReturnCorrectResultWithMethodDivideTest1() {
        double expected = NUM1 / (double) NUM2;
        double actual = out.divide(NUM1, NUM2);
        assertEquals(expected, actual);
    }

    @Test
    void shouldReturnCorrectResultWithMethodDivideTest2() {
        double expected = NUM3 / (double) NUM4;
        double actual = out.divide(NUM3, NUM4);
        assertEquals(expected, actual);
    }

    @Test
    void shouldReturnCorrectResultWithMethodDivideTest3() {
        double expected = NUM1 / (double) NUM4;
        double actual = out.divide(NUM1, NUM4);
        assertEquals(expected, actual);
    }

    @Test
    void shouldThrowNoArgumentSpecifiedExceptionWithMethodDivide() {
        assertThrows(NoArgumentSpecifiedException.class, () -> out.divide(NUM1, null));
        assertThrows(NoArgumentSpecifiedException.class, () -> out.divide(null, NUM2));
    }

    @Test
    public void shouldThrowIllegalArgumentExceptionWithMethodDivide() {
        assertThrows(IllegalArgumentException.class, () -> out.divide(NUM1, ZERO));
    }
}