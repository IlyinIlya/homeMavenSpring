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
}
