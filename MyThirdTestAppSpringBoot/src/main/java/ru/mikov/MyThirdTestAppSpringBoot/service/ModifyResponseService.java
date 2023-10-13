package ru.mikov.MyThirdTestAppSpringBoot.service;

import ru.mikov.MyThirdTestAppSpringBoot.model.Response;
import org.springframework.stereotype.Service;

@Service
public interface ModifyResponseService {
    Response modify(Response response);
}