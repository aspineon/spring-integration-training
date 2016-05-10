package pl.training.integration.lab03;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    private static final int SLEEP_TIME = 20_000;
    private static final long REQUEST_ID = 1;

    public static void main(String[] args) throws InterruptedException {
        try (ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml", "integration.xml")) {
            NbpGateway nbp = applicationContext.getBean(NbpGateway.class);
            ExchangeRates exchangeRates = nbp.refreshExchangeRates(REQUEST_ID);
            System.out.println("#### " + exchangeRates);
            Thread.sleep(SLEEP_TIME);
        }
    }

}
