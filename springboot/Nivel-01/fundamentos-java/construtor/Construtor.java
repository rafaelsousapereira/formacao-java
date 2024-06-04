package construtor;

public class Construtor {

    private int numero;

    public Construtor(int numero) {
        this.numero = numero;
        System.out.println("Contrutor com 1 parametro criado");
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }
}
