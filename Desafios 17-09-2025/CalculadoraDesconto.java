import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class CalculadoraDesconto {
    public static void main(String[] args) {
        
        // Cria um objeto BufferedReader para ler a entrada do usuário
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Declaração das variáveis
        double valorProduto;
        double percentualDesconto;
        double valorDesconto;
        double valorFinal;

        try {
            // Solicita o valor do produto ao usuário
            System.out.print("Digite o valor do produto: ");
            // Lê a linha digitada e converte para double
            valorProduto = Double.parseDouble(reader.readLine());

            // Solicita a porcentagem de desconto ao usuário
            System.out.print("Digite o percentual de desconto (ex: 15 para 15%): ");
            // Lê a linha digitada e converte para double
            percentualDesconto = Double.parseDouble(reader.readLine());

            // Verifica se os valores são válidos (não são negativos)
            if (valorProduto < 0 || percentualDesconto < 0) {
                System.out.println("Erro: O valor do produto e o percentual de desconto não podem ser negativos.");
                return; // Encerra o programa
            }

            // Calcula o valor do desconto usando a fórmula fornecida
            valorDesconto = valorProduto * (percentualDesconto / 100);

            // Calcula o valor final do produto com o desconto
            valorFinal = valorProduto - valorDesconto;

            // Exibe os resultados formatados
            System.out.println("\n--- Resultados ---");
            System.out.printf("Valor do produto: R$ %.2f\n", valorProduto);
            System.out.printf("Percentual de desconto: %.2f%%\n", percentualDesconto);
            System.out.printf("Valor do desconto: R$ %.2f\n", valorDesconto);
            System.out.printf("Valor do produto com desconto: R$ %.2f\n", valorFinal);

        } catch (IOException e) {
            // Captura e trata possíveis erros de entrada/saída
            System.out.println("Erro de entrada/saída: " + e.getMessage());
        } catch (NumberFormatException e) {
            // Captura e trata erros de conversão de texto para número
            System.out.println("Erro: Entrada inválida. Por favor, digite apenas números.");
        } finally {
            // Bloco finally para garantir que o leitor será fechado, mesmo em caso de erro
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                System.out.println("Erro ao fechar o leitor: " + e.getMessage());
            }
        }
    }
}