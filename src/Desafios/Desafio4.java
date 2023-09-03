package Desafios;

import java.util.List;

import static Desafios.Lista.numeros;

/*
    Utilize a Stream API para remover os valores ímpares da lista e imprima a lista resultante no console.
*/
public class Desafio4 {
    public static void main(String[] args) {

        List<Integer> listaSemImpares = numeros.stream().filter(n -> n % 2 == 0).toList();

        System.out.println(listaSemImpares);

    }
}
