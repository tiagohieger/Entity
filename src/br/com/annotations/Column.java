package br.com.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface Column {

    String defaultValue() default "";

    String name() default "";

    boolean unique() default false;

    int length() default 255;

    boolean notNull() default false;

    boolean isText() default false;

    boolean isBigInt() default false;

    int scale() default 8;

    int precision() default 2;

    String itWas() default "";
}
