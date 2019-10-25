package com.aboyce002.cryptocurrency;

import com.aboyce002.cryptocurrency.dao.Currency;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class ScheduledTasks {
    private static final Logger log = LoggerFactory.getLogger(CryptocurrencyApplication.class);
    private RestTemplate restTemplate = null;

    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder) {
        return builder.build();
    }

    @Bean
    public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
        this.restTemplate = restTemplate;
        return args -> {
            Currency currency = restTemplate.getForObject("https://api.cryptonator.com/api/ticker/btc-usd", Currency.class);
            printCurrency();
        };
    }

    @Scheduled(fixedRate = 5000)
    private void printCurrency(){
        Currency currency = restTemplate.getForObject("https://api.cryptonator.com/api/ticker/btc-usd", Currency.class);
        log.info(currency.toString());
    }
}
