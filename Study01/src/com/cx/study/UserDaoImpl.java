package com.cx.study;

public class UserDaoImpl implements UserDao{
    private String Name;

    public void setName(String name) {
        this.Name = name;
    }

    @Override
    public void save() {
        System.out.println("Userservice执行了"+Name);
    }
}
