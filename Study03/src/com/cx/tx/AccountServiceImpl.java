package com.cx.tx;

import org.springframework.transaction.annotation.Transactional;

/**
 * 转账的业务层实现类
 */
@Transactional
public class AccountServiceImpl implements AccountService{

    //注入Dao
    private AccountDao accountDao;

    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }

    @Override
    /*
    from    :转出账号
    to      :转入账号
    money   :转账金额
     */
    public void transfer(String from, String to, Double money) {
        accountDao.outMoney(from, money);
        int i = 1/0;
        accountDao.inMoney(to, money);
    }
}
