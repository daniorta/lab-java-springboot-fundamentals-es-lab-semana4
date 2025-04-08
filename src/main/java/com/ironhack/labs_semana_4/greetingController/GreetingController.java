package com.ironhack.labs_semana_4.greetingController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")//marcamos mi edpoint definido
public class GreetingController {

    @GetMapping
    public String getHello(){
        return "Hello World";
    }

    @GetMapping("/{name}")
    public String getname(@PathVariable String name){
        return name;
    }

    @GetMapping("/add/{num1}/{num2}")
    public int getSuma(@PathVariable int num1, @PathVariable int num2){
        return num1 + num2;
    }

    @GetMapping("/multiply/{num1}/{num2}")
    public double getMultiply(@PathVariable double num1, @PathVariable double num2){
        return num1 * num2;
    }

}
