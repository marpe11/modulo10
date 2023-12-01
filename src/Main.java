import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Leitura das quatro notas
        System.out.println("Digite a nota 1 (de 0 a 10): ");
        double nota1 = scanner.nextDouble();

        System.out.println("Digite a nota 2 (de 0 a 10): ");
        double nota2 = scanner.nextDouble();

        System.out.println("Digite a nota 3 (de 0 a 10): ");
        double nota3 = scanner.nextDouble();

        System.out.println("Digite a nota 4 (de 0 a 10): ");
        double nota4 = scanner.nextDouble();

        // Cálculo da média
        double media = (nota1 + nota2 + nota3 + nota4) / 4;

        // Verificação das condições e exibição do resultado
        if (media >= 7) {
            System.out.println("Aprovado");
        } else if (media >= 5) {
            System.out.println("Recuperação");
        } else {
            System.out.println("Reprovado");
        }

        // Fechar o scanner para evitar vazamentos de recursos
        scanner.close();
    }
}