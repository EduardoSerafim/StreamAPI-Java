package Desafios;

/*
    Com a Stream API, calcule a média dos números maiores que 5 e exiba o resultado no console.
* */

import java.util.OptionalDouble;

import static Desafios.Lista.numeros;

public class Desafio5 {
    public static void main(String[] args) {

        //é possível fazer dessa forma
        double resultado = numeros.stream()
                        .filter(n -> n > 5)
                        .mapToDouble(Integer::doubleValue)
                        .average()
                        .getAsDouble();

        System.out.println(numeros);
        System.out.println(resultado);


    }
}
