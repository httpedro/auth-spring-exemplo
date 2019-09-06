package com.example.autenticacao;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@ResponseBody
public class Controlador{

    @RequestMapping("/")
    public ModelAndView index(){
        return new ModelAndView("index");
    }

    @RequestMapping("/hello")
    public ModelAndView hello(){
        return new ModelAndView("hello");
    }
}