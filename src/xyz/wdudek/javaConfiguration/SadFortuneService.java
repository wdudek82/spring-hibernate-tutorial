package xyz.wdudek.javaConfiguration;

public class SadFortuneService implements FortuneService {

    @Override
    public String getFortune() {
        return "This may not be your best day.";
    }
}
