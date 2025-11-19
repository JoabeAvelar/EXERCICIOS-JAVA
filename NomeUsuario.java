import java.util.Scanner;

public class NomeUsuario{
    public static void main(String []args) {
        Scanner scanner = new Scanner(System.in);
        
       System.out.println("Digite seu nome: ");
       
       String nome = scanner.nextLine();
       
       System.out.println("Olá, " + nome + "!");
       
       scanner.close();
       
    }
}