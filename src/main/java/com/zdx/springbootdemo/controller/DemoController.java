package com.zdx.springbootdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author : Joe
 * Created : 16:59 2019/11/8
 * Description :
 */
@Controller
public class DemoController {

    /**
     * 测试返回字符串
     * @return
     */
    @RequestMapping("/index")
    @ResponseBody
    public String index(){
        return "Hello World";
    }

    /**
     * 加入视图解析，测试返回HTML页面
     * @return
     */
    @RequestMapping("/test")
    public String test(){
        return "test";
    }
}
