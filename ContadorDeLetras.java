import java.util.Scanner;

public class ContadorDeLetras {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite uma palavra: ");
        String palavra = scanner.nextLine();
        
        scanner.close();

        int contador = 0;
        // Percorre cada caractere da palavra
        for (int i = 0; i < palavra.length(); i++) {
            char caractere = palavra.charAt(i); // Obtém o caractere na posição i
            // Verifica se o caractere é uma letra (inclui letras acentuadas)
            if (Character.isLetter(caractere)) {
                contador++; // Incrementa o contador se for uma letra
            }
        }

        System.out.println("A palavra \"" + palavra + "\" possui " + contador + " letras.");
    }
}
