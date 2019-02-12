package com.cx.study3;

public class UserDaoImpl implements UserDao{
    @Override
    public void save() {
        System.out.println("增加");
    }

    @Override
    public void update() {
        System.out.println("修改");
    }

    @Override
    public void find() {
        System.out.println("查询");
    }

    @Override
    public void delete() {
        System.out.println("删除");
    }
}
