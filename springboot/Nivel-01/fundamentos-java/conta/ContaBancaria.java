package conta;

public class ContaBancaria {
    String numero;
    String titular;
    double saldo;

    // depositar
    void depositar(double valor) {
        if (saldo > 0) {
            saldo = saldo + valor;
            System.out.println("Deposito R$ " + valor + ". Saldo atual: " + saldo);
        } else {
            System.out.println("Saldo Insuficiente.");
        }
    }

    // sacar
    void sacar(double valor) {
        if (saldo > 0 && valor <= 0) {
            saldo = saldo - valor;
            System.out.println("Saque R$ " + valor + ". Saldo atual: " + saldo);
        }
    }
}
