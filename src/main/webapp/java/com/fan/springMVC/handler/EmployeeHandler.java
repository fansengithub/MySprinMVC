package com.fan.springMVC.handler;

import com.fan.springMVC.dao.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
public class EmployeeHandler {

    @Autowired
    private EmployeeDao employeeDao;

    @RequestMapping("/emps")
    public  String  list(Map<String,Object> map){

        map.put("employees",employeeDao.getAll());
        return  "list";
    }
}
