package com.example.demospringboot.annotation;

import org.springframework.web.bind.annotation.Mapping;

import java.lang.annotation.*;

/**
 * @author jiaks
 * @version E9
 * @Package com.example.demospringboot.annotation
 * @date 2021/2/18 14:04
 *
 *
 * API版本控制注解
 *
 */
@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Mapping
public @interface ApiVersion {
    // 标识版本号
    int value();
}
