package com.bingglewcloud.bingglew.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author bingglew
 * 配置中心
 */
@SpringCloudApplication
@EnableConfigServer
public class BingglewConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(BingglewConfigApplication.class, args);
    }

}
