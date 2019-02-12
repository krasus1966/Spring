package com.cx.study4;

public class ProductDaoImpl implements ProductDao {
    @Override
    public void save() {
        System.out.println("保存信息");
    }
    @Override
    public String update() {
        System.out.println("更新信息");
        return "SUCCESS";
    }
    @Override
    public void find() {
        System.out.println("查询信息");
//        int i =1/0;
    }
    @Override
    public void delete() {
        System.out.println("删除信息");
    }
}
