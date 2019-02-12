package com.cx.study3;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/*
使用JDK动态代理对UserDao产生代理
 */
public class JdkProxy implements InvocationHandler {
    //将被增强的对象传递到代理中
    private UserDao userDao;
    public JdkProxy(UserDao userDao){
        this.userDao =userDao;
    }
    /*
    产生UserDao代理的方法
     */
    public UserDao createProxy(){
        UserDao userDaoProxy= (UserDao) Proxy.newProxyInstance(userDao.getClass().getClassLoader(),userDao.getClass().getInterfaces(),this);
        return userDaoProxy;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //判断方法名是不是save
        if("save".equals(method.getName())){
            //增强
            System.out.println("权限校验++++++++");
            return method.invoke(userDao,args);
        }
        return method.invoke(userDao,args);
    }
}
