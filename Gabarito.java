import java.util.Scanner;

public class Gabarito {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        char[][] respostasAlunos = new char[5][10];
        char[] gabarito = new char[10];
        int[] resultado = new int[5];

        System.out.println("As informações do gabarito devem ser inseridas assim:");
        System.out.println("abcdadcdaa");

        for (int i = 0; i < 5; i++) {
            System.out.println("Digite as respostas do aluno " + (i + 1) + " (10 respostas no formato a, b, c ou d):");
            String respostas = ler.nextLine();
            if (respostas.length() != 10) {
                System.out.println("Respostas devem ter 10 caracteres.");
                i--; 
                continue;
            }
            respostasAlunos[i] = respostas.toCharArray();
        }

        System.out.println("Digite o gabarito (10 respostas no formato a, b, c ou d):");
        String gabaritoInput = ler.nextLine();
        if (gabaritoInput.length() != 10) {
            System.out.println("Gabarito deve ter 10 caracteres.");
            return;
        }
        gabarito = gabaritoInput.toCharArray();

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                if (respostasAlunos[i][j] == gabarito[j]) {
                    resultado[i]++;
                }
            }
        }

        System.out.println("Pontuações dos alunos:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Aluno " + (i + 1) + ": " + resultado[i] + " pontos");
        }
        ler.close();
    }
}
