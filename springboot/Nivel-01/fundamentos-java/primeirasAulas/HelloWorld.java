package primeirasAulas;

public class HelloWorld {
    public static void main(String[] args) {
        /*
        *   Números (int, double, float, long)
        *   Texto (String)
        *   Booleanos (boolean)
        * */
        int dadoDoTipoInt = 10;
        double dadoDoTipoDouble = 3.14;
        float dadoDoTipoFloat = 3.14f;
        long dadoDoTipoLong = 123456789L;
        String dadoDoTipoString = "Hello World";
        boolean dadoDoTipoBoolean = true; // or false

        // if - else
        if (dadoDoTipoInt == 10) {
            System.out.println("Entrou no if do 10");
        }

        if (dadoDoTipoInt < 12) {
            System.out.println("Entrou no if do 12");
        } else {
            System.out.println("Entrou no else");
        }

        // While (Enquanto algo for verdadeiro faça alguma coisa)
        int valorInicial = 0;
        while (valorInicial < 3) {
            System.out.println("O valor inicial é menor que 3");
            System.out.println(valorInicial);

            valorInicial++;
        }
        System.out.println("Saiu do while");

        // For
        for (int i = 0; i < 4; i++) {
            System.out.println("O valor de i é " + i);
        }
        System.out.println("Finalizando o FOR");
    }
}
