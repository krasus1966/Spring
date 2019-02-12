package com.cx.study4;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
/**
 * AOP入门
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class SpringDemo3 {

    @Resource(name="productDao")
    private ProductDao productDao;

    @Test
    public void demo1(){
        productDao.save();
        productDao.find();
        productDao.update();
        productDao.delete();

    }
}
