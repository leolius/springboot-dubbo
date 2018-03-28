package com.example.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by leolius on 2018-3-23.
 */

@RestController
@RequestMapping(value={"","/","/test"})
public class TestController {
    @RequestMapping(value={"","/","/info"})
    public String getInfo(){
        return "{\"a\":\"123\",\"b\":\"456\",\"c\":\"789\"}";
    }
}
