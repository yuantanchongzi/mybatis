package com.gdz.sqlsession;

import com.gdz.handler.UserMapperInvocationHandler;

import java.lang.reflect.Proxy;

/**
 * @Author: francis
 * @Date: 2019/1/17 16:11
 */
public class SqlSession {

    //传入的是代理对象
    //public Class<?>[] getInterfaces() {}  第二项参数getInterfaces源码
    public static <T> T getUserMapper(Class clazz) {
        return (T) Proxy.newProxyInstance(clazz.getClassLoader(), new Class[] { clazz },
                new UserMapperInvocationHandler(clazz));
    }
}
