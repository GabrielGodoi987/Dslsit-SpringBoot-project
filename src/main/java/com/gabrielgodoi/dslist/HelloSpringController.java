package com.gabrielgodoi.dslist;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloSpringController {

    @RequestMapping("/")
    public String helloWorld(){
        return "Olá spring";
    }
}
