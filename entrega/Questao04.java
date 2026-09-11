import java.util.Scanner;

public class Questao04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int QUANTIDADE = 5;
        double[] notas = new double[QUANTIDADE];

        for (int i = 0; i < QUANTIDADE; i++) {
            System.out.print("Nota " + (i + 1) + ": ");
            notas[i] = Double.parseDouble(scanner.nextLine().trim().replace(",", "."));
        }

        double soma = 0;
        double maiorNota = notas[0];
        double menorNota = notas[0];
        int aprovados = 0;

        for (int i = 0; i < QUANTIDADE; i++) {
            soma += notas[i];

            if (notas[i] > maiorNota) {
                maiorNota = notas[i];
            }

            if (notas[i] < menorNota) {
                menorNota = notas[i];
            }

            if (notas[i] >= 7.0) {
                aprovados++;
            }
        }

        double media = soma / QUANTIDADE;

        System.out.println();
        System.out.println("--- Resultado ---");

        System.out.print("Notas: ");
        for (int i = 0; i < QUANTIDADE; i++) {
            System.out.print(notas[i]);
            if (i < QUANTIDADE - 1) {
                System.out.print(" ");
            }
        }
        System.out.println();

        System.out.println("Média: " + media);
        System.out.println("maior nota: " + maiorNota);
        System.out.println("menor nota: " + menorNota);
        System.out.println("alunos com nota >= 7.0: " + aprovados);

        scanner.close();
    }
}