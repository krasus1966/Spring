package com.cx.study2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

/*
    用户Dao的实现类
 */
@Repository("userDao1")//相当于<bean id="userDao" class="com.cx.UserDaoImpl">
public class UserDaoImpl implements UserDao{
    @Value("wang")
    private String name;
//    @Value("wang")
//    public void setName(String name) {
//        this.name = name;
//    }

    @Override
    public void save() {
        System.out.println("Dao中保存用户的方法执行了。。。"+name);
    }
}
