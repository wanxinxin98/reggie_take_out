package com.wan.common;

/**
 * @Author moxinxin
 * @Date 2023/3/31 16:51
 * @Version 1.0
 */

/**
 * 基于ThreadLocal封装的工具类，用于保存和获取当前登录的用户id
 */
public class BaseContext {
    private static ThreadLocal<Long> threadLocal = new ThreadLocal<>();

    public static void setCurrentId(Long id){
        threadLocal.set(id);
    }

    public static Long getCurrentId(){
        return threadLocal.get();
    }
}
