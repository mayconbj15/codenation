package com.challenge.desafio;

import com.challenge.annotation.Somar;
import com.challenge.annotation.Subtrair;
import com.challenge.interfaces.Calculavel;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.math.BigDecimal;

public class CalculadoraDeClasses implements Calculavel  {
    public CalculadoraDeClasses(){

    }

    public BigDecimal somar(Object classe) throws IllegalAccessException {
        BigDecimal object = BigDecimal.ZERO;
        BigDecimal soma = BigDecimal.ZERO;

        Field[] fields = classe.getClass().getFields();

        for(Field field : fields){
            if(field.isAnnotationPresent(Somar.class)){
                BigDecimal bigDecimal = (BigDecimal) field.get(classe);
                System.out.println("BigDecimal " + bigDecimal);
                soma = soma.add(bigDecimal);
            }
        }

        return soma;
    }

    public BigDecimal subtrair(Object classe) throws IllegalAccessException {
        BigDecimal object = BigDecimal.ZERO;
        BigDecimal soma = BigDecimal.ZERO;

        Field[] fields = classe.getClass().getFields();

        for(Field field : fields){
            if(field.isAnnotationPresent(Subtrair.class)){
                BigDecimal value = (BigDecimal) field.get(classe);
                soma = soma.subtract(value);
            }
        }
        return soma;
    }

    public BigDecimal totalizar(Object classe){
        return null;
    }



}
