package Desafios;

import static Desafios.Lista.numeros;

/*
    Utilizando a Stream API, verifique se a lista contém pelo menos um número negativo e exiba o resultado no console.
 */
public class Desafio15 {
    public static void main(String[] args) {



        boolean contemNegativo = numeros.stream()
                .anyMatch(n -> n < 0);

        System.out.println("Contém um número negativo: " + contemNegativo);

    }
}
