package com.cx.tx;
/*
转账的dao接口
 */
public interface AccountDao {
    public void outMoney(String from,Double money);
    public void inMoney(String to,Double money);
}
