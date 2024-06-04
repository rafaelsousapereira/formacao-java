package pessoa;

public class Pessoa {
//    nome, idade, cpf
//    tipo nomeDaVariavel

    String nome;
    int idade;
    String cpf;

    String imprimirDadosDaPessoa(Integer indice) {

        return "O nome da pessoa é " + nome + " a idade é "
                + idade + " anos" + "o documento é " + cpf + "e o índice é " + indice;
    }
}
