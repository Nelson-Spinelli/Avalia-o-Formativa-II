import java.util.Scanner;

public class Questao03 {

    public static int quantidadeCaracteres(String texto) {
        return texto.length();
    }

    public static String formatarNome(String nome) {
        return nome.toUpperCase();
    }

    public static boolean contemSilva(String nome) {
        return nome.contains("Silva");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("nome completo: ");
        String nomeCompleto = scanner.nextLine();

        int quantidade = quantidadeCaracteres(nomeCompleto);
        String nomeMaiusculo = formatarNome(nomeCompleto);
        boolean temSilva = contemSilva(nomeCompleto);

        System.out.println();
        System.out.println("quantidade de caracteres: " + quantidade);
        System.out.println("nome em carac maiúsculas: " + nomeMaiusculo);
        System.out.println("contém \"Silva\": " + temSilva);

        scanner.close();
    }
}