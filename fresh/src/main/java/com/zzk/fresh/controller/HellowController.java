package com.zzk.fresh.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HellowController {
    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String string() {
        System.out.println("11111");
        return "hellow";
    }
}
