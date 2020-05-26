package com.bingglewcloud.bingglew.codegen;

import com.bingglewcloud.bingglew.common.security.annotation.EnableBingglewFeignClients;
import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;

/**
 * 代码生成模块
 */
@SpringCloudApplication
@EnableBingglewFeignClients
public class BingglewCodegenApplication {

    public static void main(String[] args) {
        SpringApplication.run(BingglewCodegenApplication.class, args);
    }

}
