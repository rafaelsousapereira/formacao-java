package excecoes;

public class Excecoes {
    // Checked exceptions

    // Unchecked exceptions

    public static void main(String[] args) {
        // try / catch
        try {
            validaNumero();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Deu ruim. " + e.getMessage());
        }
    }

    public static void validaNumero() throws Exception {
        int numero = 10;

        if (numero < 100) {
            throw new Exception("O número é menor de 100");
        }
    }
}
