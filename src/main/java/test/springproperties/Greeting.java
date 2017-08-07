package test.springproperties;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class Greeting implements CommandLineRunner {

    private GreetingProperties greetingProperties;

    public Greeting(GreetingProperties greetingProperties) {
        this.greetingProperties = greetingProperties;
    }


    @Override
    public void run(String... strings) throws Exception {
        log.info(greetingProperties.getMessage());
    }
}
