package com.cx.study;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
Spring入门
 */
public class SpringDemo1 {
    @Test
    public void demo1() {
        UserDao userservice = new UserDaoImpl();
        ((UserDaoImpl) userservice).setName("nidaye");
        userservice.save();
    }

    @Test
    /*
    Spring方式的调用
     */
    public void demo2() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao userDao = (UserDao) applicationContext.getBean("userDao");
        userDao.save();
    }

    @Test
    /*
        构造方法属性注入
     */
    public void demo3(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Car car = (Car) applicationContext.getBean("car");
        System.out.println(car);
    }
    /*
        set方法方式注入
     */
    @Test
    public void demo4(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Car2 car2 = (Car2) applicationContext.getBean("car2");
        System.out.println(car2);
    }
    @Test
    public void demo5(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Employee employee = (Employee) applicationContext.getBean("employee");
        System.out.println(employee);
    }
    @Test
    public void demo6(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Collection collection = (Collection) applicationContext.getBean("collection");
        System.out.println(collection);
    }
}
