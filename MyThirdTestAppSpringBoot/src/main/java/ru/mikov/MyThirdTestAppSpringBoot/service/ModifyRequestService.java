package ru.mikov.MyThirdTestAppSpringBoot.service;

import org.springframework.stereotype.Service;
import ru.mikov.MyThirdTestAppSpringBoot.model.Request;

@Service
public interface ModifyRequestService {
    void modify(Request request);
}