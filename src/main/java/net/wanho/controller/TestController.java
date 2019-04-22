package net.wanho.controller;

import net.wanho.configraction.TestConfigraction;
import net.wanho.pojo.Person;
import net.wanho.pojo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by DELL on 2019/4/22.
 */
@Controller
public class TestController {

    @Autowired
    private TestConfigraction testConfigraction;


    @Value("${pageSize}")
    private  String pageSize;

    @Autowired
    private Person person;



    @RequestMapping("hello")
    @ResponseBody
    public  String hello(){
        return "hello world";
    }

    @RequestMapping("student")
    @ResponseBody
    public  Student student(){
        return testConfigraction.student();
    }

    @RequestMapping("pageSize")
    @ResponseBody
    public  String pageSize(){
        return pageSize;
    }


    @RequestMapping("person")
    @ResponseBody
    public  Person person(){
        return person;
    }

    @RequestMapping("html")
    public  String html(){

        return  "index";
    }

    @RequestMapping("jsp")
    public  String jsp(){

        return  "index";
    }


}
