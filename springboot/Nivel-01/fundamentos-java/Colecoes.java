import java.util.HashMap;
import java.util.Map;

public class Colecoes {

    public static void main(String[] args) {
        Map<String, Integer> notas = new HashMap<>();
        notas.put("Gaby", 10);
        notas.put("Pedro", 10);
        notas.put("Julia", 10);
        notas.put("Rafa", 9);

        var nota = notas.get("Rafa");
        System.out.println(nota);

        for (Map.Entry<String, Integer> entry : notas.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();

            System.out.println("A chave é " + key + " e o valor é " + value);
        }
    }
}
