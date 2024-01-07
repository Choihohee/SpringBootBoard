package com.SpringbootBoard.sbb;

import org.springframework.web.bind.annotation.ResponseBody;

public class HelloController {
    @ResponseBody
    public String hello(){
        return "Hello World";
    }
}
