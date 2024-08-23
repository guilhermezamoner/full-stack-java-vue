package br.com.guilhermez.fullstackjava;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.junit.jupiter.api.Assertions.assertEquals;

@WebMvcTest(MessageController.class)
class MessageControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void shouldReturnMessageFromSpringBootBackend() throws Exception {
        String expected = "Message from Spring Boot Backend!";

        MvcResult result = mockMvc.perform(MockMvcRequestBuilders.get("/api/messages/hello"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andReturn();

        String actual = result.getResponse().getContentAsString();

        assertEquals(expected, actual);
    }

}