package com.bingglewcloud.bingglew.common.core.util;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * @ClassName TestJasypt
 * @Description
 * @Author binggleW
 * @Date 2020-05-26 16:23
 * @Version 1.0
 **/
public class TestJasypt {
    public static void main(String[] args) {
        final PasswordEncoder ENCODER = new BCryptPasswordEncoder();
        String password = ENCODER.encode(123456+"");
        System.out.println("棉麻："+password);
    }
}
