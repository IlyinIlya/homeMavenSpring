package pro.sky.skypromavenspring.services;

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

    public String calculatorPageCalcPlus(Integer valueOne, Integer valueTwo) {
        Integer value = 0;
        try {
            value = valueOne + valueTwo;
            return "Значение сложения: " + value;
        } catch (Exception e) {
            return "Ошибка! Проверьте указанные значения";
        }
    }

    public String calculatorPageCalcMinus(Integer valueOne, Integer valueTwo) {
        Integer value = 0;
        try {
            value = valueOne - valueTwo;
            return "Значение вычитания: " + value;
        } catch (Exception e) {
            return "Ошибка! Проверьте указанные значения";
        }
    }

    public String calculatorPageCalcMul(Integer valueOne, Integer valueTwo) {
        Integer value = 0;
        try {
            value = valueOne * valueTwo;
            return "Значение умножения: " + value;
        } catch (Exception e) {
            return "Ошибка! Проверьте указанные значения";
        }
    }

    public String calculatorPageCalcDiv(Double valueOne, Double valueTwo) {
        double value = 0.0;
        try {
            if (valueTwo != 0.0) {
                value = valueOne / valueTwo;
                return "Значение деления: " + value;
            } else {
                return "Ошибка! Нельзя делить на ноль!";
            }
        } catch (Exception e) {
            return "Ошибка! Проверьте указанные значения";
        }
    }
}
