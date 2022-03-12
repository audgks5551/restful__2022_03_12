package com.example.restfulwebservice.helloworld;

import com.example.restfulwebservice.user.User;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloWorldController {
    // GET
    // /hello-world (endpoint)
    @GetMapping(path ="/hello-world")
    public String helloWorld() {
        return "Hello World";
    }

    @GetMapping(path ="/hello-world-bean")
    public HelloWorldBean helloWorldBean() {
        return new HelloWorldBean("Hello World");
    }

    @GetMapping(path ="/hello-world-bean/path-variable/{name}")
    public HelloWorldBean helloWorldBeanPathVariable(@PathVariable String name) {
        return new HelloWorldBean(String.format("Hello World, %s", name));
    }
}
