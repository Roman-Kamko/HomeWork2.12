package edu.skypro.homework.service.impl;

import edu.skypro.homework.service.CalcService;
import org.springframework.stereotype.Service;

@Service
public class CalcServiceImpl implements CalcService {
    @Override
    public int plus(Integer num1, Integer num2) {
        return num1 + num2;
    }

    @Override
    public int minus(Integer num1, Integer num2) {
        return num1 - num2;
    }

    @Override
    public int multiply(Integer num1, Integer num2) {
        return num1 * num2;
    }

    @Override
    public double divide(Integer num1, Integer num2) {
        return num1.doubleValue() / num2.doubleValue();
    }
}
