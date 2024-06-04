package pessoa;

public class TesteDePessoa {

    public static void main(String[] args) {

        Pessoa pessoa1 = new Pessoa();
        pessoa1.cpf = "44433322211";
        pessoa1.nome = "Rafael";
        pessoa1.idade = 30;

        System.out.println(pessoa1.imprimirDadosDaPessoa(1));

        Pessoa pessoa2 = new Pessoa();
        pessoa2.cpf = "00099988877";
        pessoa2.nome = "Maria";
        pessoa2.idade = 18;

        System.out.println(pessoa2.imprimirDadosDaPessoa(2));
    }
}
