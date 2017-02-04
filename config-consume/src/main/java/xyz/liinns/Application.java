package xyz.liinns;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

/**
 * Description:
 * Created by LiinNs on 2017-2-4 0004.
 * Copyright © 2014-2017 趣医网 www.quyiyuan.com 版权所有
 */
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        new SpringApplicationBuilder(Application.class).web(true).run(args);
    }
}
