import java.util.Scanner;

public class FatorialWhile {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite um número inteiro não negativo:");
        
        int numero = scanner.nextInt();
        
        scanner.close();

        if (numero < 0) {
            System.out.println("O fatorial não é definido para números negativos.");
        } else {
            long fatorial = 1; // Use long para evitar overflow com números maiores
            int i = 1;

            while (i <= numero) {
                fatorial = fatorial * i;
                i++;
            }

            System.out.println("O fatorial de " + numero + " é: " + fatorial);
        }
    }
}
