package com.work.refactor.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Gateway
 *
 * @author zhoug
 * @date 2024/12/11 00:11
 */


@EnableDiscoveryClient
@SpringBootApplication
public class Gateway {
    public static void main(String[] args) {
        SpringApplication.run(Gateway.class, args);
    }
}
