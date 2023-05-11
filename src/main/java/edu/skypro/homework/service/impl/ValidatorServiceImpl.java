package edu.skypro.homework.service.impl;

import edu.skypro.homework.exception.NoArgumentSpecifiedException;
import edu.skypro.homework.service.ValidatorService;
import org.springframework.stereotype.Service;

@Service
public class ValidatorServiceImpl implements ValidatorService {
    @Override
    public int checkByNull(Integer num) {
        if (num == null) {
            throw new NoArgumentSpecifiedException();
        }
        return num;
    }

    @Override
    public int checkByZero(Integer num) {
        if (num == 0) {
            throw new IllegalArgumentException();
        }
        return num;
    }
}
