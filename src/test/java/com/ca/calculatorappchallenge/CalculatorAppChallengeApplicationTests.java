package com.ca.calculatorappchallenge;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;

@SpringBootTest
@AutoConfigureMockMvc
class CalculatorAppChallengeApplicationTests {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void getSum() throws Exception {
        String bdFirst = "5";
        String bdSecond = "10";
        String bdExpected = "15";

        mockMvc.perform(get("/sum").
                        param("a", bdFirst).
                        param("b", bdSecond)).
                andExpect(status().isOk()).
                andExpect(jsonPath("$.Sum").value(bdExpected));
    }

    @Test
    void getMultiplication() throws Exception {
        String bdFirst = "5";
        String bdSecond = "10";
        String bdExpected = "50";

        mockMvc.perform(get("/multiply").
                        param("a", bdFirst).
                        param("b", bdSecond)).
                andExpect(status().isOk()).
                andExpect(jsonPath("$.Multiplication").value(bdExpected));
    }

    @Test
    void getDivision() throws Exception {
        String bdFirst = "20";
        String bdSecond = "2";
        String bdExpected = "10";
        mockMvc.perform(get("/divide").
                        param("a", bdFirst).
                        param("b", bdSecond)).
                andExpect(status().isOk()).
                andExpect(jsonPath("$.Division").value(bdExpected));
    }

    @Test
    void getSubtraction() throws Exception {
        String bdFirst = "5";
        String bdSecond = "10";
        String bdExpected = "-5";
        mockMvc.perform(get("/subtract").
                        param("a", bdFirst).
                        param("b", bdSecond)).
                andExpect(status().isOk()).
                andExpect(jsonPath("$.Subraction").value(bdExpected));
    }


}
