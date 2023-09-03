package Desafios;

import static Desafios.Lista.numeros;

/*
    Com a ajuda da Stream API, encontre o produto de todos os números da lista e exiba o resultado no console.
 */
public class Desafio12 {
    public static void main(String[] args) {

        int resultado = numeros.stream()
                .reduce(1, (n1, n2) -> n1 * n2);

        System.out.println(resultado);

    }
}
