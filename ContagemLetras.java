import java.util.Scanner;
import java.util.Random;

public class ContagemLetras {
    public static void main(String[]args){
        Scanner ler = new Scanner(System.in);
        char[][] matriz_letras = new char[5][5];
        Random letra = new Random();
        char letra_user = ' ';
        int contador = 0;

        System.out.println("Digite uma letra de sua escolha: ");
        letra_user = ler.next().charAt(0);

        for(int i = 0; i < matriz_letras.length; i++){
            for(int j = 0; j < matriz_letras.length; j++){
                matriz_letras[i][j] = (char)('a' + letra.nextInt(26));
                if(letra_user == matriz_letras[i][j]){
                    contador++;
                }
            }
        }
        for (int i = 0; i <matriz_letras.length; i++) {
            for (int j = 0; j < matriz_letras.length; j++) {
                System.out.print(matriz_letras[i][j] + "  ");
            }
        }
        System.out.println();
        System.out.printf("Tem no total %d letra %c\n", contador, letra_user);
        ler.close();
    }
}
