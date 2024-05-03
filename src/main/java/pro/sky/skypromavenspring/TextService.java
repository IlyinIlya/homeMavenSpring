package pro.sky.skypromavenspring;

import org.springframework.stereotype.Service;

@Service
public class TextService implements TextServiceInterface {
    public String hello() {
        return "<b>Привет</b>";
    }

    public String answerHello(String userName) {
        return "<p><b>И тебе привет</b></p> " + userName;
    }

    public String calculatorPage() {
        return "<p><b>Добро пожаловать в калькулятор</b></p> ";
    }

    public int calculatorPageCalcPlus(int valueOne, int valueTwo) {
        int value = 0;
        value = valueOne + valueTwo;
        return value;
    }

    public int calculatorPageCalcMinus(int valueOne, int valueTwo) {
        int value = 0;
        value = valueOne - valueTwo;
        return value;
    }

    public int calculatorPageCalcMul(int valueOne, int valueTwo) {
        int value = 0;
        value = valueOne * valueTwo;
        return value;
    }

    public double calculatorPageCalcDiv(int valueOne, int valueTwo) {
        int value = 0;
        try {
            value = valueOne / valueTwo;
        } catch (ArithmeticException e) {
            System.out.println("Ошибка! Нельзя делить на ноль!");
        }
        return value;
    }
}
