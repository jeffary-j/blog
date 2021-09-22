package com.cos.blog.blog.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * BlogControllerTest
 */
@RestController
public class BlogControllerTest {
    
    @GetMapping("/test/hello")
    public String hello() {
        return "<h1>Hello Spring Boot</h1>";
    }
}
