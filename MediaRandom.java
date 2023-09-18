import java.util.Random;

public class MediaRandom {
    public static void main(String[] args) { 
        int[] vetor = new int[10];
        Random random = new Random();
        int soma = 0;

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = random.nextInt(100);
        }
        

        for (int i = 0; i < vetor.length; i++) {
            soma += vetor[i];
        }
        
        double media = (double) soma / vetor.length;
        

        System.out.print("Vetor: ");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println("\nMédia: " + media);
    }
}
