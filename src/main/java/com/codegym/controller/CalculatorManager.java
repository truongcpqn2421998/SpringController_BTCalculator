package com.codegym.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CalculatorManager {
    public double calculator(double num1,double num2,String calculator){
        switch (calculator){
            case "+":
                return num1+num2;
            case "-":
                return num1-num2;
            case "/":
                return num1/num2;
            case "*":
                return num1*num2;
            default:
                return 0;
        }
    }

    @PostMapping("home")
    public String Manager(@RequestParam double num1, double num2, String math, Model model){
        double result=calculator(num1,num2,math);
        model.addAttribute("result",result);
        return "show";
    }

    @RequestMapping("/home")
    public ModelAndView show(){
        ModelAndView modelAndView=new ModelAndView("show");
        return modelAndView;
    }

}
