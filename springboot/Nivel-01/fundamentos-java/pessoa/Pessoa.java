package pessoa;

public class Pessoa {
//    nome, idade, cpf
//    tipo nomeDaVariavel

    String nome;
    int idade;
    String cpf;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    String imprimirDadosDaPessoa() {
        return "O nome da pessoa é " + nome + ", a idade é " + idade + " anos" + " e o documento é " + cpf;
    }
}
