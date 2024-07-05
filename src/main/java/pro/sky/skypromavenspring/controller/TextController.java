package pro.sky.skypromavenspring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.skypromavenspring.services.TextServiceInterface;

@RestController
@RequestMapping("calculator")
public class TextController {
    private final TextServiceInterface textService;

    public TextController(TextServiceInterface textService) {
        this.textService = textService;
    }

    @GetMapping
    public String calculatorPage() {
        return textService.calculatorPage();
    }

    @RequestMapping(path = "plus")
    public String calculatorPageCalcPlus(@RequestParam(value = "num1", required = false) Integer valueOne,
                                         @RequestParam(value = "num2", required = false) Integer valueTwo) {
        return textService.calculatorPageCalcPlus(valueOne, valueTwo);
    }

    @RequestMapping(path = "minus")
    public String calculatorPageCalcMinus(@RequestParam(value = "num1", required = false) Integer valueOne,
                                          @RequestParam(value = "num2", required = false) Integer valueTwo) {
        return textService.calculatorPageCalcMinus(valueOne, valueTwo);
    }

    @RequestMapping(path = "multiply")
    public String calculatorPageCalcMul(@RequestParam(value = "num1", required = false) Integer valueOne,
                                        @RequestParam(value = "num2", required = false) Integer valueTwo) {
        return textService.calculatorPageCalcMul(valueOne, valueTwo);
    }

    @RequestMapping(path = "divide")
    public String calculatorPageCalcDiv(@RequestParam(value = "num1", required = false) Integer valueOne,
                                        @RequestParam(value = "num2", required = false) Integer valueTwo) {
        return textService.calculatorPageCalcDiv(valueOne, valueTwo);
    }

}
