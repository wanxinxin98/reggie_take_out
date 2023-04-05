package com.wan.common;

/**
 * @Author moxinxin
 * @Date 2023/3/31 18:33
 * @Version 1.0
 */

/**
 * 自定义业务异常类
 */
public class CustomException extends RuntimeException{

    public CustomException(String message){
        super(message);
    }
}
