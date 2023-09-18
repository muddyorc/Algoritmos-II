import java.util.Random;

public class SomaVetor {
    public static void main(String[] args) {
        int[] vetor1 = new int[15];
        int[] vetor2 = new int[15];
        int[] vetorSoma = new int[15];
        Random random = new Random();

        for (int i = 0; i < vetor1.length; i++) {
            vetor1[i] = random.nextInt(100);
            vetor2[i] = random.nextInt(100);
        }

        for (int i = 0; i < vetor1.length; i++) {
            vetorSoma[i] = vetor1[i] + vetor2[i];
        }

        System.out.println("Vetor 1: ");
        imprimirVetor(vetor1);
        
        System.out.println("Vetor 2: ");
        imprimirVetor(vetor2);
        
        System.out.println("Vetor Soma: ");
        imprimirVetor(vetorSoma);
    }

    public static void imprimirVetor(int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();
    }
}
