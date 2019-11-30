package com.imooc.demo.controller;
import com.imooc.demo.enety.user;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import java.util.Date;

@RestController
class HelloWorldController
{
    @RequestMapping(value = "/hello")
    public user hello(String name)
    {
        user u = new user();
        u.setDate(new Date());
        u.setPassword("1232");
        u.setUsername("范一");
        return u;
    }
}