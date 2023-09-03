package Desafios;

import static Desafios.Lista.numeros;

/*
    Com a ajuda da Stream API, verifique se todos os números da lista são positivos e exiba o resultado no console.
 */
public class Desafio3 {

    public static void main(String[] args) {

       boolean todosSaoPositvos = numeros.stream().allMatch(n -> n >= 0);

       System.out.println("Todos os números são positivos? " + todosSaoPositvos);

    }
}
