package pro.sky.skypromavenspring;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import pro.sky.skypromavenspring.services.TextService;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TextServiceParametrizedTests {

    TextService out = new TextService();
    public static Stream<Arguments> provideArgumentsPlus() {
        return Stream.of(
                Arguments.of(4, 7, 11),
                Arguments.of(4, -7, -3),
                Arguments.of(-4, -7, -11)
        );
    }
    public static Stream<Arguments> provideArgumentsMinus() {
        return Stream.of(
                Arguments.of(4, 7, -3),
                Arguments.of(4, -7, 11),
                Arguments.of(-4, -7, 3)
        );
    }
    public static Stream<Arguments> provideArgumentsMul() {
        return Stream.of(
                Arguments.of(4, 7, 28),
                Arguments.of(4, -7, -28),
                Arguments.of(-4, -7, 28)
        );
    }
    public static Stream<Arguments> provideArgumentsDiv() {
        return Stream.of(
                Arguments.of(4, 2, 2.0),
                Arguments.of(4, -2, -2.0),
                Arguments.of(-4, -2, 2.0)
        );
    }
    @ParameterizedTest
    @MethodSource("provideArgumentsPlus")
    public void argumentsPlusTest(Integer valueOne, Integer valueTwo, Integer value){
        assertEquals("Значение сложения: " + valueOne + " + " + valueTwo + " = " + value,
                out.calculatorPageCalcPlus(valueOne, valueTwo));
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsMinus")
    public void argumentsMinusTest(Integer valueOne, Integer valueTwo, Integer value){
        assertEquals("Значение вычитания: " + valueOne + " - " + valueTwo + " = " + value,
                out.calculatorPageCalcMinus(valueOne, valueTwo));
    }
    @ParameterizedTest
    @MethodSource("provideArgumentsMul")
    public void argumentsMulTest(Integer valueOne, Integer valueTwo, Integer value){
        assertEquals("Значение умножения: " + valueOne + " * " + valueTwo + " = " + value,
                out.calculatorPageCalcMul(valueOne, valueTwo));
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsDiv")
    public void argumentsDivTest(Integer valueOne, Integer valueTwo, double value){
        assertEquals("Значение деления: " + valueOne + " / " + valueTwo + " = " + value,
                out.calculatorPageCalcDiv(valueOne, valueTwo));
    }
}
