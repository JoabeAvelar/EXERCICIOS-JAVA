import javax.swing.JOptionPane;

public class CalculadoraMedia {

    public static void main(String[] args) {

        try {
            // Solicita a nota da primeira prova
            String inputProva1 = JOptionPane.showInputDialog(null, "Digite a nota da primeira prova:");
            double notaProva1 = Double.parseDouble(inputProva1);

            // Solicita a nota da segunda prova
            String inputProva2 = JOptionPane.showInputDialog(null, "Digite a nota da segunda prova:");
            double notaProva2 = Double.parseDouble(inputProva2);

            // Solicita a nota do trabalho
            String inputTrabalho = JOptionPane.showInputDialog(null, "Digite a nota do trabalho:");
            double notaTrabalho = Double.parseDouble(inputTrabalho);

            // Calcula a média
            double media = (notaProva1 + notaProva2 + notaTrabalho) / 3.0;

            // Determina o resultado final
            String resultado;
            if (media >= 6.0) {
                resultado = "Aprovado(a)!";
            } else {
                resultado = "Reprovado(a).";
            }

            // Monta a mensagem final para exibição
            String mensagem = String.format(
                "--- Resultado do Aluno ---\n\n" +
                "Nota da 1ª Prova: %.2f\n" +
                "Nota da 2ª Prova: %.2f\n" +
                "Nota do Trabalho: %.2f\n\n" +
                "Média Final: %.2f\n" +
                "Situação: %s",
                notaProva1, notaProva2, notaTrabalho, media, resultado
            );

            // Exibe o resultado em uma caixa de diálogo
            JOptionPane.showMessageDialog(null, mensagem);

        } catch (NumberFormatException e) {
            // Trata o erro se o usuário não digitar um número
            JOptionPane.showMessageDialog(null, "Erro: Por favor, digite apenas números válidos para as notas.", "Erro", JOptionPane.ERROR_MESSAGE);
        } catch (NullPointerException e) {
            // Trata o erro se o usuário cancelar a operação
            JOptionPane.showMessageDialog(null, "Operação cancelada.", "Aviso", JOptionPane.WARNING_MESSAGE);
        }
    }
}