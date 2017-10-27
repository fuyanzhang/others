package com.yoho.springboot.test.controller;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@EnableAutoConfiguration
@RequestMapping("/class")
public class SampleController {

    protected static Logger logger= LoggerFactory.getLogger(SampleController.class);
    @RequestMapping("/")
    @ResponseBody
    String home() {
        logger.debug("enter home");
        return "Hello World!";
    }

    public static void main(String[] args) {
        SpringApplication.run(SampleController.class, args);
    }
    @RequestMapping("/test/{path}")
    @ResponseBody
    String other(@PathVariable("path") String path){
        logger.debug("enter other");
        return "Hello "+ path;
    }
}
