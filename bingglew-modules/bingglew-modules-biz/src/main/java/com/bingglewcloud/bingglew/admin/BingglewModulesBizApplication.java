package com.bingglewcloud.bingglew.admin;

import com.bingglewcloud.bingglew.common.security.annotation.EnableBingglewFeignClients;
import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;


@EnableBingglewFeignClients
@SpringCloudApplication
public class BingglewModulesBizApplication {

    public static void main(String[] args) {
        SpringApplication.run(BingglewModulesBizApplication.class, args);
    }

}
