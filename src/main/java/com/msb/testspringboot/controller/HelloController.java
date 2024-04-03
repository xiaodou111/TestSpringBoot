package com.msb.testspringboot.controller;

import com.msb.testspringboot.demos.web.User;
import org.springframework.web.bind.annotation.*;

@RestController
//    http://localhost:9999/hello
public class HelloController {

//    @RequestMapping：作用：给控制器方法设置请求路径
//    位置：方法或类上方。用于类上，表示类中的所有控制器方法都是以该地址作为父路径。
//    属性：
//
//    value/path:请求路径
//    method:指定请求方式
//    params:规定必须发送的请求参数
//    headers:规定请求必须包含的请求头
    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String hello(){
        return "hello world22";
    }
//    http://localhost:9999/hello4?name=xiaodou
    @RequestMapping(value = "/hello4",method = RequestMethod.GET)
    public String hello1(String name){
        System.out.println(name);
        return "hello "+name;
    }
//    http://localhost:9999/getTest?nickname=gege
//    http://localhost:9999/getTest  有required = false不报错,没有的话报错
    @RequestMapping(value = "/getTest",method = RequestMethod.GET)
    public String getTest(@RequestParam(value = "nickname",required = false) String name){
//        参数名不一致@RequestParam用nickname映射name
        System.out.println("nickname:"+name);
        return "hello:"+name;
    }
    //http://localhost:8080/c3/annotation1?username=10
    //http://localhost:9999/annotation1?age=10&username=xiaodu  params = {"age"} 必须传入age参数
    @RequestMapping(path = "/annotation1",method = {RequestMethod.GET,RequestMethod.POST},params = {"age"},headers = {"User-agent"})
    public String annotation1(String username){
        System.out.println("annotation1\t"+username);
        return "lyl-HQX";
    }
//    http://localhost:9999/postTest
    @RequestMapping(value = "/postTest",method = RequestMethod.POST)
    public  String postTest(){
        System.out.println("接收到Post请求");
        return "Post请求";
    }

    @RequestMapping(value = "/postTest2",method = RequestMethod.POST)
    public  String postTest2(String username,String password){
        System.out.println("username:"+username);
        System.out.println("password:"+password);
        System.out.println("接收到Post2请求");
        return "Post2请求";
    }
    @RequestMapping(value = "/postTest3",method = RequestMethod.POST)
    public  String postTest3(User user){
        System.out.println("user:"+user);
        System.out.println("user:"+user.getName());
        System.out.println("user:"+user.getAge());
        System.out.println("接收到Post3请求");
        return "Post3请求";
    }
}
