import java.util.Random;

public class MatrizPar {
    public static void main(String[] args) {
        int[][] matriz = new int[8][8];
        Random random = new Random();

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = random.nextInt(100);
            }
        }

        System.out.println("Valores onde a linha e a coluna são pares:");
        for (int i = 0; i <matriz.length; i += 2) {
            for (int j = 0; j < matriz.length; j += 2) {
                System.out.print(matriz[i][j] + "\t ");
            }
            System.out.println();
        }
    }
}
