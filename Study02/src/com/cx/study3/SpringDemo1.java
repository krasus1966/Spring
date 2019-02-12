package com.cx.study3;

import org.junit.Test;

public class SpringDemo1 {
    @Test
    public void demo1(){
        UserDao userDao = new UserDaoImpl();
        //创建代理
        UserDao proxy = new JdkProxy(userDao).createProxy();
        proxy.save();
        proxy.update();
        proxy.find();
        proxy.delete();

    }
}
