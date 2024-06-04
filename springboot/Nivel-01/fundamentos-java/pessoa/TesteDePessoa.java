package pessoa;

public class TesteDePessoa {

    public static void main(String[] args) {

        Professor professor = new Professor();
        professor.setCpf("44433322211");
        professor.setNome("Rafael");
        professor.setIdade(33);
        professor.setSalario(20000);
        System.out.println(professor.imprimirDadosDaPessoa());

        Aluno aluno = new Aluno();
        aluno.setMatricula("000999");
        aluno.setCpf("55566677700");
        aluno.setNome("Maria");
        aluno.setIdade(17);
        System.out.println(aluno.imprimirDadosDaPessoa());
    }
}
