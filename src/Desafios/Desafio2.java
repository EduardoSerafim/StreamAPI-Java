package Desafios;

import static Desafios.Lista.numeros;

/*
    Utilizando a Stream API, realize a soma dos números pares da lista e exiba o resultado no console.
* */
public class Desafio2 {
    public static void main(String[] args) {

        int resultado = numeros.stream()
                .filter(n -> n % 2 == 0)
                .reduce(0, Integer::sum);


        System.out.println(numeros);
        System.out.println(resultado);

    }
}
