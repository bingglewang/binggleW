package com.bingglewcloud.bingglew.auth;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author bingglew
 * 认证授权中心
 */
@SpringCloudApplication
@EnableFeignClients
public class BingglewAuthApplication {

    public static void main(String[] args) {
        SpringApplication.run(BingglewAuthApplication.class, args);
    }

}
