package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

@SpringBootTest
@ContextConfiguration(locations = {"classpath:integration-context.xml"})
class DemoApplicationTests {

    @Test
    void contextLoads() {
    }

}
