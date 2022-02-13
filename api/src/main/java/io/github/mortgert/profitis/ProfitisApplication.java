package io.github.mortgert.profitis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "io.github.mortgert")
public class ProfitisApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProfitisApplication.class,args);
    }
}
