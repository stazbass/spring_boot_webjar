package com.baeldung.webjar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;

@Controller
public class TestController {

    @GetMapping(value = "/")
    public String welcome(Model model) {
        return "index";
    }
    @GetMapping(value = "/webjars/swagger-ui/3.19.0/index.html")
    public ResponseEntity<String> inda(Model model, ResourceHandlerRegistry resourceHandlerRegistry) {
        return ResponseEntity.ok("INDA");
    }
}
