package edu.skypro.homework.service.impl;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static edu.skypro.homework.constants.CalcServiceImplTestConstants.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class CalcServiceImplParametrizedTest {
    private final CalcServiceImpl out = new CalcServiceImpl(new ValidatorServiceImpl());

    @ParameterizedTest
    @MethodSource("provideParamsForCorrectValueTests")
    public void shouldReturnCorrectResultWithMethodPlus(Integer num1, Integer num2) {
        Integer expected = num1 + num2;
        Integer actual = out.plus(num1, num2);
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @MethodSource("provideParamsForCorrectValueTests")
    public void shouldReturnCorrectResultWithMethodMinus(Integer num1, Integer num2) {
        Integer expected = num1 - num2;
        Integer actual = out.minus(num1, num2);
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @MethodSource("provideParamsForCorrectValueTests")
    public void shouldReturnCorrectResultWithMethodMultiply(Integer num1, Integer num2) {
        Integer expected = num1 * num2;
        Integer actual = out.multiply(num1, num2);
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @MethodSource("provideParamsForCorrectValueTests")
    public void shouldReturnCorrectResultWithMethodDivide(Integer num1, Integer num2) {
        double expected = num1 / (double) num2;
        double actual = out.divide(num1, num2);
        assertEquals(expected, actual);
    }

//    @ParameterizedTest
//    @MethodSource("provideParamsForExceptionsTests")
//    public void shouldThrowNoArgumentSpecifiedExceptionWithMethodPlus(Integer num1, Integer num2) {
//        assertThrows(NoArgumentSpecifiedException.class, () -> out.plus(num1, num2));
//    }
//
//    @ParameterizedTest
//    @MethodSource("provideParamsForExceptionsTests")
//    public void shouldThrowNoArgumentSpecifiedExceptionWithMethodMinus(Integer num1, Integer num2) {
//        assertThrows(NoArgumentSpecifiedException.class, () -> out.minus(num1, num2));
//    }
//
//    @ParameterizedTest
//    @MethodSource("provideParamsForExceptionsTests")
//    public void shouldThrowNoArgumentSpecifiedExceptionWithMethodMultiply(Integer num1, Integer num2) {
//        assertThrows(NoArgumentSpecifiedException.class, () -> out.multiply(num1, num2));
//    }
//
//    @ParameterizedTest
//    @MethodSource("provideParamsForExceptionsTests")
//    public void shouldThrowNoArgumentSpecifiedExceptionWithMethodDivide(Integer num1, Integer num2) {
//        assertThrows(NoArgumentSpecifiedException.class, () -> out.divide(num1, num2));
//    }
//
//    @Test
//    public void shouldThrowIllegalArgumentExceptionWithMethodDivide() {
//        assertThrows(IllegalArgumentException.class, () -> out.divide(NUM1, ZERO));
//    }

    public static Stream<Arguments> provideParamsForCorrectValueTests() {
        return Stream.of(
                Arguments.of(NUM1, NUM2),
                Arguments.of(NUM3, NUM4),
                Arguments.of(NUM1, NUM4)
        );
    }

//    public static Stream<Arguments> provideParamsForExceptionsTests() {
//        return Stream.of(
//                Arguments.of(NUM1, null),
//                Arguments.of(null, NUM1)
//        );
//    }
}
