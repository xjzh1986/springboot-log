package com.example.demo.log.entity;

import java.lang.annotation.*;

/**
 * 自定义注解类
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface SysLogAnnotation {
	String value() default "";
}