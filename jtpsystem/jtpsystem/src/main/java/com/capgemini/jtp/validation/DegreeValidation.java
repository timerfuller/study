package com.capgemini.jtp.validation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;


@Target({ METHOD, FIELD, ANNOTATION_TYPE, CONSTRUCTOR, PARAMETER })
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Constraint(validatedBy = { DegreeValidator.class })
public @interface DegreeValidation {
    String message() default "Degree必须为 本科，硕士，博士";

    Class<?>[] groups() default { };

    Class<? extends Payload>[] payload() default { };
}
