package xyz.liinns.service.impl;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;
import xyz.liinns.service.ComputeClient;

@Component
public class ComputeClientHystrix implements ComputeClient {
    @Override
    public Integer add(@RequestParam(value = "a") Integer a, @RequestParam(value = "b") Integer b) {
        return -9999;
    }
}
