package eu.arima.springbootjibdocker;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * HelloController
 */
@Controller
public class HelloController {

    @ResponseBody
    @GetMapping("/")
    public String sayHello() {
        return "Hello Jib";
    }
    
}