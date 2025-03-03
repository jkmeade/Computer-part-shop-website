package com.example.demo.validators;

import com.example.demo.domain.Part;
import org.apache.catalina.core.ApplicationContext;
import org.springframework.beans.factory.annotation.Autowired;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class NoMoreThanMaxValidator implements ConstraintValidator<ValidNoMoreThanMax, Part> {




    @Override
    public void initialize(ValidNoMoreThanMax constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }

    @Override
    public boolean isValid(Part part, ConstraintValidatorContext constraintValidatorContext) {
            if(part.getInv() > part.getMaxInv()){
                constraintValidatorContext.buildConstraintViolationWithTemplate("Error: Inventory must be less than or equal to " + part.getMaxInv())
                        .addPropertyNode("inv")
                        .addConstraintViolation();
                return false;
            } else if ( part.getInv() < part.getMinInv()) {
                constraintValidatorContext.buildConstraintViolationWithTemplate("Error:  Inventory must be greater than or equal to" + part.getMinInv())
                        .addPropertyNode("inv")
                        .addConstraintViolation();
                return false;

            } else {
                return true;
            }


    }
}
