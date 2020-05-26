package com.bingglewcloud.bingglew.common.core.util;

import com.ulisesbocchio.jasyptspringboot.encryptor.DefaultLazyEncryptor;
import org.jasypt.encryption.StringEncryptor;
import org.springframework.core.env.StandardEnvironment;

/**
 * @ClassName TestJasypt
 * @Description
 * @Author binggleW
 * @Date 2020-05-26 16:23
 * @Version 1.0
 **/
public class TestJasypt {
    public static void main(String[] args) {
        //对应配置文件中对应的根密码
        System.setProperty("jasypt.encryptor.password", "bingglew");
        StringEncryptor stringEncryptor = new DefaultLazyEncryptor(new StandardEnvironment());
        //加密方法
        System.out.println(stringEncryptor.encrypt("bingglew"));
        //解密方法
        System.out.println(stringEncryptor.decrypt(stringEncryptor.encrypt("bingglew")));
        //imENTO7M8bLO38LFSIxnzw==
        System.out.println(stringEncryptor.decrypt("KX34gPBBOaHwpxSXU0+KvA=="));

    }
}
