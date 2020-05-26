package com.bingglewcloud.bingglew.monitor;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableAdminServer
@SpringBootApplication
public class BingglewMonitorApplication {

    public static void main(String[] args) {
        SpringApplication.run(BingglewMonitorApplication.class, args);
    }

}
