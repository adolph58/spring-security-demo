package com.example.security.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by 程江涛 on 2019/4/11.
 */

@Controller
public class IndexController {

    @GetMapping({"/index"})
    public String index() {
        return "index";
    }

}
