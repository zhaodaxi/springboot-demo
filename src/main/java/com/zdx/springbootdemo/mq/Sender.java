package com.zdx.springbootdemo.mq;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @author : Joe
 * created : 16:23 2020/3/18
 * description :消息发送者
 */
@Component
@Slf4j
public class Sender {

    @Autowired
    private AmqpTemplate amqpTemplate;

    public void send() {
        String context = "测试";
        log.info("消息发送时间：" + new Date());
        amqpTemplate.convertAndSend("message", context);
    }
}
