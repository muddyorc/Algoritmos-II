public class MediaAlunos {
    public static void main(String[]args) {
        Double[] nota = {10.0, 75.5, 23.2, 60.0, 100.0};
        int nota_media = 0;

        for(int contador = 0; contador < 5; contador++){
            if(nota[contador] >= 60.0){
                nota_media += 1;
            }
        }
        System.out.printf("O total de alunos com nota média é: %d", nota_media);
    }
}