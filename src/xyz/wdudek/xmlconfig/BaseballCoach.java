package xyz.wdudek.xmlconfig;

public class BaseballCoach implements Coach {

    private FortuneService fortuneService;

    public BaseballCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Swing a bat 30 times.";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
