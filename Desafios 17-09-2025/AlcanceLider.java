import java.util.Scanner;

public class AlcanceLider {

    public static void main(String[] args) {

        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Declaração das variáveis
        int pontosLider;
        int pontosLanterna;
        int diferencaPontos;
        int vitoriasNecessarias;

        try {
            
            System.out.print("Digite a quantidade de pontos do líder: ");
            pontosLider = scanner.nextInt();

            System.out.print("Digite a quantidade de pontos do time lanterna: ");
            pontosLanterna = scanner.nextInt();

            // Verifica se os valores são válidos
            if (pontosLider < pontosLanterna) {
                System.out.println("Erro: Os pontos do líder não podem ser menores que os do time lanterna.");
                return; // Encerra o programa
            }

            // Calcula a diferença de pontos
            diferencaPontos = pontosLider - pontosLanterna;

            if (diferencaPontos % 3 == 0) {
                vitoriasNecessarias = diferencaPontos / 3;
            } else {
                vitoriasNecessarias = (diferencaPontos / 3) + 1;
            }

            // Exibe o resultado
            System.out.println("\n--- Resultado ---");
            System.out.println("Pontos do líder: " + pontosLider);
            System.out.println("Pontos do time lanterna: " + pontosLanterna);
            System.out.println("Diferença de pontos: " + diferencaPontos);
            System.out.println("Número de vitórias necessárias para o time lanterna alcançar (ou ultrapassar) o líder: " + vitoriasNecessarias);

        } catch (java.util.InputMismatchException e) {
            // Captura e trata erros se o usuário não digitar um número inteiro
            System.out.println("Erro: Entrada inválida. Por favor, digite apenas números inteiros.");
        } finally {
            // Garante que o objeto Scanner será fechado no final
            scanner.close();
        }
    }
}