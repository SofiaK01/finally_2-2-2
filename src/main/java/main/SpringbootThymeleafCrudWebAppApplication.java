package main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties
public class SpringbootThymeleafCrudWebAppApplication {

    public static void main(String[] args) {


        SpringApplication.run(SpringbootThymeleafCrudWebAppApplication.class, args);
    }

}
