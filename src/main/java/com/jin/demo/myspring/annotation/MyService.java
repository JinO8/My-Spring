package com.jin.demo.myspring.annotation;

import java.lang.annotation.*;

/**
 * 自动注入,业务逻辑层
 * @author wangjin
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface MyService {
	String value() default "";
}
