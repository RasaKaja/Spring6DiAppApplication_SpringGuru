package iAmDew.spring6DiApp.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    public String sayHello() {
        System.out.println("I'm in the Controller");
        return "Hello Everyone";
    }
}
