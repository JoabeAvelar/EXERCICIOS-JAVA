// Importa a classe Scanner para ler a entrada do usuário
import java.util.Scanner;

public class MenordeTresNumeros {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Cria um objeto Scanner
        
        int numero1;
        int numero2;
        int numero3;

        System.out.print("Digite o primeiro número: ");
        numero1 = input.nextInt(); // Lê o número digitado pelo usuário
        
        System.out.print("Digite o segundo número: ");
        numero2 = input.nextInt(); // Lê o número digitado pelo usuário
        
        System.out.print("Digite o terceiro número: ");
        numero3 = input.nextInt(); // Lê o número digitado pelo usuário
        
        int menor = numero1;

        // Verifica se o primeiro número é menor que o segundo
        if (numero2 < menor)
            menor = numero2;
        
        // Verifica se o primeiro número é maior que o segundo
        if (numero3 < menor)
            menor = numero3;
        
        System.out.printf("O menor número é: %d\n", menor);

        input.close(); // Fecha o scanner 
    }
}

