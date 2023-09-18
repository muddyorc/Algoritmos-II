public class ContadorCrescente {
    public static void main(String[] args) {
        int nota[] = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        for (int contador = nota.length - 1; contador >= 0; contador--) {
            System.out.println(nota[contador]);
        }
    }
}
