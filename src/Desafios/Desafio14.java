package Desafios;

import java.util.Comparator;
import java.util.Optional;

import static Desafios.Lista.numeros;

/*
    Com a Stream API, encontre o maior número primo da lista e exiba o resultado no console.
 */
public class Desafio14 {
    public static void main(String[] args) {

        int maiorPrimo = numeros.stream()
                .filter(Desafio14::ePrimo).max(Comparator.naturalOrder()).get();

        System.out.println(maiorPrimo);


    }

    static boolean ePrimo(int numero){
        if(numero <= 1){
            return false;
        }

        for(int i = 2; i < numero; i++){
            if (numero % i == 0){
                return false;
            }
        }
        return true;
    }
}
