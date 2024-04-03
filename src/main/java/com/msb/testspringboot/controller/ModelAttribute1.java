package com.msb.testspringboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/c5")
//@ModelAttribute
//作用1：设置指定方法在控制器其他方法前执行
//位置：方法上方
//
//作用2：从Model模型中获取数据给参数赋值
//位置：方法参数前
public class ModelAttribute1 {
    @ModelAttribute
    public void before() {
        System.out.println("前置方法");
    }

    @RequestMapping("/t1")
    public String t1() {
        System.out.println("t1");
        return "lyl-HQX";
    }

    @ModelAttribute
    public void before(Model model) {
        System.out.println("前置方法");
        model.addAttribute("name", "LYL");
    }

    @RequestMapping("/t2")
    public String t1(@ModelAttribute("name") String name) {
        System.out.println(name);
        return "lyl-HQX";
    }
}
