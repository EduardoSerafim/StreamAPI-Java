package Desafios;

import java.util.Comparator;
import java.util.List;

import static Desafios.Lista.numeros;
/*
    Crie um programa que utilize a Stream API para ordenar a lista de números em ordem crescente e a exiba no console.
*/
public class Desafio1 {
    public static void main(String[] args) {

        List<Integer> numerosOrdenados =  numeros.stream().sorted().toList();

        System.out.println(numerosOrdenados);

    }
}
