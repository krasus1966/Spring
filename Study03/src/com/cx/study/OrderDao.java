package com.cx.study;

public class OrderDao {
    public void save(){
        System.out.println("保存");
    }
    public void update(){
        System.out.println("更新");
    }
    public String  delete(){
        System.out.println("删除");
        return "wo";
    }
    public void find(){
        System.out.println("查询");
    }
}
