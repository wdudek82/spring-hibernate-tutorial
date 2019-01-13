package xyz.wdudek.javaConfiguration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:sport.properties")
public class SportConfig {

    @Bean
    public FortuneService happyFortuneService() {
        return new HappyFortuneService();
    }

    @Bean
    FortuneService sadFortuneService() {
        return new SadFortuneService();
    }

    @Bean
    public Coach tennisCoach() {
        return new TennisCoach(sadFortuneService());
    }

    @Bean
    public Coach swimCoach() {
        return new SwimCoach(happyFortuneService());
    }
}
