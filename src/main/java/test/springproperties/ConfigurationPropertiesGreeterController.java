package test.springproperties;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigurationPropertiesGreeterController {

    private GreetingProperties greetingProperties;

    public ConfigurationPropertiesGreeterController(GreetingProperties greetingProperties) {
        this.greetingProperties = greetingProperties;
    }

    @GetMapping("/greet")
    public String greet() {
        return greetingProperties.getMessage();
    }

}
