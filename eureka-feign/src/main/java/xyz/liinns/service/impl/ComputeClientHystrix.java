package xyz.liinns.service.impl;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;
import xyz.liinns.service.ComputeClient;

/**
 * Description:
 * Created by LiinNs on 2017-2-4 0004.
 * Copyright © 2014-2017 趣医网 www.quyiyuan.com 版权所有
 */
@Component
public class ComputeClientHystrix implements ComputeClient {
    @Override
    public Integer add(@RequestParam(value = "a") Integer a, @RequestParam(value = "b") Integer b) {
        return -9999;
    }
}
