package Desafios;
import java.util.List;

import static Desafios.Lista.numeros;

/*
    Utilize a Stream API para filtrar os números que estão dentro de um intervalo específico (por exemplo, entre 5 e 10) e exiba o resultado no console.
 */

public class Desafio13 {
    public static void main(String[] args) {

        List<Integer> numerosNoIntervalo = numeros.stream()
                .filter(n -> n > 5 && n < 10).toList();

        System.out.println(numerosNoIntervalo);

    }
}
