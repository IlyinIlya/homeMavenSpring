package pro.sky.skypromavenspring;

import org.springframework.stereotype.Service;

@Service
public class TextService implements TextServiceInterface{
    public String hello() {
        return "<b>Привет</b>";
    }

    public String answerHello(String userName) {
        return "<p><b>И тебе привет</b></p> " + userName;
    }
}
