package pro.sky.skypromavenspring.services;

import org.springframework.stereotype.Service;
import pro.sky.skypromavenspring.exceptions.DivideIAE;

@Service
public class TextService implements TextServiceInterface {

    public String calculatorPage() {
        return "<p><b>Добро пожаловать в калькулятор</b></p> ";
    }

    public String calculatorPageCalcPlus(Integer valueOne, Integer valueTwo) {
        try {
            Integer value = valueOne + valueTwo;
            return "Значение сложения: " + valueOne + " + " + valueTwo + " = " + value;
        } catch (Exception e) {
            return "Ошибка! Проверьте указанные значения";
        }
    }

    public String calculatorPageCalcMinus(Integer valueOne, Integer valueTwo) {
        try {
            Integer value = valueOne - valueTwo;
            return "Значение вычитания: " + valueOne + " - " + valueTwo + " = " + value;
        } catch (Exception e) {
            return "Ошибка! Проверьте указанные значения";
        }
    }

    public String calculatorPageCalcMul(Integer valueOne, Integer valueTwo) {
        try {
            Integer value = valueOne * valueTwo;
            return "Значение умножения: " + valueOne + " * " + valueTwo + " = " + value;
        } catch (Exception e) {
            return "Ошибка! Проверьте указанные значения";
        }
    }

    public String calculatorPageCalcDiv(Integer valueOne, Integer valueTwo) throws DivideIAE {
        try {
            if (valueTwo == 0.0) {
                throw new DivideIAE();
            }
            double value = valueOne / valueTwo;
            return "Значение деления: " + valueOne + " / " + valueTwo + " = " + value;
        } catch (DivideIAE e) {
            throw new DivideIAE("Ошибка! Делить на ноль нельзя!");
        } catch (Exception e) {
            return "Ошибка! Проверьте указанные значения";
        }
    }
}
