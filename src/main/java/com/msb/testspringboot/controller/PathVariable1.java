package com.msb.testspringboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

//@PathVariable
//作用：在RESTful风格的URL中获取占位符的值
//位置：方法参数前
//属性：
//value：获取哪个占位符的值作为参数值，如果占位符和参数名相同，可以省略该属性。
@Controller
@RequestMapping("/student")
public class PathVariable1 {
    @RequestMapping("/t1")
    public String deleteStudent(@PathVariable("id") int id, HttpServletRequest request){
        System.out.println("删除id为"+id+"的学生");
        String str = "删除id为"+id+"的学生";
        request.setAttribute("delete",str);
        return "student";
    }
}
