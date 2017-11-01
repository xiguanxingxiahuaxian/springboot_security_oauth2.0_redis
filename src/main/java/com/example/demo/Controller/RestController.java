package com.example.demo.Controller;

import org.springframework.web.bind.annotation.RequestMapping;


@org.springframework.web.bind.annotation.RestController
public class RestController {

	@RequestMapping("/d")
    public String index(){
        return "Hello private!";
    }
	
}
