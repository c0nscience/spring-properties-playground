package test.springproperties;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ValueGreeterTest {

    @Autowired
    private ValueGreeter greeter;

    @Test
    public void shouldGreet() throws Exception {
        greeter.run();
    }

}