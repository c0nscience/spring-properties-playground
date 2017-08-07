package test.springproperties;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * author: ber.bherzig@gmail.com
 * date: 07.08.17 - 23:19
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class GreetingTest {

    @Autowired
    private Greeting greeting;

    @Test
    public void shouldGreet() throws Exception {
        greeting.run();
    }
}