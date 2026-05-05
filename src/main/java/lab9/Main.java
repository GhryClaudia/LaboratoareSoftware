package lab9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args)
    {
        Random random = new Random();

        List<Integer> list = random.ints(10, 5, 26)
                .boxed()
                .collect(Collectors.toList());
        int suma = list.stream()
                .mapToInt(Integer::intValue)
                .sum();
        int max=list.stream()
                .mapToInt(Integer::intValue)
                .max()
                .orElseThrow();
        int min=list.stream()
                .mapToInt(Integer::intValue)
                .min()
                .orElseThrow();
        List<Integer> listaFiltrata=list.stream()
                .filter(n->n>10&&n<20)
                .toList();
        List<Double> listaDouble=list.stream()
                .map(Integer::doubleValue)
                .toList();
        boolean exista=list.stream()
                .anyMatch(n->n==12);

        System.out.println("Lista initiala: " +list);
        System.out.println("Suma: " + suma);
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
        System.out.println("Lista intre 10 si 20: " + listaFiltrata);
        System.out.println("Liste double: " + listaDouble);
        System.out.println("Exista valoarea 12: " + exista);
        System.out.println();

        String text = "Acesta este un program scris in java pentru expresii lambda";
        List<String> cuvinte = Arrays.asList(text.split(" "));
        List<String> filtrata = cuvinte.stream()
                .filter(c -> c.length() >= 5)
                .toList();
        long count = filtrata.size();
        System.out.println("Cuvinte cu mai mult de 5 litere: " + filtrata);
        System.out.println("Numar cuvinte: " + count);
        List<String> sortata = filtrata.stream()
                .sorted()
                .toList();
        System.out.println("Lista sortata: " + sortata);
        cuvinte.stream()
                .filter(c -> c.startsWith("p"))
                .findFirst()
                .ifPresent(c -> System.out.println("Cuvant cu p: " + c));
    }
}
