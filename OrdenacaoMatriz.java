import java.util.Random;
import java.util.Arrays;

public class OrdenacaoMatriz {
    public static void main(String[] args) {
        int[][] matriz = new int[4][4];
        Random random = new Random();

        System.out.println("Matriz:");
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                matriz[i][j] = random.nextInt(100);
                System.out.print("\t" + matriz[i][j]);
            }
            System.out.println();
        }

        int[] vetor = new int[16];
        int index = 0;
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                vetor[index++] = matriz[i][j];
            }
        }

        Arrays.sort(vetor);

        System.out.println("\nVetor ordenado:");
        for(int i = 0; i < vetor.length; i++){
            System.out.print(" " + vetor[i]);
        }

        index = 0;
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                matriz[i][j] = vetor[index++];
            }
        }

        System.out.println("\n\nMatriz ordenada:");
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                System.out.print("\t" + matriz[i][j]);
            }
            System.out.println();
        }
    }
}
