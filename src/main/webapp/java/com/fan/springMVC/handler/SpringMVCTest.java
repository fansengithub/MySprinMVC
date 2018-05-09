package com.fan.springMVC.handler;

import com.fan.springMVC.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.Writer;
import java.util.Arrays;
import java.util.Date;
import java.util.Map;

//@SessionAttributes(value = {"user"},types = {String.class})
@RequestMapping("/springmvc")
@Controller
public class SpringMVCTest {

    private  static  final String SUCCESS = "success";

    @RequestMapping("/testModelAttribute")
    public String testModelAttribute(User user){

        System.out.println("edit:"+user);
        return SUCCESS;
    }

    /**
     *
     * SessionAttributes 可以通过属性名指定放到会话中的属性《使用value属性值》
     * 还可以通过模型属性的对象类型指定哪些模型属性放到会话中《使用type属性值》
     *
     * 只能放在类上。
     * @param map
     * @return
     */
    @RequestMapping("/testSessionAttributes")
    public String testSessionAttributes(Map<String,Object> map){

        User user =new User("tom","123","wwww","24");
        map.put("user",user);
        map.put("scool","3wwwc");
        return  SUCCESS;
    }

    /**
     *  目标方法可以添加map类型（实际上也可以是model 或者model map类型），
     * @param map
     * @return
     */
    @RequestMapping("/testMap")
    public  String testMap(Map<String,Object> map){
        System.out.println(map.getClass().getName());
        map.put("names", Arrays.asList("12","dfs","ee"));
        return  SUCCESS;
    }

    /**
     * 目标方法的返回值可以是modelandview 类型。
     * 其中可以包含视图和模型信息。
     * springMVC会把ModelAndView的model放入request对象中。
     * @return
     */
    @RequestMapping("/testModelAndView")
    public ModelAndView testModelAndView(){
        String vieName = SUCCESS;
        ModelAndView modelAndView =new ModelAndView(vieName);

//        添加模型数据到ModelAndView中
        modelAndView.addObject("time",new Date());
        return  modelAndView;
    }

    /**
     *    可以使用servelt原生的api作为目标方法的参数！
     * @param request
     * @param response
     * @param out
     * @throws IOException
     */
    @RequestMapping("/testServletAPI")
    public  void  testServletAPI(HttpServletRequest request,
                                 HttpServletResponse response,
                                 Writer out)throws IOException {

        System.out.println(" testServletAPI "+request+" --"+response);
        out.write("hello MVC!");
    }

    /**
     * springMVC会按照请求参数名和pojo属性名进行自动匹配，
     * 自动为对象填充属性值，支持级联属性。
     * @param user
     * @return
     */
    @RequestMapping("/testPOJO")
    public  String testPojo(User user){

        System.out.println("testPojo:"+user);
        return  SUCCESS;
    }

    /**
     *   RequestParam  用来映射请求参数，
     *   value值为请求参数名，
     *   required  该参数是否必须，默认为true
     *   defaulrvalue  为默认值
     * @param un
     * @param age
     * @return
     */
    @RequestMapping(value = "testRequestParam")
    public String testRequestParam(@RequestParam(value = "useranme") String un,
                                   @RequestParam(value = "age",required = false) Integer age){

        System.out.println("testRequestParam,useranme:"+un+",age="+age);
        return  SUCCESS;
    }

    @RequestMapping(value = "/testRest/{id}", method = RequestMethod.PUT)
    public String testRestPut1(@PathVariable Integer id) {
        System.out.println("testRest Put: " + id);
        return SUCCESS;
    }

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
