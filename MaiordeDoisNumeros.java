// Importa a classe Scanner para ler a entrada do usuário
import java.util.Scanner;

public class MaiordeDoisNumeros {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Cria um objeto Scanner
        
        int numero1;
        int numero2;

        System.out.print("Digite o primeiro número: ");
        numero1 = input.nextInt(); // Lê o número digitado pelo usuário
        
        System.out.print("Digite o segundo número: ");
        numero2 = input.nextInt(); // Lê o número digitado pelo usuário
        
        int maior = numero1;

        // Verifica se o primeiro número é menor que o segundo
        if (numero2 > maior)
            maior = numero2;
    
        System.out.printf("O maior número é: %d\n", maior);

        input.close(); // Fecha o scanner 
    }
}

