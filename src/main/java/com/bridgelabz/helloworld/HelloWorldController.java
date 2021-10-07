package com.bridgelabz.helloworld;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloWorldController {

    @PostMapping("/greet")
    public String getMessage(){
        return  "Hello World";
    }

    @RequestMapping(value = {"/", "/hello", "message"})
    public String getHelloMessage(){
        return "Hello BridgeLabz";
    }

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String test1(@RequestParam String fname, @RequestParam String lname){
        return "Hello : " + fname + " " + lname;
    }

    @RequestMapping(value = "/test2/{name}", method = RequestMethod.GET)
    public String test2(@PathVariable String name){
        return "Hello : " + name ;
    }

    @RequestMapping(value = "/test3/{name}", method = RequestMethod.GET)
    public String test3(@PathVariable String name, @RequestParam String fname, @RequestParam String lname){
        return "Hello : " + name  + fname + " " + lname;
    }

}
