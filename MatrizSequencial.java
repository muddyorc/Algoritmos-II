public class MatrizSequencial {
    public static void main(String[] args) {
        int[][] matriz = new int[5][5];
        int valor = 1;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j <matriz.length; j++) {
                matriz[i][j] = valor;
                if (valor < 5) {
                    valor++;
                } else {
                    valor = 1;
                }
            }
        }

        for (int i = 0; i <matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
