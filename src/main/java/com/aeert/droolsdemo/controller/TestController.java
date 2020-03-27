package com.aeert.droolsdemo.controller;

import com.aeert.SessionFactory;
import com.aeert.droolsdemo.fact.Person;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api("规则引擎测试")
@RestController
@RequestMapping("/api")
public class TestController {

    @Autowired
    private SessionFactory sessionFactory;

    @PostMapping("loan")
    @ApiOperation("年龄")
    public void loan(@RequestBody Person person) {
        KieSession ksession = sessionFactory.getSession("rulesAge");
        ksession.insert(person);
        ksession.fireAllRules(1);
    }
}
