package io.github.mortgert.profitis.configs;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan("io.github.mortgert")
@Import({AOPConfig.class,WebConfig.class})
public class AppConfig {

}
