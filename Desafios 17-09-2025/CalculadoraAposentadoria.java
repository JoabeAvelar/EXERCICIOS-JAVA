import java.util.Scanner;

public class CalculadoraAposentadoria {

    public static void main(String[] args) {
        
        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Declaração das variáveis
        int idade;
        char sexo;
        int anosContribuicao;

        try {
            // Solicita a idade da pessoa
            System.out.print("Digite a sua idade: ");
            idade = scanner.nextInt();

            // Solicita o sexo (M/F)
            System.out.print("Digite o seu sexo (M para masculino, F para feminino): ");
            sexo = scanner.next().toUpperCase().charAt(0);

            // Solicita os anos de contribuição
            System.out.print("Digite a quantidade de anos de contribuição: ");
            anosContribuicao = scanner.nextInt();

            // Variáveis para a lógica de cálculo
            int idadeMinima;
            int contribuicaoMinima;
            int anosFaltantes;

            // Define as regras com base no sexo
            if (sexo == 'F') {
                idadeMinima = 60;
                contribuicaoMinima = 30;
            } else if (sexo == 'M') {
                idadeMinima = 65;
                contribuicaoMinima = 35;
            } else {
                System.out.println("Erro: Sexo inválido. Por favor, digite M ou F.");
                return; // Encerra o programa
            }

            // Verifica se a pessoa já tem direito à aposentadoria
            if ((idade >= idadeMinima) || (anosContribuicao >= contribuicaoMinima)) {
                System.out.println("\nVocê já tem o direito à aposentadoria.");
            } else {
                // Calcula o tempo que falta para a aposentadoria
                int anosFaltantesIdade = idadeMinima - idade;
                int anosFaltantesContribuicao = contribuicaoMinima - anosContribuicao;

                // Para se aposentar, é necessário cumprir ambas as regras, então o tempo que falta é o maior dos dois
                if (anosFaltantesIdade > anosFaltantesContribuicao) {
                    anosFaltantes = anosFaltantesIdade;
                    System.out.printf("\nFaltam %d anos para você se aposentar por idade.\n", anosFaltantes);
                } else {
                    anosFaltantes = anosFaltantesContribuicao;
                    System.out.printf("\nFaltam %d anos de contribuição para você se aposentar.\n", anosFaltantes);
                }
            }
            
        } catch (java.util.InputMismatchException e) {
            // Trata o erro se o usuário não digitar um número válido
            System.out.println("Erro: Entrada inválida. Por favor, digite apenas números inteiros para idade e anos de contribuição.");
        } finally {
            // Garante que o Scanner seja fechado
            scanner.close();
        }
    }
}