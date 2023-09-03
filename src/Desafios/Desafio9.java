package Desafios;

/*
    Com a Stream API, verifique se todos os números da lista são distintos (não se repetem) e exiba o resultado no console.
 */

import java.util.List;

import static Desafios.Lista.numeros;

public class Desafio9 {
    public static void main(String[] args) {

        long numerosRepetidos = numeros.stream()
                        .distinct().count();
        boolean numerosSaoDistintos = numerosRepetidos == numeros.size();

        System.out.println("Todos os números são distintos: " + numerosSaoDistintos);

    }
}
