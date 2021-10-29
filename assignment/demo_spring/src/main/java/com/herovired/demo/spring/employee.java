package com.herovired.demo.spring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class employee {
@GetMapping("/hello")
    public String HelloWorld(){
        return "mayank";
    }

    @GetMapping("/hello/{name}")
    public String OneParameter(@PathVariable("name") String name){
    return "Welcome "+name;
    }

    @GetMapping("/hello/{name}/{city}")
    public String TwoParameter(@PathVariable("name") String name , @PathVariable("city") String city){
        return "Hello Welcome "+name +" and your "+city;
    }
}
