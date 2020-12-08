package com.example.demo.controller.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(path = "/demo")
public class DemoController {

    @GetMapping(path = "/getdemo")
    public String getDemo() {
        return "Build Public Project";
    }

}
