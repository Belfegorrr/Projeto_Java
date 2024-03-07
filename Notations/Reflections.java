package Notations;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class Reflections {
    
    public static void main(String args[]) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException {
        executeLeituraAnotacao();
    }

    private static void executeLeituraAnotacao(){
        System.out.println("*** Anotations ***");
        PrimeiraAnotacao prod = new PrimeiraAnotacao();
        Annotation[] annotations = prod.getClass().getAnnotations();
        for (Annotation an: annotations) {
            System.out.println("Annotation type: " + an.annotationType());
        }

        for (Field field : prod.getClass().getDeclaredFields()){
            if(field.isAnnotationPresent(IAnotacao.class)){
                IAnotacao n = field.getAnnotation(IAnotacao.class);
                System.out.println("Nome da anotação: " + n.getClass().getName());
                System.out.println("Valor da anotação: " + n.value());

            }
        }
        if(prod.getClass().isAnnotationPresent(IAnotacao.class)){
            IAnotacao n = prod.getClass().getAnnotation(IAnotacao.class);
            System.out.println("Nome da anotação: " + n.getClass().getName());
            System.out.println("Valor da anotação: " + n.value());
        }
    }    
}
