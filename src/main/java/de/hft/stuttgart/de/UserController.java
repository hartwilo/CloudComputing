package de.hft.stuttgart.de;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @RequestMapping(value="", method = RequestMethod.GET)
    public String helloWorld(){
        return "Hello World!";
    }

//Comment for Demo

    
}
