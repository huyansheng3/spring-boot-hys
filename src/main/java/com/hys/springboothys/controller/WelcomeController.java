package com.hys.springboothys.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hys.springboothys.model.Hoge;

@Controller
@RequestMapping("/welcome")
public class WelcomeController {

    @RequestMapping("")
    String index(Model model){

        Hoge hoge = new Hoge();
        hoge.id = 10;
        hoge.value = "hoge";

        model.addAttribute("myData", hoge);

        return "welcome";
    }
}
