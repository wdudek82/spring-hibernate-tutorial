package xyz.wdudek.javaConfiguration;

public class TennisCoach implements Coach {

    private FortuneService fortuneService;

    public TennisCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Practice diligently every day.";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
