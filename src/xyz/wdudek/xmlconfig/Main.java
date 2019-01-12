package xyz.wdudek.xmlconfig;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        CricketCoatch cricketCoatch = context.getBean("myCricketCoatch", CricketCoatch.class);

        System.out.println(cricketCoatch.getDailyWorkout());
        System.out.println(cricketCoatch.getEmailAddress());
        System.out.println(cricketCoatch.getTeam());
        System.out.println("=======================");
        System.out.println(cricketCoatch.getDailyFortune());

        context.close();
    }
}
