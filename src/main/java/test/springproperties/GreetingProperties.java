package test.springproperties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@Component
@ConfigurationProperties("greeting")
@Getter
@Setter
public class GreetingProperties {
    private String message;
}
