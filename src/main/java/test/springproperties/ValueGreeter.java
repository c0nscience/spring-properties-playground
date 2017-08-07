package test.springproperties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class ValueGreeter implements CommandLineRunner {

    private String greeting;

    public ValueGreeter(@Value("${greeting.message}") String greeting) {
        this.greeting = greeting;
    }


    @Override
    public void run(String... strings) throws Exception {
        log.info(greeting);
    }
}
