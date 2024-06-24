import java.text.DecimalFormat;
import java.util.Scanner;

public class AjustePrecosFarmacia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##"); // Formato para arredondamento

        while (true) {
            // Solicitar o valor do produto ao usuário
            System.out.print("Digite o valor do produto (ou 0 para encerrar): ");
            double valorProduto = scanner.nextDouble();

            if (valorProduto == 0) {
                System.out.println("Programa encerrado.");
                break; // Encerrar o programa se o valor for zero
            }

            // Calcular o novo preço com aumento de 12%
            double novoPreco = valorProduto * 1.12;

            // Arredondar o resultado para duas casas decimais
            novoPreco = Double.parseDouble(df.format(novoPreco));

            // Exibir o novo preço
            System.out.println("Novo preço com aumento de 12%: R$" + novoPreco);
        }

        scanner.close();
    }
}
