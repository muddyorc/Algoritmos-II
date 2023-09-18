import java.util.Scanner;

public class CalculoIPTU {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int quantidadeImoveis = 0;
        double somatorioImpostoOriginal = 0;
        double somatorioMulta = 0;
        double somatorioJuros = 0;
        double somatorioTotal = 0;

        do {
            System.out.print("Informe o número do imóvel: ");
            int numero = ler.nextInt();

            System.out.print("Informe o valor do IPTU: ");
            double valorIPTU = ler.nextDouble();

            System.out.print("Informe o número de meses em atraso: ");
            int mesesAtraso = ler.nextInt();

            double multa = valorIPTU * 0.02;
            double juros = valorIPTU * 0.015 * mesesAtraso;
            double valorTotal = valorIPTU + multa + juros;

            quantidadeImoveis++;
            somatorioImpostoOriginal += valorIPTU;
            somatorioMulta += multa;
            somatorioJuros += juros;
            somatorioTotal += valorTotal;

            System.out.println("Imóvel processado com sucesso.");
            System.out.print("Deseja inserir mais imóveis? (S/N): ");
            String continuar = ler.next();

            if (!continuar.equalsIgnoreCase("S")) {
                break;
            }
        } while (true);

        System.out.println(" ");
        System.out.println("Quantidade de imóveis inseridos: " + quantidadeImoveis);
        System.out.println("Somatório do imposto original: " + somatorioImpostoOriginal);
        System.out.println("Somatório da multa: " + somatorioMulta);
        System.out.println("Somatório dos juros: " + somatorioJuros);
        System.out.println("Somatório do valor total (com juros e multa): " + somatorioTotal);

        ler.close();
    }
}
