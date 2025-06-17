package com.levo.dockerexample;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import com.levo.dockerexample.controller.HelloController;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.hamcrest.Matchers.containsString;

@WebMvcTest(HelloController.class)
public class PlaceHolderForTest {


       @Autowired
   private MockMvc mockMvc;
   @Test
public void testHelloEndpointReturnsExpectedMessage() throws Exception {
   String response = mockMvc.perform(get("/docker-java-app/test"))
       .andExpect(status().isOk())
       .andExpect(content().string(containsString("docker-java-app is up and running")))
       .andReturn()
       .getResponse()
       .getContentAsString();
   // 👇 Print response to console
   System.out.println("Endpoint Response: " + response);
}
}


