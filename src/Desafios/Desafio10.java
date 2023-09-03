package Desafios;

import java.util.List;

import static Desafios.Lista.numeros;

/*
    Utilize a Stream API para agrupar os valores ímpares múltiplos de 3 ou de 5 e exiba o resultado no console.
 */
public class Desafio10 {
    public static void main(String[] args) {

        List<Integer> numerosImparesMultiplosDe5e3 = numeros.stream()
                .filter(n -> n % 2 != 0 )
                .filter(n -> n % 3 == 0 || n % 5 == 0).toList();

        System.out.println(numerosImparesMultiplosDe5e3);


    }
}
