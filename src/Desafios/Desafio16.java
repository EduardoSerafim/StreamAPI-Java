package Desafios;

import java.util.List;
import java.util.stream.Stream;

import static Desafios.Lista.numeros;

/*
    Utilize a Stream API para agrupar os números em duas listas separadas, uma contendo os números pares e outra contendo os números ímpares da lista original, e exiba os resultados no console.
 */
public class Desafio16 {
    public static void main(String[] args) {

        List<Integer> numerosPares = numeros.stream()
                .filter(n -> n % 2 == 0).toList();

        List<Integer> numerosImpares = numeros.stream()
                .filter(n -> n % 2 != 0).toList();


        System.out.println(numerosPares);
        System.out.println(numerosImpares);
    }
}
