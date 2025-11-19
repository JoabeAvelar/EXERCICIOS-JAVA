import java.util.Scanner;

public class ConversaoTempo {
    public static void main(String[] args) {

        // Cria um objeto Scanner para leitura dos dados digitados
        Scanner input = new Scanner(System.in);

        // --- Entrada de dados ---
        System.out.print("Digite o tempo total em minutos: ");
        int minutosTotais = input.nextInt(); 
        // Lê o valor em minutos

        // --- Processamento ---
        // Divide o total de minutos por 60 para obter as horas inteiras
        int horas = minutosTotais / 60;

        // Usa o operador % (módulo) para obter os minutos restantes
        int minutosRestantes = minutosTotais % 60;

        // --- Saída de dados ---
        System.out.println("\n⏱ Conversão de Minutos para Horas e Minutos ⏱");
        System.out.println("Tempo total: " + minutosTotais + " minutos");
        System.out.println("Equivale a: " + horas + " hora(s) e " + minutosRestantes + " minuto(s)");

        // Fecha o Scanner
        input.close();
    }
}