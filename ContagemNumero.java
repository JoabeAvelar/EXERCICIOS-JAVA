import java.util.Scanner;

public class ContagemNumero {

    public static void main(String[] args) {

        // 1. Criar um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // 2. Solicitar ao usuário que digite um número
        System.out.print("Digite um número inteiro: ");
        int n = scanner.nextInt();

        // 3. Usar um loop for para iterar de 1 até N
        //    A variável 'i' representa o número atual
        for (int i = 1; i <= n; i++) {
            // 4. Exibir o número atual (i)
            System.out.println(i);
        }

        // 5. Fechar o scanner para liberar recursos
        scanner.close();
    }
}
