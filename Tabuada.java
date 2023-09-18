import java.util.Scanner;

public class Tabuada {
    public static void main(String[]args){
        Scanner ler = new Scanner(System.in);
        int[] valor_tabuada = new int[11];
        int tabuada = 0;

        System.out.println("Insira um valor para a tabuada: ");
        tabuada = ler.nextInt();

        for(int contador = 1; contador <= 10; contador++){
            valor_tabuada[contador] = contador * tabuada;
        }
        for(int contador = 1; contador <= 10; contador++){
            System.out.printf("Os valores são:%d \n", valor_tabuada[contador]);
        }
        ler.close();
    }
}
