import java.util.Scanner;
import java.time.Year;//importa a classe pra obter o ano atual

public class CalcularIdade {
    public static void main (String []args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o ano de nascimento: ");
        int anoNascimento = scanner.nextInt();
        
        int anoAtual = Year.now().getValue();
        //Obtém o ano atual automaticamente
        
        int idade = anoAtual - anoNascimento;
        
        System.out.println("O ano atual é: " + anoAtual);
        System.out.println("Sua idade é: " + idade + "anos.");
        
        scanner.close();
    }
}