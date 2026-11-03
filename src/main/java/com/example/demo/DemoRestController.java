package com.example.demo;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.DataTruncation;

@RestController
public class DemoRestController {
     @GetMapping("/api")
    String helloWorld(){
         return  "hello World";
     }

     @GetMapping("/api/user")
    User showNUmbre(){
         return  new User("Yolbell", 22);
     }
}
