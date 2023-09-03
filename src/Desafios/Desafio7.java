package Desafios;

import java.util.Comparator;

import static Desafios.Lista.numeros;

/*
    Com a ajuda da Stream API, encontre o segundo número maior da lista e exiba o resultado no console.
 */
public class Desafio7 {
    public static void main(String[] args) {

       int segundoMaior = numeros.stream()
                .sorted(Comparator.reverseOrder()).toList().get(1);


        System.out.println("Segundo maior número: " + segundoMaior);


    }
}
