import java.util.Scanner;

public class JogoVelha {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String[][] matriz = new String[3][3];
        String name_1, name_2;
        int vencedor = 0;

        System.out.println("Insira o nome do Jogador 1: ");
        name_1 = ler.nextLine();
        System.out.println("Insira o nome do Jogador 2: ");
        name_2 = ler.nextLine();
        System.out.println("As posições de jogo são:");
        System.out.println("00 01 02\n10 11 12\n20 21 22");

        int jogadas = 0;
        boolean vitoria = false;

        while (jogadas < 9 && !vitoria) {
            int y_Linha, x_Coluna;

            if (jogadas % 2 == 0) {
                System.out.println("Vez do Jogador: " + name_1);
            } else {
                System.out.println("Vez do Jogador: " + name_2);
            }

            System.out.println("Insira a posição a em que vai jogar de X: ");
            x_Coluna = ler.nextInt();
            System.out.println("Insira a posição a em que vai jogar de Y: ");
            y_Linha = ler.nextInt();

            if (matriz[y_Linha][x_Coluna] == null) {
                matriz[y_Linha][x_Coluna] = jogadas % 2 == 0 ? "x" : "o";
                jogadas++;
            } else {
                System.out.println("Posição já ocupada. Tente novamente.");
            }

            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
                    if (matriz[i][j] == null) {
                        System.out.print("-\t");
                } else {
                        System.out.print(matriz[i][j] + "\t");
                }
            }
            System.out.println();
        }

            if (jogadas >= 5) {
                if (matriz[y_Linha][0] != null && matriz[y_Linha][0].equals(matriz[y_Linha][1]) && matriz[y_Linha][1].equals(matriz[y_Linha][2])) {
                    vitoria = true;
                    vencedor = jogadas % 2 == 0 ? 2 : 1;
                } else if (matriz[0][x_Coluna] != null && matriz[0][x_Coluna].equals(matriz[1][x_Coluna]) && matriz[1][x_Coluna].equals(matriz[2][x_Coluna])) {
                    vitoria = true;
                    vencedor = jogadas % 2 == 0 ? 2 : 1;
                } else if (y_Linha == x_Coluna && matriz[0][0] != null && matriz[0][0].equals(matriz[1][1]) && matriz[1][1].equals(matriz[2][2])) {
                    vitoria = true;
                    vencedor = jogadas % 2 == 0 ? 2 : 1;
                } else if (y_Linha + x_Coluna == 2 && matriz[0][2] != null && matriz[0][2].equals(matriz[1][1]) && matriz[1][1].equals(matriz[2][0])) {
                    vitoria = true;
                    vencedor = jogadas % 2 == 0 ? 2 : 1;
                }
            }
        }

        System.out.println();

        if (vencedor == 1) {
            System.out.println("O vencedor é: " + name_1);
        } else if (vencedor == 2) {
            System.out.println("O vencedor é: " + name_2);
        } else {
            System.out.println("Empate!");
        }
        ler.close();
    }
}
