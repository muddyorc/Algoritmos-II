import java.util.Scanner;

public class VetorAdaptavel {
    public static void main(String[]args){
        Scanner ler = new Scanner(System.in);
        String letras = " ";
        char[] vetor_letras = new char[10];

        System.out.println("Insira uma informação que contenha no máximo 10 letras: ");
        letras = ler.nextLine();

        for(int i = 0; i < vetor_letras.length; i++){
            if(letras.length() <= 10){
                char posicao = letras.charAt(i);
                if(posicao == ' '){
                     vetor_letras[i] = '.';
                }else{
                    vetor_letras[i] = posicao;
                }
            }else{
                System.out.print("valores invalidos!");
                break;
            }
        }

        for(int i = 0; i < vetor_letras.length; i++){
            System.out.printf("%c\t", vetor_letras[i]);
        }
        ler.close();
    }
}
