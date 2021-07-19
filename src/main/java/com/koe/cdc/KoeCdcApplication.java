package com.koe.cdc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.oas.annotations.EnableOpenApi;

@EnableOpenApi
@SpringBootApplication
public class KoeCdcApplication {

    public static void main(String[] args) {
        SpringApplication.run(KoeCdcApplication.class, args);
    }

}
