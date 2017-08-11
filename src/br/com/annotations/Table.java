package br.com.annotations;

import br.com.annotations.constants.TableHierarchicalType;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface Table {

    String name();

    TableHierarchicalType estrategy() default TableHierarchicalType.NO_HERANCE;
}
