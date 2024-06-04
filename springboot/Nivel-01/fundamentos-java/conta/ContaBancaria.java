package conta;

public class ContaBancaria {
    private String numero;
    private String titular;
    private double saldo;

    // Getter e Setter
    public ContaBancaria() {
        this.saldo = 0.0;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getNumero() {
        return numero;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    // depositar
    void depositar(double valor) {
        if (valor > 0) {
            saldo = saldo + valor;
            System.out.println("Deposito R$ " + valor + ". Saldo atual: " + saldo);
        } else {
            System.out.println("Saldo Insuficiente.");
        }
    }

    // sacar
    void sacar(double valor) {
        if (saldo > 0 && valor <= saldo) {
            saldo = saldo - valor;
            System.out.println("Saque R$ " + valor + ". Saldo atual: " + saldo);
        }
    }
}
