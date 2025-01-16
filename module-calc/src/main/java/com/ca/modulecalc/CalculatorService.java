package com.ca.modulecalc;

import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.math.RoundingMode;

@Service
public class CalculatorService {

    public BigDecimal addition(BigDecimal a, BigDecimal b) {
        return a.add(b);
    }

    public BigDecimal division(BigDecimal a, BigDecimal b) {
        return a.divide(b, RoundingMode.HALF_UP);
    }

    public BigDecimal multiplication(BigDecimal a, BigDecimal b) {
        return a.multiply(b);
    }

    public BigDecimal subtraction(BigDecimal a, BigDecimal b) {
        return a.subtract(b);
    }

}
