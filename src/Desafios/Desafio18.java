package Desafios;

/*
    Utilizando a Stream API, verifique se todos os números da lista são iguais e exiba o resultado no console.
 */

import java.util.Comparator;

import static Desafios.Lista.numeros;

public class Desafio18 {
    public static void main(String[] args) {

        boolean saoIguais = numeros.stream().
                distinct()
                .count() == 1;

        System.out.println("Todos os números são iguai: " + saoIguais);

    }
}
