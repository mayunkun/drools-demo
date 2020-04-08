package com.aeert.droolsdemo.service;

import com.aeert.droolsdemo.fact.Person;

public interface CheckService {

    /**
     * 是否逃犯
     **/
    public boolean isFugitive(Person person);

    /**
     * 报警
     **/
    public void callPolice(Person person);

}
