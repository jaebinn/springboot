package com.book.config.auth;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.PARAMETER)
@Retention(RetentionPolicy.RUNTIME)
public @interface LoginUser { //@interface -> 어노테이션 클래스로 지정 (LoginUser라는 이름의 어노테이션이 생성되었다고 생각)
}
