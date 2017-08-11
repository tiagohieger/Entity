package br.com.annotations;

import br.com.annotations.constants.JoinType;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface Fk {

    String table();

    String id();

    String name() default "";

    boolean notNull() default false;

    JoinType join() default JoinType.INNER;

    boolean isReference() default true;

    boolean deleteOnCascade() default false;
}
