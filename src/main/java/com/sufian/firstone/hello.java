package com.sufian.firstone;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class hello {

    @RequestMapping("/hi")
    public String hi(){
        return "Hello World";
    }
}
