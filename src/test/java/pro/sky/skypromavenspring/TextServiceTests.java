package pro.sky.skypromavenspring;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import pro.sky.skypromavenspring.exceptions.DivideIAE;
import pro.sky.skypromavenspring.services.TextService;
import pro.sky.skypromavenspring.services.TextServiceInterface;

@SpringBootTest
public class TextServiceTests {
    private final TextService out = new TextService();

    @Test
    void shouldPlusPositiv() {
        String result = out.calculatorPageCalcPlus(4, 7);
        Assertions.assertEquals("Значение сложения: " + 4 + " + " + 7 + " = " + 11, result);
    }

    @Test
    void shouldPlusNegative() {
        String result = out.calculatorPageCalcPlus(-4, -7);
        Assertions.assertEquals("Значение сложения: " + -4 + " + " + -7 + " = " + -11, result);
    }

    @Test
    void shouldMinusPositiv() {
        String result = out.calculatorPageCalcMinus(4, 7);
        Assertions.assertEquals("Значение вычитания: " + 4 + " - " + 7 + " = " + -3, result);
    }

    @Test
    void shouldMinusNegative() {
        String result = out.calculatorPageCalcMinus(-4, -7);
        Assertions.assertEquals("Значение вычитания: " + -4 + " - " + -7 + " = " + 3, result);
    }

    @Test
    void shouldMulPositiv() {
        String result = out.calculatorPageCalcMul(4, 7);
        Assertions.assertEquals("Значение умножения: " + 4 + " * " + 7 + " = " + 28, result);
    }

    @Test
    void shouldMulPosAndNeg() {
        String result = out.calculatorPageCalcMul(-4, 7);
        Assertions.assertEquals("Значение умножения: " + -4 + " * " + 7 + " = " + -28, result);
    }

    @Test
    void shouldDivPositiv() {
        double valueOne = 4.0;
        double valueTwo = 2.0;
        double valueResult = 2.0;
        String result = out.calculatorPageCalcDiv(valueOne, valueTwo);
        Assertions.assertEquals("Значение деления: "
                + valueOne + " / " + valueTwo + " = " + valueResult, result);
    }

    @Test
    void shouldDivPosAndNeg() {
        double valueOne = -4.0;
        double valueTwo = 2.0;
        double valueResult = -2.0;
        String result = out.calculatorPageCalcDiv(valueOne, valueTwo);
        Assertions.assertEquals("Значение деления: "
                + valueOne + " / " + valueTwo + " = " + valueResult, result);
    }

    @Test
    void shouldNotDivZero() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> out.calculatorPageCalcDiv(4.0, 0.0));
    }
}
