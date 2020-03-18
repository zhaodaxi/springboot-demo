package com.zdx.springbootdemo.controller;

import com.zdx.springbootdemo.mq.Sender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : Joe
 * created : 16:22 2020/3/18
 * description :
 */
@RestController
public class RabbitMqDemoController {

    @Autowired
    private Sender sender;

    @GetMapping("/test")
    public String test() {
        sender.send();
        return "success";
    }
}
