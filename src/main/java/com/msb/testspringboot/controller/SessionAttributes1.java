package com.msb.testspringboot.controller;

import jdk.nashorn.internal.ir.ReturnNode;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;

import javax.servlet.http.HttpSession;
@Controller
@SessionAttributes("name")
//@SessionAttributes
//作用：将Model模型中的数据存到session域中
//位置：类上方
public class SessionAttributes1 {
    @RequestMapping("/t1")
    public String t1(Model model){
        // model1中保存name数据
        model.addAttribute("name","LYL");
        return "lyl-HQX";
    }
    @RequestMapping("/t2")
    public String t2(HttpSession hs){
        System.out.println(hs.getAttribute("name"));
        return "SessionAttribute";
    }
}
