import java.util.Scanner;

public class ConsumoCombustivel {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        // Pedir a distância percorrida (em km)
        System.out.println("Digite a distância total percorrida (em km):");
        // Usamos double para permitir valores decimais na distância
        double distanciaKm = scanner.nextDouble();

        // Pedir o total de combustível gasto (em litros)
        System.out.println("Digite o total de combustível gasto (em litros):");
        // Usamos double para permitir valores decimais no combustível
        double combustivelLitros = scanner.nextDouble();

        // Calcular o consumo médio (km/l)
        if (combustivelLitros > 0) {
            double consumoMedio = distanciaKm / combustivelLitros;

            // Mostrar o resultado formatado
            System.out.printf("O consumo médio é de %.2f km/l.%n", consumoMedio);
        } else {
            System.out.println("O total de combustível gasto deve ser maior que zero para calcular o consumo médio.");
        }

        scanner.close();
    }
}
