package com.ido.stylesnap.controller.style;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/style")
public class MainController {

    @GetMapping("/makeStyle/main")
    public void makeStyle_main() {}

}