package com.pvsoul.datacollection.iotdareceiver;

import org.glassfish.jersey.server.ResourceConfig;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@MapperScan("com.pvsoul.datacollection.iotdareceiver.mapper")
public class IotdaReceiverApplication {

    public static void main(String[] args) {
        SpringApplication.run(IotdaReceiverApplication.class, args);
    }

    @Bean
    public ResourceConfig resourceConfig() {
        return new ResourceConfig();
    }
}
