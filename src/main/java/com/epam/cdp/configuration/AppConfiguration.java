package com.epam.cdp.configuration;

import com.epam.cdp.Repository.StockRepository;
import com.epam.cdp.domain.Kindergarten;
import com.epam.cdp.entity.Stock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import javax.annotation.Resource;
import javax.annotation.Resources;
import java.util.Arrays;

@Configuration
public class AppConfiguration {
    @Autowired
    private StockRepository stockRepository;

    @Autowired
    private Kindergarten kindergarten;

    @Autowired
    private Kindergarten kindergartens;

    @Bean
    CommandLineRunner runner() {
        return args->{
            Arrays.asList("600500,000001,000033,000024".split(","))
                    .forEach(n -> stockRepository.save(new Stock(n)));
            stockRepository.findAll().forEach(System.out::println);
            stockRepository.findByCode("000001").forEach(System.out::println);

            kindergartens.getStudents().forEach(System.out::println);
            System.out.println(kindergarten.getStudent() + " in kindergarten");
        };
    }

    @Bean
    HealthIndicator healthIndicator() {
        return ()-> Health.status("I'm here!").build();
    }

}
