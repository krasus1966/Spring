package com.cx.jdbc;

import org.junit.Test;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

/**
 * JDBC模板使用
 */
public class JdbcDemo1 {

    @Test
    public void demo1(){
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mySql:///spring4_day03?serverTimezone=UTC");
        dataSource.setUsername("root");
        dataSource.setPassword("196610121");
        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
        jdbcTemplate.update("insert into account value (null,?,?)" ,"都带刀",1000d);
    }
}
