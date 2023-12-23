package ua.edu.ucu.apps.flowerstore;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FlowerStoreConfiguration {
    @Bean
    public String getData(){
        return "bla bla";
    }
}
