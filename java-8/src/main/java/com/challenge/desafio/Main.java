package com.challenge.desafio;

import java.math.BigDecimal;
import com.challenge.desafio.CalculadoraDeClasses;

public class Main {
    public static void main(String[] args) throws IllegalAccessException {
        BigDecimalClass bigDecimalClass = new BigDecimalClass(new BigDecimal(5));
        CalculadoraDeClasses calculadoraDeClasses = new CalculadoraDeClasses();

        BigDecimal bigDecimal = calculadoraDeClasses.somar(bigDecimalClass);

        System.out.println(bigDecimal);
    }
}
