package com.aeert.droolsdemo.service.Impl;

import com.aeert.droolsdemo.fact.Person;
import com.aeert.droolsdemo.service.CheckService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class CheckServiceImpl implements CheckService {

    @Override
    public boolean isFugitive(Person person) {
        return "刀疤哥".equals(person.getName());
    }

}
