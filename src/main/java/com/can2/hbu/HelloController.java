package com.can2.hbu;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController // meaning it is ready for use by Spring MVC to handle web request
public class HelloController {
    @RequestMapping("/")
    //When invoked from a browser or by using curl on the command line, the method returns pure text.
    public String index() {
        return "Greetings from Spring Boot!";
    }
}
