package test.springproperties;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(controllers = ValueGreeterController.class)
public class ValueGreeterControllerTest {

    @Autowired
    private MockMvc mvc;

    @Value("${greeting.message}")
    private String message;

    @Test
    public void shouldGreet() throws Exception {
        mvc.perform(get("/greet"))
                .andExpect(status().isOk())
                .andDo(print())
                .andExpect(content().string(message));
    }
}