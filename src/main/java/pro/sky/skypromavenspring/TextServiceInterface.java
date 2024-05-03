package pro.sky.skypromavenspring;

public interface TextServiceInterface {
    String hello();

    String answerHello(String userName);

    String calculatorPage();

    int calculatorPageCalcPlus(int valueOne, int valueTwo);

    int calculatorPageCalcMinus(int valueOne, int valueTwo);

    int calculatorPageCalcMul(int valueOne, int valueTwo);

    double calculatorPageCalcDiv(int valueOne, int valueTwo);
}
