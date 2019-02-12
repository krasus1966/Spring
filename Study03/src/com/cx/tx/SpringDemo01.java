package com.cx.tx;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:tx.xml")
public class SpringDemo01 {

    @Resource(name = "accountService")
    private AccountService accountService;

    @Test
    public void demo1(){
        accountService.transfer("王宝强","lihu",100d);
    }
}
