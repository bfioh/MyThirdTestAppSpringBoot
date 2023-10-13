package ru.mikov.MyThirdTestAppSpringBoot.service;

import ru.mikov.MyThirdTestAppSpringBoot.exception.UnsupportedCodeException;
import ru.mikov.MyThirdTestAppSpringBoot.exception.ValidationFailedException;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;

@Service
public interface ValidationService {
    void isValid(BindingResult bindingResult) throws ValidationFailedException, UnsupportedCodeException;
}