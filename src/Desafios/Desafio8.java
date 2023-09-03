package Desafios;

/*
    Utilizando a Stream API, realize a soma dos dígitos de todos os números da lista e exiba o resultado no console.
 */

import java.util.Arrays;

import static Desafios.Lista.numeros;

public class Desafio8 {
    public static void main(String[] args) {

        int somaDosDigitos = numeros.stream()
                .map(String::valueOf)
                .flatMap(digitos -> Arrays.stream(digitos.split("")))
                .mapToInt(Integer::parseInt)
                .sum();


        System.out.println(somaDosDigitos);

    }
}
