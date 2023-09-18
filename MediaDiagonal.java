import java.util.Random;

public class MediaDiagonal {
    public static void main(String[] args) {
        int[][] matriz = new int[6][6];
        Random random = new Random();

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = random.nextInt(100); 
            }
        }

        double mediaDiagonalPrincipal = 0;
        for (int i = 0; i < matriz.length; i++) {
            mediaDiagonalPrincipal += matriz[i][i];
        }
        mediaDiagonalPrincipal /= matriz.length;

        double mediaDiagonalSecundaria = 0;
        for (int i = 0; i < matriz.length; i++) {
            mediaDiagonalSecundaria += matriz[i][matriz.length - 1 - i];
        }
        mediaDiagonalSecundaria /= matriz.length;

        System.out.println("Média da Diagonal Principal: " + mediaDiagonalPrincipal);
        System.out.println("Média da Diagonal Secundária: " + mediaDiagonalSecundaria);
    }
}
