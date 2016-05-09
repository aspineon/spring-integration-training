package pl.training.integration.lab02;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    private static final int SLEEP_TIME = 20_000;

    public static void main(String[] args) throws InterruptedException {
        try (ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml", "integration.xml")) {
            Thread.sleep(SLEEP_TIME);
        }
    }

}
