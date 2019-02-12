package com.cx.study2;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("userService")
public class UserServiceImpl implements UserService{
    //注入Dao
    //@Autowired//对象类型属性，按照类型完成属性注入
    //@Qualifier(value = "userDao1")//我们习惯是按照名称完成属性注入：必须让@Autowired注解和@Qualifier一起使用完成按照名称属性注入。
    @Resource(name = "userDao1")
    private UserDao userDao;

    @Override
    public void save() {
        System.out.println("UserService");
        userDao.save();
    }
}
