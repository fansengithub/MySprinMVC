package com.fan.springMVC.handler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RequestMapping("/springmvc")
@Controller
public class SpringMVCTest {

    private  static  final String SUCCESS = "success";

    /**
     * rest风格的 url
     * 以CRUD为例
     * 新增： /order/1 post
     * 修改： /order/1 put
     * 获取： /order/1 get
     * 删除： /order/1 delete
     *
     * 如何发送put和delete请求？
     * 1 配置 HiddenHttpMethodFilter
     * 2 发送post请求
     * 3 发送post请求时，携带一个name="_method" 隐藏域，值为delete或put
     *
     * 在springmvc的目标方法中通过  PathVariable 注解获取  id
     *
     * @param id
     * @return
     */

    @RequestMapping(value = "/testRest/{id}", method = RequestMethod.PUT)
    public String testRestPut(@PathVariable Integer id) {
        System.out.println("testRest Put: " + id);
        return SUCCESS;
    }

    @RequestMapping(value = "/testRest/{id}", method = RequestMethod.DELETE)
    public String testRestDelete(@PathVariable Integer id) {
        System.out.println("testRest Delete: " + id);
        return SUCCESS;
    }


//    @RequestMapping(value = "/testRest/{id}",method = RequestMethod.PUT)
//    public String testRestPut(@PathVariable Integer id){
//
//        System.out.println("testRest  put id:"+id);
//        return  SUCCESS;
//    }
//
//
//    @RequestMapping(value = "/testRest/{id}",method = RequestMethod.DELETE)
//    public String testRestDelete(@PathVariable Integer id){
//
//        System.out.println("testRestDelete id:"+id);
//        return  SUCCESS;
//    }


    @RequestMapping(value = "/testRest",method = RequestMethod.POST)
    public String testRest(){

        System.out.println("testRest post:");
        return  SUCCESS;
    }





    @RequestMapping(value = "/testRest/{id}",method = RequestMethod.GET)
    public String testRest(@PathVariable Integer id){

        System.out.println("testRest get:"+id);
        return  SUCCESS;
    }




    /**  PathVariable 可以映射url到目标方法的参数中
     *
     * @param id
     * @return
     */
    @RequestMapping("/testPathVariable/{id}")
    public  String testPathVariable(@PathVariable("id") Integer id){

        System.out.println("testPathVariable"+id);
        return  SUCCESS;
    }

    /**
     * 了解： 使用param headers
     * @return
     */
    @RequestMapping(value = "testParamsAndHeaders", params = { "username",
            "age!=10" }, headers = { "zh-CN,zh;q=0.9,en;q=0.8" })
    public String testParamsAndHeaders() {
        System.out.println("testParamsAndHeaders");
        return SUCCESS;
    }
    /**
     *  使用method属性指定请求方式
     * @return
     */
    @RequestMapping(value = "/testMethod",method = RequestMethod.POST)
    public String testMethod(){
        System.out.println("testMethod");
        return  SUCCESS;
    }

    /**
     * 1 RequestMapping,用来修饰方法，还可以用来修饰类
     * 2 类定义出，相对于web应用的跟目录
     * @return
     */
    @RequestMapping("/testRequestMapping")
    public String testRequestMapping(){

        System.out.println("testRequestMapping");
        return  SUCCESS;
    }
}
