package xyz.wdudek.annotations;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
public class RandomFortuneService implements FortuneService {

    private List<String> fortunes = new ArrayList<>();

    private Random random = new Random();

    @PostConstruct
    private void getFortunesFromTextFile() {
        try {
            File file = new File("src/fortunes.txt");
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));

            String fortune;
            while ((fortune = bufferedReader.readLine()) != null) {
                fortunes.add(fortune);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public String getFortune() {
        int index = random.nextInt(fortunes.size());
        return fortunes.get(index);
    }
}
