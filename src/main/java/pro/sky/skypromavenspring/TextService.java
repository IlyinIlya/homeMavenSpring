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

    public double calculatorPageCalcPlus(double valueOne, double valueTwo) {
        double value = 0;
        value = valueOne + valueTwo;
        return value;
    }

    public double calculatorPageCalcMinus(double valueOne, double valueTwo) {
        double value = 0;
        value = valueOne - valueTwo;
        return value;
    }

    public double calculatorPageCalcMul(double valueOne, double valueTwo) {
        double value = 0;
        value = valueOne * valueTwo;
        return value;
    }

    public double calculatorPageCalcDiv(double valueOne, double valueTwo) {
        double value = 0;
        value = valueOne / valueTwo;
        return value;
    }
}
