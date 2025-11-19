// Importa a classe Scanner para ler a entrada do usuário
import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in); // Cria um objeto Scanner

        System.out.print("Digite um número inteiro: ");
        int numero = leitor.nextInt(); // Lê o número inteiro digitado pelo usuário

        // Verifica se o resto da divisão por 2 é 0
        if (numero % 2 == 0) {
            System.out.println("O número " + numero + " é PAR.");
        } else {
            System.out.println("O número " + numero + " é ÍMPAR.");
        }

        leitor.close(); // Fecha o scanner para liberar recursos
    }
}
