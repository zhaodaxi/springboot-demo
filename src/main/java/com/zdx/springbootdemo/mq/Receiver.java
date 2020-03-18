package com.zdx.springbootdemo.mq;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @author : Joe
 * created : 16:28 2020/3/18
 * description :
 */
@Component
@Slf4j
@RabbitListener(queues = "message")
public class Receiver {

    @RabbitHandler
    public void process(String string) {
        log.info("接收消息:"+string);
        log.info("消息接收时间:" + new Date());
    }
}
