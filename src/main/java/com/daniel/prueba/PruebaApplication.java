package com.daniel.prueba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;


@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class PruebaApplication {

    public static void main(String[] args) {
        SpringApplication.run(PruebaApplication.class, args);
    }

}
