package com.azurewebsites.ABOM_DEMO;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class index {
	/**
     * Portal 入口路徑.
     * 
     * @return Page Name
     */
    @RequestMapping("/")
    public String index() {
		return "L15";
    }
}
