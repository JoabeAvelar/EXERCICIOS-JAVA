import java.util.Scanner;

public class CalcularAreaRetangulo {
    public static void main(String[] args) {

        // Cria um objeto Scanner para ler dados digitados pelo usuário
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== Claculadora de Área do Retângulo ===");
        
        //Solicita e lê a base 
        System.out.print("Digite o valor da base do retângulo: ");
        double base = scanner.nextDouble();

        //Solicita e lê a altura 
        System.out.print("Digite o valor da altura do retângulo: ");
        double altura = scanner.nextDouble();

        //Calcula a área do retângulo (Área = base * altura)
        double areaRetangulo = base * altura;
        
        System.out.printf("A área do retângulo é: " + areaRetangulo);
        
        scanner.close();
        
    }
}