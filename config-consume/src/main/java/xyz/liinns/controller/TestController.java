package xyz.liinns.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description:
 * Created by LiinNs on 2017-2-4 0004.
 * Copyright © 2014-2017 趣医网 www.quyiyuan.com 版权所有
 */
@RefreshScope
@RestController
class TestController {
    @Value("${from}")
    private String from;

    @RequestMapping("/from")
    public String from() {
        return this.from;
    }
}
