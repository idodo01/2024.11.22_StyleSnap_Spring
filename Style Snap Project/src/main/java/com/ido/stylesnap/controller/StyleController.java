package com.ido.stylesnap.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/style")
public class StyleController {

    @GetMapping("/makestyle")
    public void make_Style(){}

}