package xyz.wdudek.xmlconfig;

import org.springframework.stereotype.Component;

@Component
public class RandomFortune implements FortuneService {

    private String[] fortunes = {
            "Today is your lucky day!",
            "This day is in your hands.",
            "It may not be your best day."
    };

    @Override
    public String getFortune() {
        int index = (int) Math.round(Math.random() * 2);
        return fortunes[index];
    }
}
