package xyz.liinns.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import xyz.liinns.service.ComputeService;

/**
 * Description:
 * Created by LiinNs on 2017-2-3 0003.
 * Copyright © 2014-2017 趣医网 www.quyiyuan.com 版权所有
 */
@RestController
public class ConsumerController {

    @Autowired
    private ComputeService computeService;

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String add() {
        return computeService.addService();
    }

}
