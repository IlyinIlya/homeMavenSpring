package pro.sky.skypromavenspring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TextController {
    private final TextServiceInterface textService;

    public TextController(TextServiceInterface textService) {
        this.textService = textService;
    }
    @GetMapping
    public String hello() {
        return textService.hello();
    }

    @GetMapping(path= "/hello")
    public String answerHello(@RequestParam ("name") String userName) {
        return textService.answerHello(userName);
    }
    @GetMapping(path= "/calculator")
    public String calculatorPage() {
        return textService.calculatorPage();
    }
    @GetMapping(path= "/calculator/plus")
    public double calculatorPageCalcPlus(@RequestParam ("num1") double valueOne, @RequestParam ("num2") double valueTwo) {
        return textService.calculatorPageCalcPlus(valueOne, valueTwo);
    }
    @GetMapping(path= "/calculator/minus")
    public double calculatorPageCalcMinus(@RequestParam ("num1") double valueOne, @RequestParam ("num2") double valueTwo) {
        return textService.calculatorPageCalcMinus(valueOne, valueTwo);
    }
    @GetMapping(path= "/calculator/multiply")
    public double calculatorPageCalcMul(@RequestParam ("num1") double valueOne, @RequestParam ("num2") double valueTwo) {
        return textService.calculatorPageCalcMul(valueOne, valueTwo);
    }
    @GetMapping(path= "/calculator/divide")
    public double calculatorPageCalcDiv(@RequestParam ("num1") double valueOne, @RequestParam ("num2") double valueTwo) {
        return textService.calculatorPageCalcDiv(valueOne, valueTwo);
    }

}
