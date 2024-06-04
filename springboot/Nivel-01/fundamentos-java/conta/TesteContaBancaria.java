package conta;

public class TesteContaBancaria {
    public static void main(String[] args) {
        ContaBancaria contaBancaria1 = new ContaBancaria();
        contaBancaria1.numero = "1234";
        contaBancaria1.titular = "Maria";
        contaBancaria1.saldo = 100.00;

        contaBancaria1.depositar(50);
        contaBancaria1.sacar(100);
    }
}
