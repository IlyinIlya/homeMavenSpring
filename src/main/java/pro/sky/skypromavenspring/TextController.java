package pro.sky.skypromavenspring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
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

    @GetMapping(path = "/hello")
    public String answerHello(@RequestParam("name") String userName) {
        return textService.answerHello(userName);
    }

    @GetMapping(path = "/calculator")
    public String calculatorPage() {
        return textService.calculatorPage();
    }
    @RequestMapping(path = "/calculator/plus")
    public int calculatorPageCalcPlus(@RequestParam("num1") int valueOne, @RequestParam("num2") int valueTwo) {
        return textService.calculatorPageCalcPlus(valueOne, valueTwo);
    }

    @RequestMapping(path = "/calculator/minus")
    public int calculatorPageCalcMinus(@RequestParam("num1") int valueOne, @RequestParam("num2") int valueTwo) {
        return textService.calculatorPageCalcMinus(valueOne, valueTwo);
    }

    @RequestMapping(path = "/calculator/multiply")
    public int calculatorPageCalcMul(@RequestParam("num1") int valueOne, @RequestParam("num2") int valueTwo) {
        return textService.calculatorPageCalcMul(valueOne, valueTwo);
    }

    @RequestMapping(path = "/calculator/divide")
    public double calculatorPageCalcDiv(@RequestParam("num1") int valueOne, @RequestParam("num2") int valueTwo) {
        return textService.calculatorPageCalcDiv(valueOne, valueTwo);
    }

}
