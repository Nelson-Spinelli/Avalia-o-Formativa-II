import java.util.Scanner;

public class Questao02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantidade de estudantes: ");
        int quantidade = Integer.parseInt(scanner.nextLine().trim());

        double soma = 0;
        double maiorNota = Double.NEGATIVE_INFINITY;
        double menorNota = Double.POSITIVE_INFINITY; // define infinidade negativa e positiva
        int aprovados = 0;

        System.out.println();
        for (int i = 1; i <= quantidade; i++) {
            System.out.print("Nota do estudante " + i + ": ");
            double nota = Double.parseDouble(scanner.nextLine().trim().replace(",", "."));

            soma += nota;

            if (nota > maiorNota) {
                maiorNota = nota;
            }

            if (nota < menorNota) {
                menorNota = nota;
            }

            if (nota >= 7.0) {
                aprovados++;
            }
        }

        double media = soma / quantidade;

        System.out.println();
        System.out.println("resultado da turma:");
        System.out.println("média da turma: " + media);
        System.out.println("maior nota: " + maiorNota);
        System.out.println("menor nota: " + menorNota);
        System.out.println("qtd de estudantes aprovados: " + aprovados);

        scanner.close();
    }
}