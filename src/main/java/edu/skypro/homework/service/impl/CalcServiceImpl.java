package edu.skypro.homework.service.impl;

import edu.skypro.homework.service.CalcService;
import edu.skypro.homework.service.ValidatorService;
import org.springframework.stereotype.Service;

@Service
public class CalcServiceImpl implements CalcService {
    private final ValidatorService validator;

    public CalcServiceImpl(ValidatorService validator) {
        this.validator = validator;
    }

    @Override
    public int plus(Integer num1, Integer num2) {
        return validator.checkByNull(num1) +
                validator.checkByNull(num2);
    }

    @Override
    public int minus(Integer num1, Integer num2) {
        return validator.checkByNull(num1) -
                validator.checkByNull(num2);
    }

    @Override
    public int multiply(Integer num1, Integer num2) {
        return validator.checkByNull(num1) *
                validator.checkByNull(num2);
    }

    @Override
    public double divide(Integer num1, Integer num2) {
        return validator.checkByNull(num1) /
                (double) validator.checkByZero(validator.checkByNull(num2));
    }
}
