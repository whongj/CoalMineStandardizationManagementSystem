package com.tsinghua.mem.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class testCntroller {

    @RequestMapping("/test")
    public String test(){
        return "cities";
    }
}
