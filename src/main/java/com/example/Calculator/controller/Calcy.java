package com.example.Calculator.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
// STARTINGPOINT
@RestController
public class Calcy {
    @RequestMapping("/msg")
    public String greet(){
        return "welcome my world...";
    }
    //endpoint using @pathvariable
    @RequestMapping("/add/{a}/{b}")
   public int add(@PathVariable int a , @PathVariable int b){
        int sum=a+b;
        return sum;

    }
    //endpoint using @pathvariable
    @RequestMapping("/sub/{a}/{b}")
    public int sub(@PathVariable int a , @PathVariable int b){
        int sub=a-b;
        return sub;
    }
    //USING @REQUESTPARAM TEST
    @RequestMapping("/message")
    public String message(@RequestParam String msg){
        return "welcome........."+msg;
    }
    // endpoint using @pathvariable
    @RequestMapping("/multi/{a}/{b}")
    public int multi(@PathVariable int a , @PathVariable int b ){
        int multi=a*b;
        return multi;
    }
    //endpoint using @pathvariable
    @RequestMapping("/div/{a}/{b}")
    public float div(@PathVariable int a , @PathVariable int b){
        float div=a/b;
        return div;
    }


}