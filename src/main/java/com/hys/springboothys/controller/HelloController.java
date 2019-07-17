package com.hys.springboothys.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;




@RestController
@RequestMapping("/hello")
public class HelloController {

    @RequestMapping(method= RequestMethod.GET)
    public String getMethod() {
        return "ge111t";
    }

    @RequestMapping(value="/{id}/{name}", method=RequestMethod.GET)
    public void getMethod(@PathVariable int id, @PathVariable String name) {
        System.out.println("id=" + id + ", name=" + name);
    }

    @RequestMapping(value="/hey", method=RequestMethod.POST)
    public String postMethod2() {
        return "hey post";
    }
}