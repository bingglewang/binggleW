package com.bingglewcloud.bingglew.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.SpringCloudApplication;

/**
 * @author bingglew
 * 网关应用
 */
@SpringCloudApplication
public class BingglewGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(BingglewGatewayApplication.class, args);
    }

}
