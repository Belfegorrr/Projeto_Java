package Notations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target({ElementType.FIELD, ElementType.TYPE})
public @interface IAnotacao {
    
    String value();
}
