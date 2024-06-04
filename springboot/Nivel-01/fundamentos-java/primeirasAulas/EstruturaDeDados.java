package primeirasAulas;

import java.util.ArrayList;
import java.util.List;

public class EstruturaDeDados {

    public static void main(String[] args) {
        // Lista
        List<String> nomes = new ArrayList<>();
        nomes.add("Gaby");
        nomes.add("Pedro");
        nomes.add("Júlia");

        System.out.println(nomes.get(2));
        // For Each
        for (String nome : nomes) {
            System.out.println("O nome é " + nome);
        }

        // Lambda Expression
        nomes.forEach(nome -> System.out.println("O nome que apareceu foi " + nome));
        nomes.forEach(System.out::println);
    }
}
