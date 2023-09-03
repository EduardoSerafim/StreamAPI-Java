package Desafios;

import static Desafios.Lista.numeros;

/*
    Utilize a Stream API para verificar se a lista contém algum número maior que 10 e exiba o resultado no console.
 */
public class Desafio6 {
    public static void main(String[] args) {

        boolean temNumeroMaiorQue10 = numeros.stream()
                .anyMatch(n -> n > 10);

        System.out.println(temNumeroMaiorQue10 ? "Tem números maiores que 10" : "Não tem números maiores que 10");

    }
}
