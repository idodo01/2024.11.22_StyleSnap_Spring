package com.ido.stylesnap.controller.rest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//컨트롤러에 rest사용하는 방법
//1. 클래스에 @Controller, 메서드에 @ResponseBody (ex. MyController)
//2. 클래스에 @RestController (ex. ComputerController)

@Controller
@RequestMapping("/rest")
public class MyController {
    @GetMapping("/computer/main")
    public void computer_main(){}

    @GetMapping("/main")
    public void get_main(){}

    @ResponseBody // view를 보여주지 않고 데이터를 응답한다
    @GetMapping("/get")
    public String rest_get(){
        return "This is rest get data";
    }

    @ResponseBody // view를 보여주지 않고 데이터를 응답한다
    @GetMapping("/get2")
    public List<Integer> rest_get2(){
        return List.of(1, 2, 3, 4);
    }

    @ResponseBody
    @GetMapping("/get3")
    public String get3(String s, Integer i){
        System.out.println("s: " + s);
        System.out.println("i: " + i);
        return "잘 받았어요^0^";
    }

    @ResponseBody
    @PostMapping("/post")
    public String post(@RequestBody String s){
        System.out.println("s: " + s);
        return "잘 받았어요^0^";
    }







}
