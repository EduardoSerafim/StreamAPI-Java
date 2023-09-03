package Desafios;

import java.util.List;

import static Desafios.Lista.numeros;

/*
    Com a ajuda da Stream API, filtre os números primos da lista e exiba o resultado no console.
 */
public class Desafio17 {
    public static void main(String[] args) {

        List<Integer> numerosPrimos = numeros.stream()
                .filter(Desafio17::ePrimo).toList();

        System.out.println(numerosPrimos);

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
