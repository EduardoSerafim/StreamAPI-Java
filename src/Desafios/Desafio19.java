package Desafios;

import static Desafios.Lista.numeros;

/*
    Com a Stream API, encontre a soma dos números da lista que são divisíveis tanto por 3 quanto por 5 e exiba o resultado no console.
 */
public class Desafio19 {
    public static void main(String[] args) {

        int resultadao = numeros.stream()
                .filter(n -> n % 3 == 0 && n % 5 == 0)
                .reduce(0, Integer::sum);

        System.out.println(numeros.stream()
                .filter(n -> n % 3 == 0 || n % 5 == 0).toList());
        System.out.println(resultadao);

    }
}
