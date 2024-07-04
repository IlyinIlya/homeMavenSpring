package pro.sky.skypromavenspring.services;

import java.io.IOException;

public interface TextServiceInterface {
    String hello();

    String answerHello(String userName);

    String calculatorPage();

    String calculatorPageCalcPlus(Integer valueOne, Integer valueTwo);

    String calculatorPageCalcMinus(Integer valueOne, Integer valueTwo);

    String calculatorPageCalcMul(Integer valueOne, Integer valueTwo);

    String calculatorPageCalcDiv(Double valueOne, Double valueTwo);
}
