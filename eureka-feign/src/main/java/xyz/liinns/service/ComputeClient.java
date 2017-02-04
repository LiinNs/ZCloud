package xyz.liinns.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import xyz.liinns.service.impl.ComputeClientHystrix;

/**
 * Description:
 * Created by LiinNs on 2017-2-3 0003.
 * Copyright © 2014-2017 趣医网 www.quyiyuan.com 版权所有
 */
@FeignClient(name = "COMPUTE-SERVICE", fallback = ComputeClientHystrix.class)
public interface ComputeClient {
    @RequestMapping(method = RequestMethod.GET, value = "/add")
    Integer add(@RequestParam(value = "a") Integer a, @RequestParam(value = "b") Integer b);
}