package com.example.security.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/book")
public class BookController {

    @PreAuthorize("hasAuthority('ROLE_USER')")
    @GetMapping("/list")
    public String list() {
        return "book/list";
    }

    @PreAuthorize("hasAuthority('ROLE_ADMIN')")
    @GetMapping("/add")
    public String add() {
        return "book/add";
    }

    @PreAuthorize("hasAuthority('ROLE_ADMIN')")
    @GetMapping("/detail")
    public String detail() {
        return "book/detail";
    }
}
