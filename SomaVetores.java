public class SomaVetores {
    public static void main(String[] args) {
        int valor_1[] = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        int valor_2[] = {100, 90, 80, 70, 60, 50, 40, 30, 20, 10};
        int[] valor_da_soma = new int[10];

        for (int posicao = 0; posicao < 10; posicao++) {
            valor_da_soma[posicao] = valor_1[posicao] + valor_2[posicao];
        }

        for (int posicao = 0; posicao < valor_da_soma.length; posicao++) {
            System.out.println(valor_da_soma[posicao]);
        }
    }
}
