package pro.sky.skypromavenspring.services;

import java.io.IOException;

public interface TextServiceInterface {

    String calculatorPage();

    String calculatorPageCalcPlus(Integer valueOne, Integer valueTwo);

    String calculatorPageCalcMinus(Integer valueOne, Integer valueTwo);

    String calculatorPageCalcMul(Integer valueOne, Integer valueTwo);

    String calculatorPageCalcDiv(Integer valueOne, Integer valueTwo);
}
