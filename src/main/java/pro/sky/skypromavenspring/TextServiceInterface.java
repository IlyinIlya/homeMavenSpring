package pro.sky.skypromavenspring;

public interface TextServiceInterface {
    String hello();

    String answerHello(String userName);

    String calculatorPage();

    double calculatorPageCalcPlus(double valueOne, double valueTwo);

    double calculatorPageCalcMinus(double valueOne, double valueTwo);

    double calculatorPageCalcMul(double valueOne, double valueTwo);

    double calculatorPageCalcDiv(double valueOne, double valueTwo);
}
