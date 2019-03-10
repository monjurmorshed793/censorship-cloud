package org.censorship.censorshipcloud;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {


    @GetMapping("/")
    public String home(){
        return "Hello World from Azure!";
    }


    @GetMapping("/home")
    public String homeAnother(){
        return "Hello World from Azure!";
    }
}
