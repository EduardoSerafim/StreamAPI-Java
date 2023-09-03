package Desafios;

import static Desafios.Lista.numeros;

/*
    Utilizando a Stream API, encontre a soma dos quadrados de todos os números da lista e exiba o resultado no console.
 */
public class Desafio11 {
    public static void main(String[] args) {

        int resultado = numeros.stream()
                .map(n -> n * n)
                .reduce(0, Integer::sum);

        System.out.println(resultado);

    }
}
