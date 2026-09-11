public class Questao06 {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Ana Souza", "20260001", "Ciência da Computação");

        System.out.println("- Dados iniciais");
        aluno.exibirDados();

        System.out.println();
        System.out.println("alterando o curso...");
        aluno.setCurso("sistemas de Informação");
        System.out.println("curso alterado com sucesso.");

        System.out.println();
        System.out.println("tentando alterar o nome para vazio...");
        aluno.setNome("");

        System.out.println();
        System.out.println("- Dados finais");
        aluno.exibirDados();
    }
}
// devido as instrucoes eu presumi que nao necessita de scanner ou menu de opcoes:

// ENUNCIADO DA QUESTAO:

// No método main, crie um objeto Aluno e realize os seguintes testes:

// crie o objeto utilizando o construtor;
// apresente os dados utilizando os métodos get;
// altere pelo menos um atributo utilizando um método set;
// tente atribuir um valor inválido a pelo menos um atributo;
// apresente os dados finais do objeto.