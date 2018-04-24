package com.fan.springMVC.handler;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.xml.ws.RequestWrapper;

@Controller
public class HelloWorld {

    /**
     *  使用@requestMapping来映射请求的url
     * @return
     */

    @RequestMapping("helloworld")
    public String hello(){
        System.out.println("hello  world!");
        return  "success";
    }
}
