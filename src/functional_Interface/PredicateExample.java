package functional_Interface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateExample {
    public static void main(String[] args) {
        // Criar uma lista de números inteiros
        List<String> palavras = Arrays.asList("Java", "Kotlin", "Python", "JavaScript", "C", "Go", "Ruby");

        // Usar o Predicate com expressão lambda para filtrar números pares
        Predicate<String> maisCincoCaracteres = palavra -> palavra.length() > 5;

        // Imprimir a lista de números pares
        palavras.stream()
                .filter( p -> p.length() < 5)
                .forEach(System.out::println);
    }
}