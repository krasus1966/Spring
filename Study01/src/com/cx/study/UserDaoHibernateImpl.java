package com.cx.study;

public class UserDaoHibernateImpl implements UserDao{
    @Override
    public void save() {
        System.out.println("Hibernate执行了");
    }
}
