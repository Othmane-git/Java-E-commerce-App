package com.othmane.Ecom_project.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ProductController {

    @RequestMapping
    public String greet(){
        return "Hello world!";
    }
}
