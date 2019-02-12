package com.cx.study4;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class MyAspectXML {
    /**
     * 前置通知
     * @param joinPoint
     */
    public void checkPri(JoinPoint joinPoint) {
        System.out.println("权限校验"+joinPoint);
    }

    /**
     * 后置通知
     * @param result
     */
    public void writeLog(Object result){
        System.out.println("日志记录");
    }
    /**
     * 性能监视
     */
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("环绕前通知");
        Object obj=joinPoint.proceed();
        System.out.println("环绕后通知");
        return obj;
    }
    /**
     * 异常抛出
     */
    public void afterThrowing(){
        System.out.println("异常抛出");
    }
    /**
     * 最终通知
     */
    public void after(){
        System.out.println("最终通知");
    }
}
