package com.bridgelabz.helloworld;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloWorldController {

    @PostMapping("/greet")
    public String getMessage(){
        return  "Hello World";
    }
}
