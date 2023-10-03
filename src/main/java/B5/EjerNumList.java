package B5;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EjerNumList {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        numeros.stream()
                .filter(n -> n % 2 == 0)
                .forEach(System.out::println);

        System.out.println("-------------------------------------------");

        List<Integer> SumaDupli = numeros.stream()
                .map(n -> n * 2)
                .collect(Collectors.toList());
        System.out.println(SumaDupli);

        System.out.println("-------------------------------------------");






    }
}
