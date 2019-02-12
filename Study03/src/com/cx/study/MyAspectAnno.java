package com.cx.study;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

/**
 * 切面类：注解的切面类
 */
@Aspect
public class MyAspectAnno {
    //前置通知
    @Before(value = "execution(* com.cx.study.OrderDao.save(..))")
    public void before(){
        System.out.println("前置");
    }
    //后置通知
    @AfterReturning(value = "execution(* com.cx.study.OrderDao.delete(..))",returning = "result")
    public void afterReturning(Object result){
        System.out.println("后置"+result);
    }
    //环绕通知
    @Around(value = "execution(* com.cx.study.OrderDao.update(..))")
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("环绕前增强");
        Object obj=joinPoint.proceed();
        System.out.println("环绕后增强");
        return obj;
    }
    //异常通知
    @AfterThrowing(value = "MyAspectAnno.pointcut1()",throwing = "e")
    public void afterThrowing(Throwable e){
        System.out.println("抛出异常"+e.getMessage());
    }
    //最终通知
    @After(value = "execution(* com.cx.study.OrderDao.find(..))")
    public void after(){
        System.out.println("最终通知");
    }
    //切入点注解
    @Pointcut(value = "execution(* com.cx.study.OrderDao.find(..))")
    private void pointcut1(){ }
    @Pointcut(value = "execution(* com.cx.study.OrderDao.delete(..))")
    private void pointcut2(){ }
    @Pointcut(value = "execution(* com.cx.study.OrderDao.update(..))")
    private void pointcut3(){ }
    @Pointcut(value = "execution(* com.cx.study.OrderDao.save(..))")
    private void pointcut4(){ }
}
