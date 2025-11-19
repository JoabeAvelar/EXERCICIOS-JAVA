//Importa a classe Scanner 
import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        
        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita que o usuário insira um número
        System.out.print("Digite um número de 1 a 10 para ver a tabuada: ");

        // Lê o número fornecido pelo usuário
        int numero = scanner.nextInt();

        // Fecha o scanner após a leitura (boa prática)
        scanner.close();

        // Imprime o cabeçalho da tabuada
        System.out.println("Tabuada de " + numero + ":");

        // Loop for para calcular e imprimir a tabuada de 1 a 10
        for (int i = 1; i <= 10; i++) {
            // Calcula o resultado da multiplicação
            int resultado = numero * i;

            // Imprime a linha da tabuada no formato: número x i = resultado
            System.out.println(numero + " x " + i + " = " + resultado);
        }
    }
}
