package com.example.demo.validators;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(validatedBy = {NoMoreThanMaxValidator.class})
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface ValidNoMoreThanMax {
    String message() default "The inventory must be within the min and max bounds";
    Class<?> [] groups() default {};
    Class<? extends Payload>[] payload() default {};


}
