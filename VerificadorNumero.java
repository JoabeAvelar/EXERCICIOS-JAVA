import java.util.Scanner;

public class VerificadorNumero {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); // Cria um objeto Scanner para ler a entrada do usuário

        System.out.print("Digite um número: ");
        double numero = scanner.nextDouble(); // Lê o número digitado pelo usuário

        if (numero > 0) {
            System.out.println("O número " + numero + " é positivo.");
        } else if (numero < 0) {
            System.out.println("O número " + numero + " é negativo.");
        } else {
            System.out.println("O número é zero.");
        }

        scanner.close(); // Fecha o objeto Scanner para liberar os recursos
    }
}
