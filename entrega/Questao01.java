import java.util.Scanner;

public class Questao01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("nome: ");
        String nome = scanner.nextLine();

        System.out.print("idade: ");
        int idade = Integer.parseInt(scanner.nextLine().trim());

        System.out.print("curso: ");
        String curso = scanner.nextLine();

        System.out.println();
        System.out.println("dados:");
        System.out.println("nome: " + nome);
        System.out.println("idade: " + idade + " anos");
        System.out.println("curso: " + curso);

        scanner.close();
    }
}