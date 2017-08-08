package test.springproperties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ValueGreeterController {

    private String message;

    public ValueGreeterController(@Value("${greeting.message}") String message) {
        this.message = message;
    }

    @GetMapping("/greet")
    public String greet() {
        return message;
    }

}
